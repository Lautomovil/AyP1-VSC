public class NuevaSintaxis {
    public static void main(String[] args) {
        // Se declara la variable suma de tipo int
        int suma;
        
        // Se asigna el valor 3 a la variable suma
        suma = 3;
        
        // Se asigna a la variable suma el resultado de sumarle 4 a su valor actual
        suma = suma + 4;
        
        // Se declara la variable nave de tipo NaveDeAtaque
        NaveDeAtaque nave;
        
        // Se inicializa un nuevo objeto de tipo NaveDeAtaque y se lo asigna a la variable nave
        nave = new NaveDeAtaque();
        
        // Se declara la variable pantalla de tipo Pantalla y se la inicializa con un nuevo objeto de tipo Pantalla
        Pantalla pantalla = new Pantalla();
        
        // Declaramos e inicializamos la variable coche de tipo Coche
        Coche coche = new Coche();
        
        // Invocamos el método manejar sobre el objeto referenciado por la variable coche
        coche.manejar();
        
        // Invocamos el método cargarCombustible sobre el objeto referenciado por la variable coche y le pasamos el valor 100 como parámetro
        coche.cargarCombustible(100);
        
        // Declaramos e inicializamos la variable pincel de tipo Pincel
        Pincel pincel = new Pincel();
        
        // Invocamos el método pintar sobre el objeto referenciado por la variable pincel y le pasamos el valor 1 y Color.AZUL como parámetros
        pincel.pintar(1, Color.AZUL);
        
        // Mientras una NaveDeAtaque referenciada por la variable nave detecte hacia la Direccion.NORTE un Asteroide, ataca en esa dirección
        while (nave.detectaAsteroide(Direccion.NORTE)) {
            nave.atacar(Direccion.NORTE);
        }
    }
}

