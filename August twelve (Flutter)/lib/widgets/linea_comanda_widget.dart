import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
import 'package:splash_screen/models/producto_model.dart';
import 'package:splash_screen/providers/linea_comanda_provider.dart';

class LineaComandaWidget extends StatefulWidget {
  final ValueChanged<String> parentAction;
  final List<LineaComanda> lineas;
  final Comanda comanda;
  LineaComandaWidget(
      {required this.lineas,
      required this.parentAction,
      required this.comanda});

  @override
  State<LineaComandaWidget> createState() => _LineaComandaWidgetState();
}

class _LineaComandaWidgetState extends State<LineaComandaWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        widget.lineas.sort((a, b) => a.id!.compareTo(b.id!));
        deleteNulls(index);
        return Card(
          child: InkWell(
            onTap: () => Navigator.pushNamed(context, 'producto_detalle_page',
                arguments: widget.lineas[index].producto),
            child: Row(
              children: [
                Expanded(
                  flex: 3,
                  child: Text(
                    widget.lineas[index].producto?.nombre.toString() ?? '',
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 25,
                    ),
                  ),
                ),
                Expanded(
                  child: Padding(
                    padding: const EdgeInsets.all(25),
                    child: Text(
                      widget.lineas[index].cantidad.toString(),
                      style: TextStyle(
                        fontFamily: 'Enriqueta',
                        fontSize: 22,
                      ),
                    ),
                  ),
                ),
                Expanded(
                  child: Column(children: [
                    TextButton(
                      child: Icon(
                        Icons.add_circle,
                        color: Colors.green,
                        size: 50,
                      ),
                      onPressed: () {
                        prueba(index, 1);
                      },
                    ),
                    TextButton(
                      child: Icon(
                        Icons.remove_circle,
                        color: Colors.red,
                        size: 50,
                      ),
                      onPressed: () {
                        prueba(index, -1);
                      },
                    ),
                  ]),
                ),
              ],
            ),
          ),
        );
      },
      itemCount: widget.lineas.length,
    );
  }

  prueba(int index, int suma) {
    final lp = LineaComandaProvider();

    if (widget.lineas[index].cantidad! <= 1 && suma <= 0) {
      lp
          .deleteLinea(
              widget.comanda.id.toString(), widget.lineas[index].id.toString())
          .then((value) => {widget.parentAction("Update")});
    } else {
      lp
          .updateLinea(widget.lineas[index].id.toString(),
              (widget.lineas[index].cantidad! + suma).toString())
          .then((value) => {widget.parentAction("Update")});
    }
  }

  deleteNulls(int index) {
    final lp = LineaComandaProvider();

    if (widget.lineas[index].producto == null) {
      lp
          .deleteLinea(
              widget.comanda.id.toString(), widget.lineas[index].id.toString())
          .then((value) => {widget.parentAction("Update")});
    }
  }
}
