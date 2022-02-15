import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:splash_screen/models/comanda_model.dart';

class ComandaProvider {
  String _url = "192.168.1.6:8080";
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
}
