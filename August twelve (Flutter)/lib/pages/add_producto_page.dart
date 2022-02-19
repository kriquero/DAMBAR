import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/producto_model.dart';
import 'package:splash_screen/providers/producto_provider.dart';
import 'package:splash_screen/widgets/producto_widget.dart';

class AddProductoPage extends StatelessWidget {
  final productoProvider = ProductoProvider();

  @override
  Widget build(BuildContext context) {
    final Comanda comanda =
        ModalRoute.of(context)!.settings.arguments as Comanda;
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          'Productos',
          style: TextStyle(
            fontFamily: 'Enriqueta',
            fontSize: 50,
          ),
        ),
        centerTitle: true,
      ),
      body: _swiperProductos(comanda),
    );
  }

  Widget _swiperProductos(Comanda comanda) {
    return FutureBuilder(
      future: productoProvider.getProductos(),
      builder: (BuildContext context, AsyncSnapshot<List<Producto>> snapshot) {
        if (snapshot.hasData) {
          return ProductoWidget(
            productos: snapshot.data!,
            comanda: comanda,
          );
        } else {
          return Container(
              height: 350, child: Center(child: CircularProgressIndicator()));
        }
      },
    );
  }
}
