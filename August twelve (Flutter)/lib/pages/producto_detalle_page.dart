import 'package:flutter/material.dart';
import 'package:splash_screen/models/producto_model.dart';

class ProductoDetallePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    final Producto producto =
        ModalRoute.of(context)!.settings.arguments as Producto;
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          producto.nombre.toString(),
          style: TextStyle(fontFamily: 'Enriqueta', fontSize: 30),
        ),
        centerTitle: true,
      ),
      body: Center(
        child: Column(children: [
          ClipRRect(
            child: FadeInImage(
              image: NetworkImage(producto.foto.toString()),
              placeholder: AssetImage('assets/images/loading.gif'),
              fadeInDuration: Duration(milliseconds: 150),
              height: 250,
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20),
            child: Text(
              producto.tipo.toString(),
              style: TextStyle(
                  fontFamily: 'Enriqueta',
                  fontWeight: FontWeight.bold,
                  fontSize: 25,
                  decoration: TextDecoration.underline),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20),
            child: Text(
              producto.descripcion.toString(),
              style: TextStyle(fontFamily: 'Enriqueta', fontSize: 20),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(20),
            child: Row(children: [
              Expanded(
                child: Text(
                  'Precio: ' + producto.precio.toString() + '€',
                  style: TextStyle(fontFamily: 'Enriqueta', fontSize: 20),
                ),
              )
            ]),
          )
        ]),
      ),
    );
  }
}
