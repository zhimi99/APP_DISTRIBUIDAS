package ec.ups.edu.appdis.g1.parqueadero.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.dao.ClienteDAO;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;


@Stateless
public class GestionTicketON {
	
	@Inject
	private ClienteDAO daoCliente;
	
	
	public boolean registrarTicket() {
		return true;
		
	}
	
	public Ticket salidaVehiculo(int idTicket) {
		
		return null;
		
	}
	
	public double calcularTiempo(int idTicket) {
		
		return 0;
		
	}
	
	public Vehiculo buscarVehiculo(String placa) {
		
		return null;
		
		
	}
	
	
	public boolean registrarCliente(Cliente cliente) {
		
		
		//validado procesado
		
		daoCliente.insert(cliente);
		
		return true;
	}
	

}
