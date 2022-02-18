import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
import 'package:splash_screen/providers/linea_comanda_provider.dart';
import 'package:splash_screen/widgets/linea_comanda_widget.dart';

class ComandaWidget extends StatefulWidget {
  final List<Comanda> comandas;
  ComandaWidget({required this.comandas});

  @override
  State<ComandaWidget> createState() => _ComandaWidgetState();
}

class _ComandaWidgetState extends State<ComandaWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Column(children: [
          Card(
            color: Colors.grey[300],
            child: InkWell(
              onTap: () => Navigator.pushNamed(context, 'comanda_page',
                  arguments: widget.comandas[index]),
              child: Padding(
                padding: EdgeInsets.all(15),
                child: Row(
                  children: [
                    Expanded(
                        child: Text(
                      'Comanda ' + widget.comandas[index].id.toString(),
                      style: TextStyle(
                        fontFamily: 'Enriqueta',
                        fontSize: 35,
                      ),
                    )),
                  ],
                ),
              ),
            ),
          ),
        ]);
      },
      itemCount: widget.comandas.length,
    );
  }

  Widget _swiperLineasComandas(Comanda comanda) {
    final lineaComandaProvider = LineaComandaProvider();
    return FutureBuilder(
      future: lineaComandaProvider
          .getlineasComandaByComandaId(comanda.id.toString()),
      builder:
          (BuildContext context, AsyncSnapshot<List<LineaComanda>> snapshot) {
        if (snapshot.hasData) {
          return LineaComandaWidget(lineas: snapshot.data!);
        } else {
          return Container(
              height: 350, child: Center(child: CircularProgressIndicator()));
        }
      },
    );
  }
}
