class Cast {
  List<Producto> productos = [];

  Cast();
  Cast.fromJsonList(List<dynamic> jsonList) {
    if (jsonList == null) return;
    jsonList.forEach((element) {
      final producto = new Producto.fromJsonMap(element);
      productos.add(producto);
    });
  }
}

class Producto {
  int? id = 0;
  String? nombre = "";
  double? precio = 0.0;
  int? stock = 0;
  String? tipo = "";
  String? foto = "";
  List? lineas;

  Producto(
      {required this.id,
      required this.nombre,
      required this.precio,
      required this.stock,
      required this.tipo,
      required this.foto,
      required this.lineas});
  Producto.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    nombre = json['nombre'];
    precio = json['precio'];
    stock = json['stock'];
    tipo = json['tipo'];
    foto = json['foto'];
    lineas = json['lineas'];
  }
}
