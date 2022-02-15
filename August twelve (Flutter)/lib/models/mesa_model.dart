class Mesas {
  List<Mesa> mesas = [];

  Mesas();
  Mesas.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final mesa = new Mesa.fromJsonMap(element);
      mesas.add(mesa);
    });
  }
}

class Mesa {
  int? id = 0;
  String? estado = "";

  Mesa({
    required this.id,
    required this.estado,
  });
  Mesa.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    estado = json['estado'];
  }
}
