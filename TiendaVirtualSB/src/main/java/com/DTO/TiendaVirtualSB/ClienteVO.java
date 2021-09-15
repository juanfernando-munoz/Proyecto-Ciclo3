package com.DTO.TiendaVirtualSB;

public class ClienteVO {
	
	 private Integer cedula;
	 private String nombreCliente;
	 private String correo;
	 private String usuario;
	 private String contrasena;

	 
	 /**
	  * @return the cedula
	  */
	 public Integer getCedula() {
	  return cedula;
	 }
	 
	 /**
	  * @param cedula 
	  */
	 public void setCedula(Integer cedula) {
	  this.cedula = cedula;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getNombreCliente() {
	  return nombreCliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setNombreCliente(String nombreCliente) {
	  this.nombreCliente = nombreCliente;
	 }
	 
	 
	 /**
	  * @return the correo
	  */
	 public String getCorreo() {
	  return correo;
	 }
	 /**
	  * @param correo
	  */
	 public void setCorreo (String correo) {
	  this.correo = correo;
	 }
	 
	 /**
	  * @return the usuario
	  */
	 public String getUsuario() {
	  return usuario;
	 }
	 /**
	  * @param usuario
	  */
	 public void setUsuario (String usuario) {
	  this.usuario = usuario;
	 }
	 /**
	  * @return the nombreCliente
	  */
	 public String getContrasena() {
	  return contrasena;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setContrasena (String contrasena) {
	  this.contrasena = contrasena;
	 }

}
