package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioModelo extends Conector {

	public ArrayList<Usuario> selectAll() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from usuario");
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNombre(rs.getString("Nombre"));
				usuario.setApellido(rs.getString("Apellido"));
				usuario.setEmail(rs.getString("Email"));
				usuario.setDni(rs.getString("Dni"));
				usuario.setContrasena(rs.getString("Contrasena"));

				usuarios.add(usuario);
			}
			return usuarios;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	public void insert(Usuario usuarios) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement(
					"INSERT INTO usuario (idUsuario, Nombre, Apellido, Dni, Contrasena, Email) values(?,?,?,?,?,?)");

			pst.setInt(1, usuarios.getIdUsuario());
			pst.setString(2, usuarios.getNombre());
			pst.setString(3, usuarios.getApellido());
			pst.setString(4, usuarios.getDni());
			pst.setString(5, usuarios.getContrasena());
			pst.setString(6, usuarios.getEmail());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Usuario get(String Dni, String Contrasena){
		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("select * from usuario where Dni = ? and contrasena=?");
			pst.setString(1, Dni);
			pst.setString(2, Contrasena);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				Usuario usuario = new Usuario();
				usuario.setNombre(rs.getString("Nombre"));
				usuario.setApellido(rs.getString("Apellido"));
				usuario.setEmail(rs.getString("Email"));
				usuario.setDni(rs.getString("Dni"));
				
				
			}else{
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	
}
	
	public Usuario selectPorDni(String dni) {
		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("select * from usuarios where dni = ?");
			pst.setString(1, dni);
			ResultSet rs = pst.executeQuery();
			

			if (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNombre(rs.getString("Nombre"));
				usuario.setApellido(rs.getString("Apellido"));
				usuario.setDni(rs.getString("Dni"));
				usuario.setEmail(rs.getString("Email"));

				return usuario;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
}
