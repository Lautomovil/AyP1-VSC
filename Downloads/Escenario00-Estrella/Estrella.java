import greenfoot.*;

/**
 * Define una Estrella en la Batalla Espacial
 */
public class Estrella extends ActorBase {
    
    private double ESCALA_X = 0.8;
    private double ESCALA_Y = 0.8;

    /**
     * Establece la imagen con la escala definida
     */
    @Override
    protected void actualizarImagen() {
        int tamCelda = getWorld().getCellSize();
        GreenfootImage image = getImage();
        image.scale((int) (tamCelda * ESCALA_X), (int) (tamCelda * ESCALA_Y));
        setImage(image);
    }

    /**
     * post: la Estrella desaparece del mundo
     * 
     * @
     */
    public boolean serRecogido() {
        getWorld().removeObject(this);
        Greenfoot.delay(20);
        return true;
    }
}
