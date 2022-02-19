import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:splash_screen/models/comanda_model.dart';
import 'package:splash_screen/models/producto_model.dart';

class ComandaProvider {
  String _url = "192.168.3.3:8080";
  List<Comanda> _comandas = [];

  final _comandaStreamController = StreamController<List<Comanda>>();
  Function(List<Comanda>) get comandasSink => _comandaStreamController.sink.add;
  Stream<List<Comanda>> get comandaStream => _comandaStreamController.stream;
  void disposesStream() {
    _comandaStreamController.close();
  }

  Future<List<Comanda>> _procesarRespuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    final comandas = Comandas.fromJsonList(decodedData);
    return comandas.comandas;
  }

  Future<List<Comanda>> getComandas() async {
    final url = Uri.http(_url, '/comandas');
    return await _procesarRespuesta(url);
  }

  Future<List<Comanda>> getComandasByMesaId(String mesaId) async {
    final url = Uri.http(_url, '/mesas/$mesaId/comandas');
    return await _procesarRespuesta(url);
  }

  //Delete
  Future<http.Response> deleteComanda(String id) async {
    final http.Response response = await http.delete(
      Uri.parse('http://' + _url + '/comandas/$id'),
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
    );
    return response;
  }

  Future<http.Response> addLineaComanda(String id, Producto producto) {
    return http.put(Uri.parse('http://' + _url + "/comandas/addLinea/$id"),
        headers: <String, String>{
          'content-Type': 'application/json; charset=UTF-8'
        },
        body: jsonEncode(<String, String>{
          'cantidad': '1',
          'producto': {
            'nombre': producto.nombre,
            'descripcion': producto.descripcion,
            'precio': producto.precio,
            'stock': producto.stock,
            'tipo': producto.tipo,
            'foto': producto.foto
          }
        }));
  }
}
