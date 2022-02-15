import 'package:flutter/material.dart';
import 'package:splash_screen/models/mesa_model.dart';

class MesaPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final Mesa mesa = ModalRoute.of(context)!.settings.arguments as Mesa;
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          'Mesa ' + mesa.id.toString(),
          style: TextStyle(fontFamily: 'Enriqueta', fontSize: 70),
        ),
      ),
      body: Text(mesa.estado.toString()),
    );
  }
}
