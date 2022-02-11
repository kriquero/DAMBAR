import 'dart:async';
import 'package:flutter/material.dart';
import 'package:splash_screen/pages/home_page.dart';
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
      ),
      darkTheme: ThemeData(
        brightness: Brightness.dark,
        primarySwatch: Palette.kToDark,
        backgroundColor: Colors.grey[800],
      ),
      themeMode: ThemeMode.system,
      home: HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}
