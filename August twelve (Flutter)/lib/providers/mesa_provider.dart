import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;

import 'package:splash_screen/models/mesa_model.dart';

class MesaProvider {
  String _url = "192.168.1.6:8080";
  List<Mesa> _mesas = [];

  final _mesaStreamController = StreamController<List<Mesa>>();
  Function(List<Mesa>) get mesasSink => _mesaStreamController.sink.add;
  Stream<List<Mesa>> get mesaStream => _mesaStreamController.stream;
  void disposesStream() {
    _mesaStreamController.close();
  }

  Future<List<Mesa>> _procesarRespuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    final mesas = Mesas.fromJsonList(decodedData);
    return mesas.mesas;
  }

  Future<List<Mesa>> getMesas() async {
    final url = Uri.http(_url, '/mesas');
    return await _procesarRespuesta(url);
  }

  //Ejemplo de post
  Future<http.Response> createMesa(String estado) {
    return http.post(Uri.parse('http://' + _url + "/mesas"),
        headers: <String, String>{
          'content-Type': 'application/json; charset=UTF-8'
        },
        body: jsonEncode(<String, String>{'estado': estado}));
  }

  //Ejemplo de delete
  Future<http.Response> deleteMesa(String id) async {
    final http.Response response = await http.delete(
      Uri.parse('http://' + _url + '/mesas/$id'),
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
    );
    return response;
  }

  //Ejemplo de put
  Future<http.Response> updateMesa(String estado, String id) {
    return http.put(Uri.parse('http://' + _url + "/mesas/$id"),
        headers: <String, String>{
          'content-Type': 'application/json; charset=UTF-8'
        },
        body: jsonEncode(<String, String>{'estado': estado}));
  }
}
