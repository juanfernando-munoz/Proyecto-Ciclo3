package com.DTO.TiendaVirtualSB;

public class ClienteVO {
	
	 private Integer cedulaUsuario;
	 private String nombreUsuario;
	 private String correoUsuario;
	 private String usuarioUsuario;
	 private String contrasenaUsuario;

	 
	 /**
	  * @return the cedula
	  */
	 public Integer getcedulaUsuario() {
	  return cedulaUsuario;
	 }
	 
	 /**
	  * @param cedula 
	  */
	 public void setcedulaUsuario(Integer cedula) {
	  this.cedulaUsuario = cedulaUsuario;
	 }
	 
	 
	 /**
	  * @return the nombreCliente
	  */
	 public String getnombreUsuario() {
	  return nombreUsuario;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setnombreUsuario(String nombreCliente) {
	  this.nombreUsuario = nombreUsuario;
	 }
	 
	 
	 /**
	  * @return the correo
	  */
	 public String getCorreoUsuario() {
	  return correoUsuario;
	 }
	 /**
	  * @param correo
	  */
	 public void setCorreoUsuario (String correo) {
	  this.correoUsuario = correoUsuario;
	 }
	 
	 /**
	  * @return the usuario
	  */
	 public String getUsuarioUsuario() {
	  return usuarioUsuario;
	 }
	 /**
	  * @param usuario
	  */
	 public void setUsuarioUsuario (String usuario) {
	  this.usuarioUsuario = usuarioUsuario;
	 }
	 /**
	  * @return the contrasenaUsuario
	  */
	 public String getContrasenaUsuario() {
	  return contrasenaUsuario;
	 }
	 /**
	  * @param nombreCliente the nombreCliente to set
	  */
	 public void setContrasenaUsuario (String contrasena) {
	  this.contrasenaUsuario = contrasenaUsuario;
	 }

}
