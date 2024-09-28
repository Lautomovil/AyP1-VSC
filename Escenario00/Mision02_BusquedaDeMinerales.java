import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mision02_BusquedaDeMinerales extends MundoBase
{

    public Mision02_BusquedaDeMinerales()
    {
        super(8, 9, 100);
        //inicializarPosicionesOcupadas(); //Este no hace falta acá, solo funciona si lo agregamos 
        //después de cada objeto que agregamos de forma constante, como las naves enemigas.
    }
    
    private void inicializarPosicionesOcupadas(){ // Esto ya marca las posiciones predeterminadas
        // Añade las posiciones ocupadas por naves enemigas
        marcarPosicionOcupada(0, 1);
        marcarPosicionOcupada(0, 5);
        marcarPosicionOcupada(7, 3);
        marcarPosicionOcupada(7, 7);
        
        // Añade la posición de la nave aliada
        marcarPosicionOcupada(0, 8);
        
        // Añade la posición de la base
        marcarPosicionOcupada(7, 0);
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
        /* Minerales generados aleatoriamente cada vez que inicia el mundo
         * Por ahora dejamos el mineral base como placeholder, después agregaremos mas métodos para
         * los distintos tipos de mineral.
         */
        generarAsteroidesAleatorios(5); // Genera 5 asteroides aleatorios (Podemos cambiar el número)
        generarMineralesAleatorios(5); // Genera 5 minerales aleatorios (Podemos cambiar el número)
    }
    
    private void generarAsteroidesAleatorios(int cantidad) {
        int x, y;
        for (int i = 0; i < cantidad; i++) {
            do {
                x = (int) (Math.random() * 8); 
                y = (int) (Math.random() * 9); 
            } while (!esPosicionLibre(x, y));
            agregar(new Asteroide(), x, y);
            marcarPosicionOcupada(x, y); // Marca la posición como ocupada
        }
    }
    
    private void generarMineralesAleatorios(int cantidad) {
        int x, y;
        for (int i = 0; i < cantidad; i++) {
            do {
                x = (int) (Math.random() * 8); 
                y = (int) (Math.random() * 9); 
            } while (!esPosicionLibre(x, y));
            agregar(new AsteroideDeMineral(), x, y);
            marcarPosicionOcupada(x, y); // Marca la posición como ocupada
        }
        /*
         * getWidth y getHeight son métodos propios de Greenfoot, en este caso nos darían coordenadas
         * random para x e y con Math.random si el espacio no está ocupado
         */
    }
            
    protected void generarNaves() {
        agregar(new NaveDeAtaque(), 0, 8); // Nave para el usuario

        // Naves enemigas
        agregar(new NaveDeAtaqueEnemiga(Direccion.ESTE), 0, 1);
        agregar(new NaveDeAtaqueEnemiga(Direccion.ESTE), 0, 5);
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 7, 3);
        agregar(new NaveDeAtaqueEnemiga(Direccion.OESTE), 7, 7);
        
        inicializarPosicionesOcupadas();
    }

    protected void generarPOIs() {
        marcarCelda(7, 0, new Color(0, 0, 200, 150));
        inicializarPosicionesOcupadas();
    }

    protected void generarItems() {
        //agregar(new Item(), 0, 1);
    }

}
