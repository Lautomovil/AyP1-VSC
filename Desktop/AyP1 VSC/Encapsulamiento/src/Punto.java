public class Punto {
    private double x;
    private double  y;

    public void establecerX (double valorX){
        x = valorX;
    }
    public void establecerY (double valorY){
        y = valorY;
    }

    public double obtenerX() {
        return x;
    }
    public double obtenerY() {
        return y;
    }
    public boolean estaSobreEjeX(){
        return y == 0;
    }
    public boolean estaSobreEjeY(){
        return x == 0;
    }

    public boolean esElOrigen(){
        return x == 0 && y == 0;
    }
}
