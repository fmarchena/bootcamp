 boolean validar(int inicio, int mitad , int tamaño){
        return (inicio >= 0 &&  inicio < mitad && mitad  < tamaño);
    }

validar(0, 1, 2)
validar(1, 1, 2)
validar(2, 1, 3)
validar(0, 3, 3)
validar(1, 3, 5)