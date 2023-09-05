package prueba;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {

	public void enviarMensaje(String mensaje) {
		volar();
		System.out.println("Suelto un papelito en el aire que dice: " + mensaje + TERMINADOR);
	}

	public void volar() {
		// Método a resolver...
	}

}