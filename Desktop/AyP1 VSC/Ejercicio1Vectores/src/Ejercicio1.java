import java.util.Arrays;
public class Ejercicio1 {

    //Metodos
    //a. Contar todos elementos del vector
    public int contarValores (int [] vector){
        return vector.length;
    }

    //b. Contar los valores pares de un arreglo
    public int contarValoresPares(int [] vector){
        int contador = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                contador++;
            }
        }
        return contador;

        //recorrer el vector y verificar si cada posicion es par (contar)
    }
  

    public int sumarValoresPares(int [] vector){
        int total = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                total += vector[i];
            }
        }
        return total;

        //recorrer el vector y verificar si cada posicion es par (contar)
    }



    //sumar los valores de un arreglo
    //sumar todos
    public int sumaDelVector(int[] vector) {
            int total = 0;
            for (int i = 0; i < vector.length; i++){
                total += vector[i]; 
            }
            return total;
        }

    public double promediosVector(int[] vector){
            double total = 0;
            for (int i = 0; i < vector.length; i++){
                total += vector[i];
            }
            total /= vector.length;
            return total;
        }
            // Método para pisar el arreglo con ceros
    public void pisarConCero(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 0;  // Reemplazar cada valor por 0
        }
    }

    // Método para pisar el arreglo con el valor de la primera posición
    public void pisarConPrimero(int[] vector) {
        if (vector.length > 0) {  // Asegurarse de que el arreglo no esté vacío
            int primerValor = vector[0];  // Obtener el primer valor
            for (int i = 0; i < vector.length; i++) {
                vector[i] = primerValor;  // Reemplazar cada valor por el primer valor
            }
        }
    }

    // Método para pisar el arreglo con el valor de la última posición
    public void pisarConUltimo(int[] vector) {
        if (vector.length > 0) {  // Asegurarse de que el arreglo no esté vacío
            int ultimoValor = vector[vector.length - 1];  // Obtener el último valor
            for (int i = 0; i < vector.length; i++) {
                vector[i] = ultimoValor;  // Reemplazar cada valor por el último valor
            }
        }
    }

    public void invertirVector(int[] vector) {
        int aux;
        int tam = vector.length - 1;
        if (vector.length > 0) {  // Asegurarse de que el arreglo no esté vacío
            for (int i = 0; i < tam/2; i++) {
                aux = vector [i];
                vector[i] = vector[tam - i];
                vector[tam - i] = aux;
            }
        }
    }
    public int maximoBuscarVector (int [] a){
        int candidato = a[0];
        for (int i = 0 ; i < a.length; i++) {
            if (a[i] > candidato){
                candidato = a [i];
            }
        }
        return candidato;
    }

    public int minimoBuscarVector (int [] a){
        int candidato = a[0];
        for (int i = 0 ; i < a.length; i++) {
            if (a[i] < candidato){
                candidato = a [i];
            }
        }
        return candidato;
    }

    public int buscarPosicionMaxima (int [] a){
        int candidato = a[0];
        int pos = 0;
        for (int i = 0 ; i < a.length; i++) {
            if (a[i] > candidato){
                candidato = a [i];
                pos = i;
            }
        }
        return pos;
    }

    public int[] unirArreglos(int[] arreglo1, int[] arreglo2) {
        int[] unido = new int[arreglo1.length + arreglo2.length];  // Crear un nuevo arreglo del tamaño combinado
        System.arraycopy(arreglo1, 0, unido, 0, arreglo1.length);  // Copiar el primer arreglo
        System.arraycopy(arreglo2, 0, unido, arreglo1.length, arreglo2.length);  // Copiar el segundo arreglo
        return unido;
    }
    
    public int [] [] dividirArreglo(int[] vector){
        int tam = vector.length/2;
        int [] a = new int[tam];
        int [] b = new int [vector.length - tam];
        System.arraycopy(vector, 0, a, 0, tam);
        System.arraycopy(vector, tam, b, 0, vector.length - tam);
        return new int[][] {a,b};
        
    }
    
    public int[][] separarParesImpares(int[] arreglo) {
        int[] pares = new int[arreglo.length / 2 + arreglo.length % 2];  // Tamaño para los pares
        int[] impares = new int[arreglo.length / 2];  // Tamaño para los impares
        
        int indicePar = 0, indiceImpar = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0) {
                pares[indicePar++] = arreglo[i];  // Elementos en posiciones pares
            } else {
                impares[indiceImpar++] = arreglo[i];  // Elementos en posiciones impares
            }
        }
        
        return new int[][]{pares, impares};
    }

    public void moverNegativosIzquierda(int[] arreglo) {
        int izquierda = 0, derecha = arreglo.length - 1;
        
        while (izquierda <= derecha) {
            if (arreglo[izquierda] < 0) {
                izquierda++;  // Si el valor en la izquierda ya es negativo, seguimos avanzando
            } else if (arreglo[derecha] >= 0) {
                derecha--;  // Si el valor en la derecha ya es positivo, seguimos retrocediendo
            } else {
                // Intercambiar un positivo a la izquierda con un negativo a la derecha
                int temp = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temp;
                izquierda++;
                derecha--;
            }
        }
    }
    
    
        public static void main(String[] args) throws Exception{

            int [] vectorint1 = { 10, 20, 30 };
            int []vectorint2 = { -4 };
            int []vectorint3 = { 1, 10, 2, 90, 8, 4, 5, 6, 6 };
            int []vectorint4 = { 7, 7, 7, 9 };
            
            Ejercicio1 ej1 = new Ejercicio1();
            
            int tam;
           
            ej1.invertirVector(vectorint1);
            System.out.println(Arrays.toString(vectorint1));
          
            System.out.println(Arrays.toString(vectorint2));
            
            System.out.println(Arrays.toString(vectorint3));
            System.out.println(Arrays.toString(vectorint4));
            tam = ej1.contarValores(vectorint1);
            System.out.println("La cantidad de elementos de vector1 es =" + tam);
         
            tam = ej1.contarValores(vectorint2);
            System.out.println("La cantidad de elementos de vector2 es =" + tam);
    
            tam = ej1.contarValores(vectorint3);
            System.out.println("La posicion del maximo de vector3 es =" + tam);
        
            tam = ej1.contarValores(vectorint4);
            System.out.println("La cantidad de elementos de vector4 es =" + tam);
        }
    
}

    