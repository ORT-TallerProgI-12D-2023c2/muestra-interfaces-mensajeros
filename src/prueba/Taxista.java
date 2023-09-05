package prueba;

public class Taxista implements EnviadorDeMensaje {
	private String nombre;
	
	public Taxista(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println(nombre + " dice: " + mensaje + TERMINADOR);
	}
	
	
}
