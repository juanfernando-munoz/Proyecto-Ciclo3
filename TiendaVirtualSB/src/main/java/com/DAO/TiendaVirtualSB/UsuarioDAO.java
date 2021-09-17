package com.DAO.TiendaVirtualSB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.DTO.TiendaVirtualSB.ClienteVO;

public class UsuarioDAO {

		public void registrarUsuario(UsuarioVO usuarios) 
		{
		 Conexion conex= new Conexion();
		 try {
		  Statement estatuto = conex.getConnection().createStatement();
		  estatuto.executeUpdate("INSERT INTO usuarios VALUES ('"+usuarios.getCedulaUsuario()+"', '"
		    +usuarios.getNombreUsuario()+"', '"+usuarios.getCorreoUsuario()+"','"+usuarios.getUsuarioUsuario()+"','"+usuarios.getContrasenaUsuario()+"')");
		  /*JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);*/
		  estatuto.close();
		  conex.desconectar();
		  
		 } catch (SQLException e) {
		           //System.out.println(e.getMessage());
		  /*JOptionPane.showMessageDialog(null, "No se Registro la persona");*/
		 }
		}





		}
}
