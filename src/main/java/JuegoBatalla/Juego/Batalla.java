package JuegoBatalla.Juego;
import java.util.*;

/**
 * 
 */
public class Batalla {
	
	//private Ejercito ejercito1;
	
	public static void main(String[] args) {
		System.out.println("Controlador");
		for (int i=0;i<10;i++) {
			int aux=getPrimerAtacante();
			System.out.println(aux);
		}
	}

    /**
     * Default constructor
     */
    public Batalla() {
    	generarEjercitos();
    }

    /**
     * 
     */
    private Ejercito ejercitoAzul;

    /**
     * 
     */
    private Ejercito ejercitoRojo;
    
    public void generarEjercitos() {
    	ejercitoAzul = new Ejercito();
    	ejercitoRojo = new Ejercito();
    }

	public Ejercito getEjercito1() {
		return ejercitoAzul;
	}

	public Ejercito getEjercito2() {
		return ejercitoRojo;
	}
	
	public static int getPrimerAtacante() {
		int aux=0;
		aux= (int) (Math.random() * 2) + 1;
		return aux;
	}
    
    
}