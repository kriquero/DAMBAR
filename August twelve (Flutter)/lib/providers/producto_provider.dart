import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;

import 'package:splash_screen/models/producto_model.dart';

class ProductoProvider {
  String _url = "192.168.1.6:8080";
  List<Producto> _productos = [];

  final _productoStreamController = StreamController<List<Producto>>();
  Function(List<Producto>) get productoSink =>
      _productoStreamController.sink.add;
  Stream<List<Producto>> get productoStream => _productoStreamController.stream;

  void disposesStram() {
    _productoStreamController.close();
  }

  Future<List<Producto>> _procesarRespuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    final productos = Productos.fromJsonList(decodedData);
    return productos.productos;
  }

  Future<List<Producto>> getProductos() async {
    final url = Uri.http(_url, '/productos');
    return await _procesarRespuesta(url);
  }

  Future<List<Producto>> getProductosByTipo(String tipo) async {
    final url = Uri.http(_url, '/productos/t/$tipo');
    return await _procesarRespuesta(url);
  }
}
