package com.DTO.TiendaVirtualSB;

public class ClienteVO {
	

	 private Integer cedulaCliente;
	 private String nombreCliente;
	 private String correoCliente;
	 private String usuarioCliente;
	 private String contrasenaCliente;

	 
	 /*VARIABLES CLIENTES*/
	 /**
	  * @return the cedula
	  */
	 public Integer getCedulaCliente() {
	  return cedulaCliente;
	 }
	 
	 /**
	  * @param cedula 
	  */
	 public void setCedulaCliente(Integer cedulaCliente) {
	  this.cedulaCliente = cedulaCliente;
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
	 public String getCorreoCliente() {
	  return correoCliente;
	 }
	 /**
	  * @param correo
	  */
	 public void setCorreoCliente (String correoCliente) {
	  this.correoCliente = correoCliente;
	 }
	 
	 /**
	  * @return the usuario
	  */
	 public String getUsuarioCliente() {
	  return usuarioCliente;
	 }
	 /**
	  * @param usuario
	  */
	 public void setUsuarioCliente (String usuarioCliente) {
	  this.usuarioCliente = usuarioCliente;
	 }
	 /**
	  * @return the contrasenaUsuario
	  */
	 public String getContrasenaCliente() {
	  return contrasenaCliente;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setContrasenaCliente (String contrasenaCliente) {
	  this.contrasenaCliente = contrasenaCliente;
	 }
	 
	 
}
