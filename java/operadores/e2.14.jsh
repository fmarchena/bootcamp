 double cobro(int minutos) {
    double total = minutos * 10.0;
    resultado = Math.max(100.0, total);
    resultado = Math.min(3000.0, total);
    return resultado;
}
 cobro(1)
 cobro(10)
 cobro(15)
 cobro(90)
 cobro(1000)
