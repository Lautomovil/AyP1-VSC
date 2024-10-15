public class Cubo {
  /**
     * pre : longitudLado es un valor mayor a 0.
     * post: inicializa el cubo a partir de la longitud de lado dada
     */
    private double lado;
    public Cubo (double longitudLado) {
        if (longitudLado<0){
            throw new Error("La longitud del lado debe ser mayor a 0");
        }else{
            lado = longitudLado;
        }
     }

    /**
     * post: devuelve la longitud de todos los lados del cubo
     */
    public double obtenerLado() {
        return lado;
     }
    
    /**
     * pre : longitudLado es un valor mayor a 0.
     * post: cambia la longitud de todos los lados del cubo
     */
    public void cambiarLado(double longitudLado) {
        if (longitudLado<0){
            throw new Error("La longitud del lado debe ser mayor a 0");
        }else{
            lado = longitudLado;
        }
     }
    
    /**
     * post: devuelve el área de la superficie de las caras del cubo
     */
    public double obtenerAreaCara() { 
        return lado * lado;
    }
    
    /**
     * pre: areaCara es un valor mayor a 0.
     * post: cambia el área de las caras del cubo
     */
    public void cambiarAreaCara(double areaCara) {
        if (areaCara<0){
            throw new Error("La longitud del area debe ser mayor a 0");
        }else{
            lado = Math.sqrt(areaCara);
     }
    }
    /**
     * post: devuelve el volumen que encierra el cubo
     */
    public double obtenerVolumen(){
        return lado * lado * lado;
    }
        


    /**
     * pre: volumen es un valor mayor a 0.
     * post: cambia el volumen del cubo
     */
    public void cambiarVolumen(double volumen) { 
        if (volumen<0){
            throw new Error("El volumen debe ser mayor a 0");
        }else{
            lado = Math.cbrt(volumen);
    }
}
    public void hacerLadoPi (){
        lado = Math.PI;
    }
}


