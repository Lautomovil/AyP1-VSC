public class AnalizadorDeMatrices {
/**
 	 * post: devuelve la cantidad de elementos de ‘matriz’ que
 	 *       tenga al menos un valor 0.
 	 */
public int contarCeros(double[][] matriz){ 
int contador = 0;
for (int i = 0; i < matriz.length; i++){
    for (int j = 0; j < matriz[i].length; j++){
        if (matriz[i][j] == 0){
            contador++;
        }
    }
}
return contador;
}
/**
 * post: devuelve la cantidad de elementos de ‘matriz’ cuyo valor
 *       esté en el rango [‘desde’, ‘hasta’].
 */
public int contarElementosEnElRango(double[][] matriz, double desde, double hasta){
int contador = 0;
    for (int i = 0; i < matriz.length; i++){
     for (int j = 0; j < matriz[i].length; j++){
            if (matriz[i][j] >= desde && matriz[i][j] <= hasta){
                contador++;
            }
        }
    }
return contador;
}

public static void main (String [] arg){
   	 
    double[][] prueba = {
        { 5.0,  3.5,  2.4 },
        { 2.1,  0.0,  5.1 },
        { 2.3,  7.9, -2.3 },
        { 1.0,  6.0, -8.5 }
    };
    AnalizadorDeMatrices a = new AnalizadorDeMatrices();
    System.out.println (a.contarCeros(prueba));
    System.out.println (a.contarElementosEnElRango(prueba,3,5));
    }
}