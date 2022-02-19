import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
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
    final lp = LineaComandaProvider();
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Card(
          child: Row(
            children: [
              Text(
                widget.lineas[index].producto!.nombre.toString(),
                style: TextStyle(
                  fontFamily: 'Enriqueta',
                  fontSize: 30,
                ),
              ),
              Expanded(
                child: Padding(
                  padding: const EdgeInsets.all(25),
                  child: Text(
                    widget.lineas[index].cantidad.toString(),
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 30,
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
                      prueba(widget.lineas[index], 1);
                    },
                  ),
                  TextButton(
                    child: Icon(
                      Icons.remove_circle,
                      color: Colors.red,
                      size: 50,
                    ),
                    onPressed: () {
                      prueba(widget.lineas[index], -1);
                    },
                  ),
                ]),
              ),
            ],
          ),
        );
      },
      itemCount: widget.lineas.length,
    );
  }

  prueba(LineaComanda linea, int suma) {
    final lp = LineaComandaProvider();

    if (linea.cantidad! <= 1 && suma <= 0) {
      lp
          .deleteLinea(widget.comanda.id.toString(), linea.id.toString())
          .then((value) => {widget.parentAction("Update")});
    } else {
      lp
          .updateLinea(linea.id.toString(), (linea.cantidad! + suma).toString())
          .then((value) => {widget.parentAction("Update")});
    }
  }
}
