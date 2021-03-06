import 'dart:async';
import 'package:flutter/material.dart';
import 'package:splash_screen/pages/add_producto_page.dart';
import 'package:splash_screen/pages/comanda_page.dart';
import 'package:splash_screen/pages/home_page.dart';
import 'package:splash_screen/pages/mesa_page.dart';
import 'package:splash_screen/pages/producto_detalle_page.dart';
import 'package:splash_screen/pcolors/palette.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'August Twelve',
      theme: ThemeData(
        brightness: Brightness.light,
        primarySwatch: Palette.kToDark,
        backgroundColor: Colors.grey[300],
        cardColor: Colors.grey[200],
      ),
      darkTheme: ThemeData(
        brightness: Brightness.dark,
        primarySwatch: Palette.kToDark,
        backgroundColor: Colors.grey[800],
        cardColor: Colors.grey[800],
        bottomAppBarColor: Palette.kToDark,
      ),
      themeMode: ThemeMode.system,
      debugShowCheckedModeBanner: false,
      initialRoute: '/',
      routes: {
        '/': (BuildContext context) => HomePage(),
        'mesa_page': (BuildContext context) => MesaPage(),
        'comanda_page': (BuildContext context) => ComandaPage(),
        'add_producto_page': (BuildContext context) => AddProductoPage(),
        'producto_detalle_page': (BuildContext context) =>
            ProductoDetallePage(),
      },
    );
  }
}
