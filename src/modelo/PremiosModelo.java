package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PremiosModelo extends Conector {

	public ArrayList<Premios> selectAll() {

		ArrayList<Premios> premios = new ArrayList<Premios>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from premios");
			while (rs.next()) {
				Premios premio = new Premios();
				premio.setIdPremios(rs.getInt("IdPremios"));
				premio.setNombre(rs.getString("Nombre"));
				premio.setDescripcion(rs.getString("Descripcion"));
				premio.setPremioMetalico(rs.getInt("PremioMetalico"));

				premios.add(premio);
			}
			return premios;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return premios;
	}

	public Premios select(int idPremios) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from premios where idPremios = ?");
			pst.setInt(1, idPremios);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Premios premio = new Premios();

				premio.setIdPremios(rs.getInt("IdPremios"));
				premio.setNombre(rs.getString("Nombre"));
				premio.setDescripcion(rs.getString("Descripcion"));
				premio.setPremioMetalico(rs.getInt("PremioMetalico"));
				return premio;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insert(Premios premio) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement(
					"INSERT INTO premios (Nombre, Descripcion, PremioMetalico ) values(?,?,?)");
			pst.setString(1, premio.getNombre());
			pst.setString(2, premio.getDescripcion());
			pst.setInt(3, premio.getPremioMetalico());
			

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void delete(int idPremios) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("delete from premios where idPremios = ?");
			pst.setInt(1, idPremios);

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}
