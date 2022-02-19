import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:splash_screen/models/camarero_model.dart';

class CamareroProvider {
  String _url = "192.168.3.3:8080";
  List<Camarero> _camareros = [];

  final _camareroStreamController = StreamController<List<Camarero>>();
  Function(List<Camarero>) get camarerosSink =>
      _camareroStreamController.sink.add;
  Stream<List<Camarero>> get camareroStream => _camareroStreamController.stream;
  void disposesStream() {
    _camareroStreamController.close();
  }

  Future<List<Camarero>> _procesarRespuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    final camareros = Camareros.fromJsonList(decodedData);
    return camareros.camareros;
  }

  Future<List<Camarero>> getCamareros() async {
    final url = Uri.http(_url, '/camareros');
    return await _procesarRespuesta(url);
  }
}
