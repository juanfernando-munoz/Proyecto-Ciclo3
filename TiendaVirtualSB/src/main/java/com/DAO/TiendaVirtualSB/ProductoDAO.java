package com.DAO.TiendaVirtualSB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.DTO.TiendaVirtualSB.ProductosVO;
import com.DTO.TiendaVirtualSB.ProveedorVO;
import com.DTO.TiendaVirtualSB.UsuarioVO;



public class ProductoDAO {

	public void registrarProducto(ProductosVO product) {
		
		Conexion conex = new Conexion();
		
		try {
			Statement estatuo = conex.getConnection().createStatement();
			
			String sentencia = "INSERT INTO productos VALUES("
					+ product.getCodigo_producto() + ","
					+ product.getIvacompra() + ","
					+ product.getNitproveedor() + ","
					+ product.getNombre_producto() + ","
					+ product.getPrecio_compra() + ","
					+ product.getPrecio_venta() + ""
					+ ");";
			
			estatuo.executeUpdate(sentencia);
			
			System.out.println("Registrado "+ sentencia);
			
			estatuo.close();
			conex.desconectar();
			
		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo registrar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo registrar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public ArrayList<ProductosVO> consultarProducto(Integer product) {
		
		ArrayList<ProductosVO> listaproductos = new ArrayList<ProductosVO>();
		
		Conexion conex = new Conexion();
		
		try {
			PreparedStatement consulta = conex.getConnection()
					.prepareStatement("SELECT * FROM productos where codigo_producto = ? ");
			consulta.setInt(1, product);
			ResultSet res = consulta.executeQuery();
			if (res.next()) {
				ProductosVO newproducto = new ProductosVO();
				newproducto.setCodigo_producto(Integer.parseInt(res.getString("codigo_producto")));
				newproducto.setIvacompra(Double.parseDouble(res.getString("ivacompra")));
				newproducto.setNitproveedor(Integer.parseInt(res.getString("nitproveedor")));
				newproducto.setNombre_producto(res.getString("nombre_producto"));
				newproducto.setPrecio_compra(Double.parseDouble(res.getString("precio_compra")));
				newproducto.setPrecio_venta(Double.parseDouble(res.getString("precio_venta")));
			
				listaproductos.add(newproducto);	
			}
			res.close();
			consulta.close();
			conex.desconectar();
			
		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo consultar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo consultar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		return listaproductos;
	}
	
	
	public ArrayList<ProductosVO> listaDeProductos() {
		
		ArrayList<ProductosVO> listaproductos = new ArrayList<ProductosVO>();
		
		Conexion conex = new Conexion();
		
		try {
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM productos");
			
			ResultSet res = consulta.executeQuery();
			
			while (res.next()) {
				ProductosVO newproducto = new ProductosVO();
				newproducto.setCodigo_producto(Integer.parseInt(res.getString("codigo_producto")));
				newproducto.setIvacompra(Double.parseDouble(res.getString("ivacompra")));
				newproducto.setNitproveedor(Integer.parseInt(res.getString("nitproveedor")));
				newproducto.setNombre_producto(res.getString("nombre_producto"));
				newproducto.setPrecio_compra(Double.parseDouble(res.getString("precio_compra")));
				newproducto.setPrecio_venta(Double.parseDouble(res.getString("precio_venta")));
				
				listaproductos.add(newproducto);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo consultar los productos");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo consultar los productos");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		return listaproductos;
	}
		
	public void eliminarProducto(Integer codigo_producto) {
		
		Conexion conex = new Conexion();
		
		try {
			
			Statement consulta = conex.getConnection().createStatement();
			
			String sentencia = "delete from productos where codigo_producto=" + codigo_producto + ";";
			
			System.out.println("Registrado" + sentencia);
			
			consulta.execute(sentencia);
			
			consulta.close();
			conex.desconectar();
			
		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo eliminar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo eliminar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}

	
	public void actualizarProducto(ProductosVO product) {
		
		Conexion conex = new Conexion();
		
		try {
			Statement estatuo = conex.getConnection().createStatement();
			
			String sentencia = "UPDATE productos "
					+ "SET ivacompra = " + product.getIvacompra() + ","
					+ "nombre_producto = " + product.getNombre_producto() + ","
					+ "nitproveedor = " + product.getNitproveedor() + ","
					+ "precio_compra = " + product.getPrecio_compra() + ","
					+ "precio_venta = " + product.getPrecio_venta() + ""
					+ "WHERE nitproveedor = " + product.getCodigo_producto() + ";";
			
			estatuo.executeUpdate(sentencia);
			
			System.out.println("Registrado" + sentencia);
			
			estatuo.close();
			conex.desconectar();
			
		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo actualizar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo actualizar el producto");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void eliminarTodoProducto() {
		
		Conexion conex = new Conexion();
		
		try {
			Statement consulta = conex.getConnection().createStatement();
			
			String sentencia = "delete from productos;";
			
			System.out.println("Registrado" + sentencia);
			
			consulta.execute(sentencia);
			
			consulta.close();
			conex.desconectar();
			
			
		} catch(SQLException e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo eliminar todos los producto");
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} catch (Exception e) {
			System.out.println("----------------ERROR---------------");
			System.out.println("No se pudo eliminar todos los producto");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}	
}
			
			
			

	
	
  



