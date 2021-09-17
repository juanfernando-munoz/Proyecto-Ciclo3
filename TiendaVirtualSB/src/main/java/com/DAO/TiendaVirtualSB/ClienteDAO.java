package com.DAO.TiendaVirtualSB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.BO.TiendaVirtualSB.*;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.sun.jdi.connect.spi.Connection;


/**
 * Clase que permite el acceso a la base de datos
 * 
 *
 */
public class ClienteDAO
{
	
/**
  * Permite Validar login
  * @param persona
 * @return 
  */
public int Validar (ClienteVO persona) {
	java.sql.Connection con;
    Conexion conex = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    String sql="Select * from persona where usuario=? and contrasena=?";
    try {
    	con=conex.getConnection();
        ps=con.prepareStatement(sql);
        ps.setString(1, persona.getUsuario());
        ps.setString(2, persona.getContrasena());
    	rs=ps.executeQuery();
    	while(rs.next()) {
    		r=r+1;
    		persona.setUsuario(rs.getString("usuario"));
    		persona.setContrasena(rs.getString("password"));
    	}
    	if(r==1) {
    		return 1;
    	}else {
    		return 0;
    	}
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        return 0;
    }
}
	
	
 /**
  * Permite Modificar un Cliente
  * @param persona
  */
public void modificarPersona(ClienteVO persona) {
    Conexion conex = new Conexion();
    try {
        Statement estatuto = conex.getConnection().createStatement();
        estatuto.executeUpdate(
                "UPDATE cliente " + 
                " SET nombre ='"+persona.getNombreCliente()+"', "+
                " correo ='" + persona.getCorreo()+"' "+
                "WHERE cedula=" + persona.getCedula()
                );
        /*JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente", "Información",
                JOptionPane.INFORMATION_MESSAGE);*/
        estatuto.close();
        conex.desconectar();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        //JOptionPane.showMessageDialog(null, "No se Registro la persona");
    }
}

/**
 * Permite registrar un Cliente nuevo
 * @param persona
 */
 public void registrarPersona(ClienteVO persona) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO cliente VALUES ('"+persona.getCedula()+"', '"
     +persona.getNombreCliente()+"', '"+persona.getCorreo()+"','"+persona.getUsuario()+"','"+persona.getContrasena()+"')");
   /*JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);*/
   estatuto.close();
   conex.desconectar();
   
  } catch (SQLException e) {
            //System.out.println(e.getMessage());
   /*JOptionPane.showMessageDialog(null, "No se Registro la persona");*/
  }
 }
   
 
/**
 * permite consultar el Cliente asociado al documento enviado
 * como parametro 
 * @param documento 
 * @return
 */
public ArrayList<ClienteVO> consultarPersona(int documento) {
  ArrayList< ClienteVO> miCliente = new ArrayList< ClienteVO>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM cliente where idcliente = ? ");
   consulta.setInt(1, documento);
   ResultSet res = consulta.executeQuery();
   
  if(res.next()){
    ClienteVO persona= new ClienteVO();
    persona.setCedula(Integer.parseInt(res.getString("cedula")));
    persona.setNombreCliente(res.getString("nombre"));
    persona.setCorreo(res.getString("correo"));
 
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   /*JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);*/
  }
  return miCliente;
 }



/**
 * permite consultar la lista de Clientes
 * @return
 */
public ArrayList< ClienteVO> listaDePersonas() {
  ArrayList< ClienteVO> miCliente = new ArrayList< ClienteVO>();
  Conexion conex= new Conexion();
    
  try {
   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM cliente");
   ResultSet res = consulta.executeQuery();
   while(res.next()){
    ClienteVO persona= new ClienteVO();
    persona.setCedula(Integer.parseInt(res.getString("cedula")));
    persona.setNombreCliente(res.getString("nombre"));
    persona.setCorreo(res.getString("correo"));
  
    miCliente.add(persona);
          }
          res.close();
          consulta.close();
          conex.desconectar();
   
  } catch (Exception e) {
   /*JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);*/
  }
  return miCliente;
 }

}