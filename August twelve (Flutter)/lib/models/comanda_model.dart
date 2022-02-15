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
  int? codigoMesa = 0;
  int? codigoCamarero = 0;
  DateTime? fechaPedido;
  Mesa? mesa;
  Camarero? camarero;
  List? lineaComanda;

  Comanda(
      {required this.id,
      required this.pagado,
      required this.codigoMesa,
      required this.codigoCamarero,
      required this.fechaPedido,
      required this.mesa,
      required this.camarero,
      required this.lineaComanda});
  Comanda.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    pagado = json['pagado'];
    codigoMesa = json['codigoMesa'];
    codigoCamarero = json['codigoCamarero'];
    fechaPedido = json['fechaPedido'];
    mesa = json['mesa'];
    camarero = json['camarero'];
    lineaComanda = json['lineaComanda'];
  }
}
