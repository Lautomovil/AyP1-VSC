import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mision01_Rescate extends MundoBase
{
            
    public Mision01_Rescate()
    {
        super(7, 8, 100);
        inicializarPosicionesOcupadas();
    }
        
    private void inicializarPosicionesOcupadas(){ // Esto ya marca las posiciones predeterminadas
        // Añade las posiciones ocupadas por asteroides que rodean al piloto
        marcarPosicionOcupada(2, 2);
        marcarPosicionOcupada(3, 2);
        marcarPosicionOcupada(4, 2);
        marcarPosicionOcupada(2, 0);
        marcarPosicionOcupada(3, 0);
        marcarPosicionOcupada(4, 0);
        marcarPosicionOcupada(2, 1);
        marcarPosicionOcupada(4, 1);
                
        // Añade la posición del piloto perdido
        marcarPosicionOcupada(3, 1);
        
        // Añade la posición de la nave exploradora
        marcarPosicionOcupada(0, 7);
    }
    
    private void marcarPosicionOcupada(int x, int y) {
        // Marca como ocupadas las posiciones en X e Y
        posicionesOcupadas[x][y] = true;
    }
    
    private boolean esPosicionLibre(int x, int y) {
        // Esto dice si el recuadro está libre o no
        return !posicionesOcupadas[x][y];
    }
    
    protected void generarAsteroides() {
        // Asteroides que rodean al piloto
        agregar(new Asteroide(), 2, 2);
        agregar(new Asteroide(), 3, 2);
        agregar(new Asteroide(), 4, 2);
        agregar(new Asteroide(), 2, 0);
        agregar(new Asteroide(), 3, 0);
        agregar(new Asteroide(), 4, 0);
        agregar(new Asteroide(), 2, 1);
        agregar(new Asteroide(), 4, 1);
                
        // Marcar estas posiciones como ocupadas
        inicializarPosicionesOcupadas();
        
        // Asteroides generados aleatoriamente cada vez que inicia el mundo
        generarAsteroidesAleatorios(5); // Genera 5 asteroides aleatorios (Podemos cambiar el número)
    }
    
    private void generarAsteroidesAleatorios(int cantidad) {
        int x, y;
        for (int i = 0; i < cantidad; i++) {
            do {
                x = (int) (Math.random() * 7); 
                y = (int) (Math.random() * 8); 
            } while (!esPosicionLibre(x, y));
            agregar(new Asteroide(), x, y);
            marcarPosicionOcupada(x, y); // Marca la posición como ocupada
        }
    }
    
    protected void generarPOIs() {
        // Base al borde inferior izquierdo del mapa
        marcarCelda(0, 7, new Color(0, 0, 200, 150));
    }
    
    protected void generarNaves() {
        // Nave Exploradora generada en la base
        agregar(new NaveExploradora(), 0, 7);
        
        // Piloto Perdido en el campo de asteroides (Después cambiar al tipo de piloto)
        agregar(new PilotoDeEjemplo(), 3, 1);
    }
    
     protected void generarItems() {
        // Placeholder para la estrella fugaz
        generarEstrella(new Item());
    }
    
    private void generarEstrella(Item item) { //Esto después lo cambiamos por la estrella fugaz en si
        int x, y;
        do {
            x = (int) (Math.random() * 7);
            y = (int) (Math.random() * 8);
        } while (!esPosicionLibre(x, y));
        agregar(item, x, y);
        marcarPosicionOcupada(x, y);
    }
}
