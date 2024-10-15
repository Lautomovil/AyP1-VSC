class NaveDeAtaque {
    public boolean detectaAsteroide(Direccion direccion) {
        // Código que detecta un asteroide
        return true;
    }

    public void atacar(Direccion dir) {
        // Código para atacar en una dirección
    }
}

class Pantalla {
    // Implementación de Pantalla
    private boolean encendida = false;
    int cantidadDeVecesEncendida;
    public void prenderPantalla(){
        if(encendida=false){
            encendida=true;
            cantidadDeVecesEncendida++;
        }
    }
    public void apagarPantalla(){
            if(encendida=true){
                encendida=false;
            }
    
    }
    public void cambiarColor (Color color){

    }

}

class Coche {
    public void manejar() {
        // Código para manejar el coche
    }

    public void cargarCombustible(int cantidad) {
        // Código para cargar combustible
    }
}

class Pincel {
    public void pintar(int valor, Color color) {
        // Código para pintar con un color
    }
}

enum Direccion {
    NORTE, SUR, ESTE, OESTE
}

enum Color {
    AZUL, ROJO, VERDE
}
