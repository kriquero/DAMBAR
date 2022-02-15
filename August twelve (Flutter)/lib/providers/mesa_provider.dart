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
    final mesas =
        Mesas.fromJsonList(decodedData); //aqui no se que hay que poner
    return mesas.mesas;
  }

  Future<List<Mesa>> getMesas() async {
    final url = Uri.http(_url, '/mesas');
    return await _procesarRespuesta(url);
  }
}
