import 'dart:async';
import 'dart:convert';
import 'package:http/http.dart' as http;
import 'package:splash_screen/models/linea_comanda_model.dart';

class LineaComandaProvider {
  String _url = "192.168.1.6:8080";
  List<LineaComanda> _lineasComanda = [];

  final _lineaComandaStreamController = StreamController<List<LineaComanda>>();
  Function(List<LineaComanda>) get mesasSink =>
      _lineaComandaStreamController.sink.add;
  Stream<List<LineaComanda>> get mesaStream =>
      _lineaComandaStreamController.stream;
  void disposesStream() {
    _lineaComandaStreamController.close();
  }

  Future<List<LineaComanda>> _procesarRespuesta(Uri url) async {
    final resp = await http.get(url);
    final decodedData = json.decode(resp.body);
    final lineasComanda = LineasComanda.fromJsonList(decodedData);
    return lineasComanda.lineasComanda;
  }

  Future<List<LineaComanda>> getLineasComanda() async {
    final url = Uri.http(_url, '/lineas');
    return await _procesarRespuesta(url);
  }

  Future<List<LineaComanda>> getlineasComandaByComandaId(String id) async {
    final url = Uri.http(_url, '/comandas/lineas/$id');
    return await _procesarRespuesta(url);
  }
}
