import 'package:splash_screen/models/producto_model.dart';

import 'comanda_model.dart';
import 'mesa_model.dart';

class Cast {
  List<LineaComanda> camareros = [];

  Cast();
  Cast.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final linea = new LineaComanda.fromJsonMap(element);
      camareros.add(linea);
    });
  }
}

class LineaComanda {
  int? id = 0;
  Producto? producto;
  Comanda? comanda;
  int? cantidad = 0;
  LineaComanda(
      {required this.id,
      required this.producto,
      required this.comanda,
      required this.cantidad});
  LineaComanda.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    producto = json['producto'];
    comanda = json['comanda'];
    cantidad = json['cantidad'];
  }
}
