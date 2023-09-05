package prueba;

import java.util.Collections;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		Campania c = new Campania();
		
		c.agregarMensajero( new PalomaMensajera() );
		c.agregarMensajero( new TelefonoMovil() );
		c.agregarMensajero( new PalomaMensajera() );
		c.agregarMensajero( new TelefonoMovil() );
		c.agregarMensajero( new Taxista("Juan") );
		c.agregarMensajero( new PalomaMensajera() );
		c.agregarMensajero( new TelefonoMovil() );
		c.agregarMensajero( new PalomaMensajera() );
	
		c.hacerCampania();
	}

}