public class Cerradura {
    private int claveDeApertura;
    private int cantidadDeFallosConsecutivosQueLaBloquean;
    private int fallosConsecutivos;
    private int aperturasExitosas;
    private int aperturasFallidas;
    private boolean abierta;
    private boolean bloqueada;

    public Cerradura(int claveDeApertura,int cantidadDeFallosConsecutivosQueLaBloquean){
        this.claveDeApertura = claveDeApertura;
        this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
        this.fallosConsecutivos = 0;
        this.aperturasExitosas = 0;
        this.aperturasFallidas = 0;
        this.abierta = false;
        this.bloqueada = false;
    }

    public boolean abrir(int clave){
        if (bloqueada){
            return false;
        }
        if(claveDeApertura == clave){
            abierta = true;
            aperturasExitosas++;
            fallosConsecutivos = 0;
            return true;
        }else{
            
            fallosConsecutivos++;
            aperturasFallidas++;
            if (fallosConsecutivos == cantidadDeFallosConsecutivosQueLaBloquean){
                bloqueada = true;
            }
           return false;
        }
    }

    public void cerrar(){
        abierta = false;
    }

    public boolean estaAbierta(){
        return abierta;
    }

    public boolean estaCerrada(){
        return !abierta;
    }

    public boolean fueBloqueada(){
        return bloqueada;
    }

    public int contarAperturasExitosas(){
        return aperturasExitosas;
    }

    public int contarAperturasFallidas(){
        return aperturasFallidas;
    }

}

