String err1() {
 return "¿Dónde está el error?";
 }
err1()
String err2() {
 return "¿String o string?";
 }
err2()
 String err3(String who) {
 return String.format("%s, cuál es el error?", who);
 }
err3("falta  String")
 String err4() {
 return "Este es un error sutil";
 }
err4()
String err5() {
 return "Es es un poco menos sutil";
 }
err5()