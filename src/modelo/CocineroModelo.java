package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CocineroModelo extends Conector {

	public ArrayList<Cocinero> selectAll() {

		ArrayList<Cocinero> cocinero = new ArrayList<Cocinero>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from cocinero");
			while (rs.next()) {
				Cocinero cocineros = new Cocinero();
				cocineros.setIdCocinero(rs.getInt("IdCocinero"));
				cocineros.setNombre(rs.getString("Nombre"));
				cocineros.setApellido(rs.getString("Apellido"));
				cocineros.setTelefono(rs.getInt("Telefono"));
				cocineros.setLugarDeTrabajo(rs.getInt("LugarDeTrabajo"));
				cocineros.setExperiencia(rs.getInt("Experiencia"));
				cocineros.setEdad(rs.getInt("Edad"));
				cocineros.setPremiosC(rs.getInt("PremiosC"));

				cocinero.add(cocineros);
			}
			return cocinero;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cocinero;
	}

	public Cocinero select(int idCocinero) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from cocinero where idCocinero = ?");
			pst.setInt(1, idCocinero);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Cocinero cocineros = new Cocinero();

				cocineros.setIdCocinero(rs.getInt("IdCocinero"));
				cocineros.setNombre(rs.getString("Nombre"));
				cocineros.setApellido(rs.getString("Apellido"));
				cocineros.setTelefono(rs.getInt("Telefono"));
				cocineros.setLugarDeTrabajo(rs.getInt("LugarDeTrabajo"));
				cocineros.setExperiencia(rs.getInt("Experiencia"));
				cocineros.setEdad(rs.getInt("Edad"));
				cocineros.setPremiosC(rs.getInt("PremiosC"));
				;
				return cocineros;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void insert(Cocinero cocinero) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement(
					"INSERT INTO cocinero (Nombre, Apellido, Telefono) values(?,?,?)");
			pst.setString(1, cocinero.getNombre());
			pst.setString(2, cocinero.getApellido());
			pst.setInt(3, cocinero.getTelefono());
			

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	public void update(Cocinero cocinero) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("update cocinero set Nombre=?, Apellido=?, Telefono=? where idCocinero=?");
			pst.setString(1, cocinero.getNombre());
			pst.setString(2, cocinero.getApellido());
			pst.setInt(3, cocinero.getTelefono());
			pst.setInt(4, cocinero.getIdCocinero());
			
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int idCocinero) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("delete from cocinero where idCocinero = ?");
			pst.setInt(1, idCocinero);

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
