import 'camarero_model.dart';
import 'mesa_model.dart';

class Comandas {
  List<Comanda> comandas = [];

  Comandas();
  Comandas.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final comanda = new Comanda.fromJsonMap(element);
      comandas.add(comanda);
    });
  }
}

class Comanda {
  int? id = 0;
  bool? pagado = false;
  String? fechaPedido;
  Camarero? camarero;
  int? camareroId;
  List? lineasComanda;

  Comanda(
      {required this.id,
      required this.pagado,
      required this.fechaPedido,
      required this.camarero,
      required this.camareroId,
      required this.lineasComanda});
  Comanda.fromJsonMap(Map<String, dynamic> json) {
    id = json['idComanda'];
    pagado = json['pagado'];
    fechaPedido = json['fechaPedido'];
    camarero = json['camarero'];
    camareroId = json['camareroId'];
    lineasComanda = json['lineaComandas'];
  }
}
