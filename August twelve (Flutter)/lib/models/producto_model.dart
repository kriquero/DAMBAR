class Productos {
  List<Producto> productos = [];

  Productos();
  Productos.fromJsonList(List<dynamic> jsonList) {
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
  String? descripcion = "";
  double? precio = 0.0;
  int? stock = 0;
  String? tipo = "";
  String? foto = "";

  Producto({
    required this.id,
    required this.nombre,
    required this.descripcion,
    required this.precio,
    required this.stock,
    required this.tipo,
    required this.foto,
  });
  Producto.fromJsonMap(Map<String, dynamic> json) {
    id = json['id'];
    nombre = json['nombre'];
    descripcion = json['descripcion'];
    precio = json['precio'];
    stock = json['stock'];
    tipo = json['tipo'];
    foto = json['foto'];
  }

  factory Producto.fromJson(dynamic json) {
    return Producto(
      id: json['id'] as int,
      nombre: json['nombre'] as String,
      descripcion: json['descripcion'] as String,
      precio: json['precio'] as double,
      stock: json['stock'] as int,
      tipo: json['tipo'] as String,
      foto: json['foto'] as String,
    );
  }
}
