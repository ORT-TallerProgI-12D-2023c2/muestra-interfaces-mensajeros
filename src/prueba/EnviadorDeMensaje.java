package prueba;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public interface EnviadorDeMensaje {
	// Solo puede haber métodos abstractos o constantes públicas y estáticas
	public static final String TERMINADOR = ".";
	public abstract void enviarMensaje(String mensaje);
}