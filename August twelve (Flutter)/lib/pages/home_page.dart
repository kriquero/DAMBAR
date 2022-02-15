import 'package:flutter/material.dart';
import 'package:splash_screen/models/mesa_model.dart';
import 'package:splash_screen/providers/mesa_provider.dart';
import 'package:splash_screen/widgets/mesa.dart';

class HomePage extends StatelessWidget {
  final mesaProvider = MesaProvider();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        toolbarHeight: 100,
        title: Text(
          "Mesas",
          style: TextStyle(fontFamily: 'Enriqueta', fontSize: 70),
        ),
        centerTitle: true,
      ),
      body: Center(
        child: _swiperMesas(),
      ),
    );
  }

  Widget _swiperMesas() {
    return FutureBuilder(
      future: mesaProvider.getMesas(),
      builder: (BuildContext context, AsyncSnapshot<List<Mesa>> snapshot) {
        if (snapshot.hasData) {
          print(snapshot.data!);
          return Text('data');
        } else {
          return Container(
              height: 350, child: Center(child: CircularProgressIndicator()));
        }
      },
    );
  }
}
