package ec.ups.edu.appdis.g1.parqueadero.modelo;

import java.util.Date;

public class CierreDiaHora {
	
	private Date fecha;
	private int hora;
	private double total;
	private int numeroVehiculos;
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNumeroVehiculos() {
		return numeroVehiculos;
	}
	public void setNumeroVehiculos(int numeroVehiculos) {
		this.numeroVehiculos = numeroVehiculos;
	}
	
	
}
