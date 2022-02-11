import 'package:flutter/material.dart';

class mesa extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Row(
      children: [
        Container(margin: const EdgeInsets.only(left: 20.0, right: 20.0)),
        const Text(
          "Mesa",
          style: TextStyle(
            fontSize: 20,
          ),
        ),
        Icon(
          const IconData(0xf0570, fontFamily: 'MaterialIcons'),
          color: Colors.red[500],
        ),
      ],
    );
  }
}
