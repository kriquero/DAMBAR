import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
import 'package:splash_screen/pcolors/palette.dart';
import 'package:splash_screen/providers/comanda_provider.dart';
import 'package:splash_screen/providers/linea_comanda_provider.dart';
import 'package:splash_screen/widgets/linea_comanda_widget.dart';

class ComandaPage extends StatefulWidget {
  @override
  State<ComandaPage> createState() => _ComandaPageState();
}

class _ComandaPageState extends State<ComandaPage> {
  @override
  Widget build(BuildContext context) {
    final Comanda comanda =
        ModalRoute.of(context)!.settings.arguments as Comanda;
    final comandaProvider = ComandaProvider();
    return Scaffold(
        floatingActionButtonLocation:
            FloatingActionButtonLocation.miniStartFloat,
        floatingActionButton: Stack(
          fit: StackFit.expand,
          children: [
            Positioned(
              left: 30,
              bottom: 20,
              child: FloatingActionButton(
                backgroundColor: Colors.red,
                heroTag: 'DeleteComanda',
                onPressed: () {
                  comandaProvider
                      .deleteComanda(comanda.id.toString())
                      .then((value) => Navigator.of(context).pop(true));
                },
                child: const Icon(
                  Icons.remove,
                  size: 40,
                ),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(100),
                ),
              ),
            ),
            Positioned(
              bottom: 20,
              right: 30,
              child: FloatingActionButton(
                backgroundColor: Palette.kToDark,
                heroTag: 'addProducto',
                onPressed: () {
                  Navigator.pushNamed(context, 'add_producto_page',
                          arguments: comanda)
                      .then((value) => _update(''));
                },
                child: const Icon(
                  Icons.add_rounded,
                  size: 40,
                ),
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(100),
                ),
              ),
            ),
          ],
        ),
        appBar: AppBar(
          toolbarHeight: 100,
          title: Text(
            'Comanda ' + comanda.id.toString(),
            style: TextStyle(
              fontFamily: 'Enriqueta',
              fontSize: 50,
            ),
          ),
          centerTitle: true,
        ),
        body: _swiperLineasComandas(comanda));
  }

  Widget _swiperLineasComandas(Comanda comanda) {
    final lineaComandaProvider = LineaComandaProvider();
    return FutureBuilder(
      future: lineaComandaProvider
          .getlineasComandaByComandaId(comanda.id.toString()),
      builder:
          (BuildContext context, AsyncSnapshot<List<LineaComanda>> snapshot) {
        if (snapshot.hasData) {
          return LineaComandaWidget(
            lineas: snapshot.data!,
            comanda: comanda,
            parentAction: _update,
          );
        } else {
          return Container(
              height: 350, child: Center(child: CircularProgressIndicator()));
        }
      },
    );
  }

  _update(String text) {
    setState(() {});
  }
}
