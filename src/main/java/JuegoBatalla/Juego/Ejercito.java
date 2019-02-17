package JuegoBatalla.Juego;
import java.util.*;

/**
 * 
 */
public class Ejercito {

    /**
     * Default constructor
     */
    public Ejercito() {
    	nuevoEjercito();
    }

    /**
     * 
     */
    private List<Tropa> unidades;

    /**
     * 
     */
    private Heroe heroe;
    
    private int cantUnidades;

    /**
     * 
     */
    public void nuevoEjercito() {
        this.cantUnidades = cantidadUnidaes();
        unidades = new ArrayList<Tropa>();
        generarTropas(cantUnidades);
        this.heroe = new Heroe();
        cantUnidades++;
    }
    private void generarTropas(int cantidad) {
    	
    	for (int i=0;i<cantidad;i++) {
    		Tropa tropa = null;
    		int aux=tipoTropa();
    		if (aux==1) {
    			System.out.println("Caballero");
    			tropa = new Caballero();
    		}
    		if (aux==2) {
    			System.out.println("Infanteria");
    			tropa = new Infanteria();
    		}
    		if (aux==3) {
    			tropa = new Lancero();
    			System.out.println("Lancero");
    		}
			unidades.add(tropa);
    	}
    }
    
    private int cantidadUnidaes() {
    	int cant;
    	Random aleatorio = new Random();
		cant= (4+aleatorio.nextInt( (9+1) - 4));
		return cant;
    }
    
    private int tipoTropa() {
    	int cant;
    	Random aleatorio = new Random();
		cant= (1+aleatorio.nextInt( (3+1) - 1));
		return cant;
    }
    
	public List<Tropa> getUnidades() {
		return unidades;
	}
	public Heroe getHeroe() {
		return heroe;
	}
	public int getCantUnidades() {
		return cantUnidades;
	}
	
	public int getCantTipoUnidad(String tipoUnidad) {
		int aux=0;
		for (int i=0;i<unidades.size();i++) {
			if (tipoUnidad == unidades.get(i).getTipo()) {
				aux++;
			}
		}
		return aux;
	}
}