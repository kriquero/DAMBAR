import 'mesa_model.dart';

class Cast {
  List<Camarero> camareros = [];

  Cast();
  Cast.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final camarero = new Camarero.fromJsonMap(element);
      camareros.add(camarero);
    });
  }
}

class Camarero {
  int? id = 0;
  String? nombre = "";
  String? puesto = "";
  DateTime? fechaInicio;
  String? telefono = "";
  List? comandas;
  Camarero(
      {required this.id,
      required this.nombre,
      required this.puesto,
      required this.fechaInicio,
      required this.telefono,
      required this.comandas});
  Camarero.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    nombre = json['nombre'];
    puesto = json['puesto'];
    fechaInicio = json['fechaInicio'];
    telefono = json['telefono'];
    comandas = json['comandas'];
  }
}
