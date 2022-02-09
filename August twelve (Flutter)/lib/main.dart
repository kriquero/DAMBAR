import 'dart:async';
import 'package:flutter/material.dart';
import 'package:splash_screen/pages/second_screen.dart';
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
        primarySwatch: Colors.red,
        backgroundColor: Colors.grey[800],
      ),
      themeMode: ThemeMode.system,
      home: MyHomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  void initState() {
    super.initState();
    Timer(
        Duration(seconds: 3),
        () => Navigator.pushReplacement(
            context, MaterialPageRoute(builder: (context) => SecondScreen())));
  }

  @override
  Widget build(BuildContext context) {
    return Container(
        padding: EdgeInsets.only(top: 200, left: 20, right: 20),
        color: Theme.of(context).colorScheme.background,
        child: Column(
          children: [
            Image.asset(
              'assets/images/logo.png',
              color: Colors.white.withOpacity(0.85),
              colorBlendMode: BlendMode.modulate,
            ),
            Text(
              'August Twelve',
              style: TextStyle(
                fontFamily: "CinzelDecorative",
                color: Colors.white,
                fontWeight: FontWeight.w700,
                decoration: TextDecoration.none,
                fontSize: 30,
              ),
            )
          ],
        ));
  }
}

/*class SecondScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("GeeksForGeeks")),
      body: Center(
          child: Text(
        "Home page",
        textScaleFactor: 2,
      )),
    );
  }
}*/
