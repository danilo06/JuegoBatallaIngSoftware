package JuegoBatalla.Juego;
import java.util.*;

/**
 * 
 */
public class Controlador {
	
	//private Ejercito ejercito1;
	
	public static void main(String[] args) {
	System.out.println("Controlador");
	}

    /**
     * Default constructor
     */
    public Controlador() {
    	generarEjercitos();
    }

    /**
     * 
     */
    private Ejercito ejercito1;

    /**
     * 
     */
    private Ejercito ejercito2;
    
    public void generarEjercitos() {
    	ejercito1 = new Ejercito();
    	ejercito2 = new Ejercito();
    }
    
    
}