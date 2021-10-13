package com.BO.TiendaVirtualSB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DAO.TiendaVirtualSB.ProductoDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.DTO.TiendaVirtualSB.ProductosVO;
import com.DTO.TiendaVirtualSB.ProveedorVO;
import com.DTO.TiendaVirtualSB.UsuarioVO;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
public class ProductoController {

	
	@PostMapping("/registrarproducto")
	public void registrarProducto(ProductosVO product) {
		ProductoDAO Dao = new ProductoDAO();
		Dao.registrarProducto(product);
	}
	
	@GetMapping("/consultarproducto")
	public ArrayList<ProductosVO> consultarProducto(Integer code) {
		ProductoDAO Dao = new ProductoDAO();
		return Dao.consultarProducto(code);
	}
	
	@GetMapping("/listarproductos")
	public ArrayList<ProductosVO> listaDeProductos() {
		ProductoDAO Dao = new ProductoDAO();
		return Dao.listaDeProductos();
	}
	
	@DeleteMapping("eliminarproducto")
	public void eliminarProducto(Integer code) {
		ProductoDAO Dao = new ProductoDAO();
		Dao.eliminarProducto(code);
		
	}
	
	@DeleteMapping("/eliminartodoproducto")
	public void eliminarTodoProducto() {
		ProductoDAO Dao = new ProductoDAO();
		Dao.eliminarTodoProducto();
	}

	@PutMapping("/actualizarproducto")
	public void actualizarProducto(ProductosVO product) {
		ProductoDAO Dao = new ProductoDAO();
		Dao.actualizarProducto(product);
	}
	
}
