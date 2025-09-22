boolean validarMúltiploDe7(int number) {
    return (number >= 7 && number < 1000 ) ? number % 7 == 0 : false ;
}
validarMúltiploDe7(-7)
validarMúltiploDe7(0)
validarMúltiploDe7(91)
validarMúltiploDe7(9100)