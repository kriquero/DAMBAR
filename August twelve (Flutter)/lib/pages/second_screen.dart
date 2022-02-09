import 'package:flutter/material.dart';

class SecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Preuba")),
      body: Center(
          child: Text(
        "Cacatua",
        textScaleFactor: 2,
      )),
    );
  }
}
