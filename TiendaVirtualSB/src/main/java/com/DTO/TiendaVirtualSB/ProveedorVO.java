package com.DTO.TiendaVirtualSB;

public class ProveedorVO {
	
	private Integer nit;
	private String ciudadProveedor;
	private String direccionProveedor;
	private String nombreProveedor;
	private Integer telefonoProveedor;
	
	public ProveedorVO() {};
	
	public ProveedorVO(Integer nit, String ciudadProveedor, String direccionProveedor, String nombreProveedor, Integer telefonoProveedor) {
		this.nit=nit;
		this.ciudadProveedor=ciudadProveedor;
		this.direccionProveedor=direccionProveedor;
		this.nombreProveedor=nombreProveedor;
		this.telefonoProveedor=telefonoProveedor;
	};
	
	public Integer getNit() {
		return nit;
	}
	public void setNit(Integer nit) {
		this.nit = nit;
	}
	public String getCiudadProveedor() {
		return ciudadProveedor;
	}
	public void setCiudadProveedor(String ciudadProveedor) {
		this.ciudadProveedor = ciudadProveedor;
	}
	public String getDireccionProveedor() {
		return direccionProveedor;
	}
	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public Integer getTelefonoProveedor() {
		return telefonoProveedor;
	}
	public void setTelefonoProveedor(Integer telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}
	
}
