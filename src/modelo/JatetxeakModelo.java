package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Libros.Libro;

public class JatetxeakModelo extends Conector {

	public ArrayList<Jatetxeak> selectAll() {

		ArrayList<Jatetxeak> jatetxeak = new ArrayList<Jatetxeak>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from jatetxeak");
			while (rs.next()) {
				Jatetxeak jatetxe = new Jatetxeak();
				jatetxe.setIdJatetxeak(rs.getInt("idJatetxeak"));
				jatetxe.setNombre(rs.getString("Nombre"));
				jatetxe.setDireccion(rs.getString("Direccion"));
				jatetxe.setIdCocinero(rs.getInt("idCocinero"));
				jatetxe.setPoblacion(rs.getString("Poblacion"));
				jatetxe.setPais(rs.getString("Pais"));
				jatetxe.setPremiosJ(rs.getInt("PremiosJ"));
				jatetxe.setPrecio(rs.getString("Precio"));

				jatetxeak.add(jatetxe);
			}
			return jatetxeak;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jatetxeak;
	}

	public Jatetxeak select(int idJatetxeak) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from jatetxeak where idJatetxeak = ?");
			pst.setInt(1, idJatetxeak);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Jatetxeak jatetxe = new Jatetxeak();
				jatetxe.setIdJatetxeak(rs.getInt("idJatetxeak"));
				;
				jatetxe.setNombre(rs.getString("Nombre"));
				jatetxe.setDireccion(rs.getString("Direccion"));
				jatetxe.setIdCocinero(rs.getInt("idCocinero"));
				jatetxe.setPoblacion(rs.getString("Poblacion"));
				jatetxe.setPais(rs.getString("Pais"));
				jatetxe.setPremiosJ(rs.getInt("PremiosJ"));
				jatetxe.setPrecio(rs.getString("Precio"));
				return jatetxe;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insert(Jatetxeak jatetxeak) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement(
					"INSERT INTO jatetxeak (Nombre, Direccion, Poblacion, Pais, PremiosJ, Precio) values(?,?,?,?,?,?)");
			pst.setString(1, jatetxeak.getNombre());
			pst.setString(2, jatetxeak.getDireccion());
			pst.setString(3, jatetxeak.getPoblacion());
			pst.setString(4, jatetxeak.getPais());
			pst.setInt(5, jatetxeak.getPremiosJ());
			pst.setString(6, jatetxeak.getPrecio());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void update(Jatetxeak jatetxe) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("update jatetxeak set Nombre=?, Direccion=?, Poblacion=?, Pais=?, PremiosJ=?, Precio=?, idCocinero=? where idJatetxeak=?");
			pst.setString(1, jatetxe.getNombre());
			pst.setString(2, jatetxe.getDireccion());
			pst.setString(3, jatetxe.getPoblacion());
			pst.setString(4, jatetxe.getPais());
			pst.setInt(5,  jatetxe.getPremiosJ());
			pst.setString(6, jatetxe.getPrecio());
			pst.setInt(7,  jatetxe.getIdCocinero());
			pst.setInt(7,  jatetxe.getIdJatetxeak());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void delete(int idJatetxeak) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("delete from jatetxear where idJatetxeak = ?");
			pst.setInt(1, idJatetxeak);

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
