import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/mesa_model.dart';
import 'package:splash_screen/pcolors/palette.dart';
import 'package:splash_screen/providers/comanda_provider.dart';
import 'package:splash_screen/providers/mesa_provider.dart';
import 'package:splash_screen/widgets/comanda_widget.dart';
import 'package:intl/intl.dart';

class MesaPage extends StatefulWidget {
  @override
  State<MesaPage> createState() => _MesaPageState();
}

class _MesaPageState extends State<MesaPage> {
  @override
  Widget build(BuildContext context) {
    final Mesa mesa = ModalRoute.of(context)!.settings.arguments as Mesa;
    final mesaProvider = MesaProvider();
    return Scaffold(
      floatingActionButtonLocation: FloatingActionButtonLocation.endFloat,
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          mesaProvider.updateMesasComanda(mesa.id.toString());
          setState(() {
            _MesaPageState();
          });
        },
        backgroundColor: Palette.kToDark,
        child: Icon(
          Icons.add_rounded,
          size: 40,
        ),
      ),
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          'Mesa ' + mesa.id.toString(),
          style: TextStyle(fontFamily: 'Enriqueta', fontSize: 70),
        ),
        centerTitle: true,
      ),
      body: Center(
        child: _swiperComandas(mesa),
      ),
    );
  }

  Widget _swiperComandas(Mesa mesa) {
    final comandaProvider = ComandaProvider();
    return FutureBuilder(
      future: comandaProvider.getComandasByMesaId(mesa.id.toString()),
      builder: (BuildContext context, AsyncSnapshot<List<Comanda>> snapshot) {
        if (snapshot.hasData) {
          return ComandaWidget(comandas: snapshot.data!);
        } else {
          return Container(
              height: 350, child: Center(child: CircularProgressIndicator()));
        }
      },
    );
  }
}
