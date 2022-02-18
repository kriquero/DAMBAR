import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/linea_comanda_model.dart';
import 'package:splash_screen/providers/linea_comanda_provider.dart';

class LineaComandaWidget extends StatefulWidget {
  final List<LineaComanda> lineas;
  LineaComandaWidget({required this.lineas});

  @override
  State<LineaComandaWidget> createState() => _LineaComandaWidgetState();
}

class _LineaComandaWidgetState extends State<LineaComandaWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Container(
          color: Colors.grey[300],
          child: InkWell(
            //onTap: () => Navigator.pushNamed(context, 'comanda_page',
            //arguments: lineas[index]),
            child: Padding(
              padding: EdgeInsets.all(15),
              child: Row(
                children: [
                  Expanded(
                      child: Text(
                    widget.lineas[index].producto!.nombre.toString(),
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 30,
                    ),
                  )),
                  Text(
                    widget.lineas[index].cantidad.toString(),
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 30,
                    ),
                  ),
                  Expanded(
                      child: InkWell(
                    child: Icon(
                      Icons.add_circle,
                      color: Colors.green,
                      size: 30,
                    ),
                    onTap: () {
                      print('dsa');
                    },
                  )),
                  Expanded(
                      child: InkWell(
                    child: Icon(
                      Icons.remove_circle,
                      color: Colors.red,
                      size: 30,
                    ),
                    onTap: () {
                      print('dsa');
                    },
                  ))
                ],
              ),
            ),
          ),
        );
      },
      itemCount: widget.lineas.length,
    );
  }
}
