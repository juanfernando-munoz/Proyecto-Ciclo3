package com.DTO.TiendaVirtualSB;

public class ClienteVO {

    private Integer cedulaUsuario;
    private String nombreUsuario;
    private String correoUsuario;
    private String usuarioUsuario;
    private String contrasenaUsuario;
    private Integer cedulaCliente;
    private String nombreCliente;
    private String correoCliente;
    private String usuarioCliente;
    private String contrasenaCliente;


    public ClienteVO(){};

    public ClienteVO(Integer cedulaUsuario, String nombreUsuario, String correoUsuario, String usuarioUsuario, String contrasenaUsuario, Integer cedulaCliente, String nombreCliente, String correoCliente, String usuarioCliente, String contrasenaCliente){
        this.cedulaUsuario=cedulaUsuario;
        this.nombreUsuario=nombreUsuario;
        this.correoUsuario=correoUsuario;
        this.usuarioUsuario=usuarioUsuario;
        this.contrasenaUsuario=contrasenaUsuario;
        this.cedulaCliente=cedulaCliente;
        this.nombreCliente=nombreCliente;
        this.correoCliente=correoCliente;
        this.usuarioCliente=usuarioCliente;
        this.contrasenaCliente=contrasenaCliente;
    };
    public Integer getCedulaUsuario() {
        return cedulaUsuario;
    }
    public void setCedulaUsuario(Integer cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getCorreoUsuario(){
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getUsuarioUsuario() {
        return usuarioUsuario;
    }
    public void setUsuarioUsuario(String usuarioUsuario) {
        this.usuarioUsuario = usuarioUsuario;
    }
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }
    public Integer getCedulaCliente() {
        return cedulaCliente;
    }
    public void setCedulaCliente(Integer cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getCorreoCliente() {
        return correoCliente;
    }
    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
    public String getUsuarioCliente() {
        return usuarioCliente;
    }
    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }
    public String getContrasenaCliente() {
        return contrasenaCliente;
    }
    public void setContrasenaCliente(String contrasenaCliente) {
        this.contrasenaCliente = contrasenaCliente;
    }	 
}