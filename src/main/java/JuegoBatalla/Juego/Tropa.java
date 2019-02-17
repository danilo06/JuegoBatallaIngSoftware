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
     * 
     */
    protected String tipo;


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

	public Integer getDaño() {
		return daño;
	}

	public Integer getResistencia() {
		return resistencia;
	}

	public String getTipo() {
		return tipo;
	}
	
    
    

}