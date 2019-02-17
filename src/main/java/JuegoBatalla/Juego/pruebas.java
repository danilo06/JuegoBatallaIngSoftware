package JuegoBatalla.Juego;

import java.util.ArrayList;
import java.util.Random;

public class pruebas {

	public static void main(String[] args) {
		Ejercito ejercito = new Ejercito();
		System.out.println(ejercito.getCantUnidades());
		System.out.println(ejercito.getHeroe().getDañoAdicional());
		System.out.println(ejercito.getUnidades().get(0).getDaño());
		System.out.println("Cantidad de unidaes:"+ejercito.getUnidades().size());
		System.out.println("--------------------------------");
		for (int i=0;i<ejercito.getUnidades().size();i++) {
			System.out.println(ejercito.getUnidades().get(i).getTipo());
		}
		System.out.println("Caballero: "+ejercito.getCantTipoUnidad("Caballero"));
		System.out.println("infanteria: "+ejercito.getCantTipoUnidad("Infanteria"));
		System.out.println("lancero: "+ejercito.getCantTipoUnidad("Lancero"));
		
	}

}
