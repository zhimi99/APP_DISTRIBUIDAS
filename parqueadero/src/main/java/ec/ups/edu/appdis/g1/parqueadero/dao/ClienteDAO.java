package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;


@Stateless
public class ClienteDAO {
	
	
	@Inject
	private Connection con;
	
	public ClienteDAO() {
		
	}
	
	
	public boolean insert(Cliente entity) throws SQLException {
		
		String sql="Insert into cliente (dni, email, nombre, tipoDocumento)"
				+  "values (?, ?, ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getDni());
		
		ps.executeUpdate();
		return true;
	}

	
	public boolean update(Cliente entity) {
		
		return true;
	}

	
	public Cliente read(int id) {
		
		return null;
	}


	public boolean delete(int id) {
	
	return true;
	}
	

}
