import 'package:flutter/material.dart';
import 'package:splash_screen/models/mesa_model.dart';

class MesaWidget extends StatefulWidget {
  final List<Mesa> mesas;
  MesaWidget({required this.mesas});

  @override
  State<MesaWidget> createState() => _MesaWidgetState();
}

class _MesaWidgetState extends State<MesaWidget> {
  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Card(
          color: Colors.grey[300],
          child: InkWell(
            onTap: () => Navigator.pushNamed(context, 'mesa_page',
                arguments: widget.mesas[index]),
            child: Padding(
              padding: EdgeInsets.all(15),
              child: Row(
                children: [
                  Expanded(
                      child: Text(
                    'Mesa ' + widget.mesas[index].id.toString(),
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 35,
                    ),
                  )),
                  Icon(
                    Icons.brightness_1,
                    color: color(widget.mesas[index].estado.toString()),
                    size: 35,
                  ),
                ],
              ),
            ),
          ),
        );
      },
      itemCount: widget.mesas.length,
    );
  }

  color(String estado) {
    Color ret = Colors.grey;
    switch (estado) {
      case "Libre":
        ret = Colors.green;
        break;
      case "Ocupada":
        ret = Colors.red;
        break;
      case "Reservada":
        ret = Colors.yellow;
        break;
    }
    return ret;
  }
}
