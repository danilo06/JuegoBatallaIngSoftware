package JuegoBatalla.Juego;
import java.util.*;

/**
 * 
 */
public class Tropa {

    /**
     * Default constructor
     */
    public Tropa() {
    }

    /**
     * 
     */
    protected Integer daño;

    /**
     * 
     */
    protected Integer resistencia;


    /**
     * @param daño
     */
    public void recibirDaño(Integer daño) {
        resistencia-=daño;
    }

    /**
     * 
     */
    public void atacar() {
        // TODO implement here
    }

}