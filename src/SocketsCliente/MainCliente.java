 package SocketsCliente;

public class MainCliente {
	
	public static ConexionCliente cliente;

	public static void main(String[] args) {
		
		ChatCliente cliente = new ChatCliente();
		cliente.main();

	}
	
	public static void iniciarCliente(String ip) {
		
		cliente = new ConexionCliente(ip);
		cliente.start();
		
	}
}
