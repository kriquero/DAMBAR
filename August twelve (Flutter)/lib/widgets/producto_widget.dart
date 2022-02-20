import 'package:flutter/material.dart';
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/producto_model.dart';
import 'package:splash_screen/providers/comanda_provider.dart';

class ProductoWidget extends StatelessWidget {
  final List<Producto> productos;
  final Comanda comanda;
  final ComandaProvider cp = ComandaProvider();
  ProductoWidget({required this.productos, required this.comanda});

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemBuilder: (BuildContext context, int index) {
        return Card(
          child: InkWell(
            onTap: () => Navigator.pushNamed(context, 'producto_detalle_page',
                arguments: productos[index]),
            child: Row(
              children: [
                TextButton(
                    onPressed: () {
                      cp.addLineaComanda(
                          comanda.id.toString(), productos[index]);
                    },
                    child: Icon(
                      Icons.add_circle,
                      size: 50,
                    )),
                Text(
                  productos[index].nombre.toString(),
                  style: TextStyle(fontFamily: 'Enriqueta', fontSize: 20),
                ),
              ],
            ),
          ),
        );
      },
      itemCount: productos.length,
    );
  }
}
