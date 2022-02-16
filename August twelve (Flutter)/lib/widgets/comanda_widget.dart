import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';

class ComandaWidget extends StatelessWidget {
  final List<Comanda> comandas;
  ComandaWidget({required this.comandas});

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Card(
          color: Colors.grey[300],
          child: InkWell(
            onTap: () => Navigator.pushNamed(context, 'comanda_page',
                arguments: comandas[index]),
            child: Padding(
              padding: EdgeInsets.all(15),
              child: Row(
                children: [
                  Expanded(
                      child: Text(
                    'Comanda ' + comandas[index].id.toString(),
                    style: TextStyle(
                      fontFamily: 'Enriqueta',
                      fontSize: 35,
                    ),
                  )),
                ],
              ),
            ),
          ),
        );
      },
      itemCount: comandas.length,
    );
  }
}
