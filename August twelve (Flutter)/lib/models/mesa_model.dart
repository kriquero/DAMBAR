class Cast {
  List<Mesa> actores = [];

  Cast();
  Cast.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final actor = new Mesa.fromJsonMap(element);
      actores.add(actor);
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
