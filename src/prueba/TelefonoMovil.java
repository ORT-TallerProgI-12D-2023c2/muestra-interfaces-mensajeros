package prueba;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TelefonoMovil extends DispositivoElectronico implements EnviadorDeMensaje {

	public void enviarMensaje(String mensaje) {
		encender();
		System.out.println("Enviando SMS con el mensaje: " + mensaje + TERMINADOR);
	}

	public void encender() {
		// Método a resolver...
	}

}