package JuegoBatalla.Juego;

import java.util.ArrayList;
import java.util.Random;

public class pruebas {

	public static void main(String[] args) {
		Ejercito ejercito = new Ejercito();
		
		for(int i=0;i<ejercito.getCantUnidades()-1;i++) {
			System.out.println(ejercito.getUnidades().size());
			System.out.println("Caballero: "+ejercito.getCantTipoUnidad("Caballero"));
			System.out.println("infanteria: "+ejercito.getCantTipoUnidad("Infanteria"));
			System.out.println("lancero: "+ejercito.getCantTipoUnidad("Lancero"));
			ejercito.getUnidades().remove(0);
		}
		System.out.println("++++++++++++++++++++");
		System.out.println("Caballero: "+ejercito.getCantTipoUnidad("Caballero"));
		System.out.println("infanteria: "+ejercito.getCantTipoUnidad("Infanteria"));
		System.out.println("lancero: "+ejercito.getCantTipoUnidad("Lancero"));
		
	}

}
