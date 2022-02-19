import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
import 'package:splash_screen/providers/linea_comanda_provider.dart';
import 'package:splash_screen/widgets/linea_comanda_widget.dart';

class ComandaWidget extends StatefulWidget {
  final List<Comanda> comandas;
  final ValueChanged<String> parentAction;
  ComandaWidget({required this.comandas, required this.parentAction});

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
            child: InkWell(
              onTap: () => Navigator.pushNamed(context, 'comanda_page',
                      arguments: widget.comandas[index])
                  .then((value) => widget.parentAction("update")),
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
}
