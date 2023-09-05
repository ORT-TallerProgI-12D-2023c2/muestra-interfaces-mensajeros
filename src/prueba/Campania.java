package prueba;

import java.util.ArrayList;
import java.util.Collections;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Campania {

	private ArrayList<EnviadorDeMensaje> mensajeros;
	
	public Campania() {
		this.mensajeros = new ArrayList<>();
	}
	
	public void agregarMensajero(EnviadorDeMensaje e) {
		this.mensajeros.add(e);
		//Collections.shuffle(mensajeros);
	}

	public void hacerCampania() {
		for (EnviadorDeMensaje mensajero : mensajeros) {
			mensajero.enviarMensaje("Voten x mí");
		}
	}

}