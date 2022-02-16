import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';

class ComandaPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final Comanda comanda =
        ModalRoute.of(context)!.settings.arguments as Comanda;
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          'Comanda ' + comanda.id.toString(),
          style: TextStyle(
            fontFamily: 'Enriqueta',
            fontSize: 70,
          ),
        ),
        centerTitle: true,
      ),
      body: Text(comanda.lineaComanda.toString()),
    );
  }
}
