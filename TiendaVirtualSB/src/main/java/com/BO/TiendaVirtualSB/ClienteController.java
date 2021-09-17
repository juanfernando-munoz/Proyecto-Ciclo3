package com.BO.TiendaVirtualSB;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
public class ClienteController {
	
	
	@RequestMapping("/registrarPersona")
	public void registrarPersona(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarPersona(persona);

	 }
	   
	
	public void ProcessRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		ClienteDAO Dao=new ClienteDAO(); 
		ClienteVO p=new ClienteVO();
	    int r;
		response.setContentType("text/html/charset=UTF-8");
		String accion=request.getParameter("accion");
		if (accion.equals("Aceptar")){
			String nom=request.getParameter("uname");
			String pass=request.getParameter("psw");
			p.setUsuario(nom);
			p.setContrasena(pass);
			r=Dao.Validar(p);
			if(r==1) {
				request.getRequestDispatcher("Clientes.html").forward(request, response);
			}else {
				request.getRequestDispatcher("login.html").forward(request, response);
			}
		}
		
	}
	;
	 
	 
	/**
	 * permite consultar el Cliente asociado al documento enviado
	 * como parametro 
	 * @param documento 
	 * @return
	 */
	
	@RequestMapping("/consultarPersona")
	public ArrayList<ClienteVO> consultarPersona(int documento) {
		ClienteDAO Dao=new ClienteDAO(); 
	return 	Dao.consultarPersona(documento);
		
	}



	/**
	 * permite consultar la lista de Clientes
	 * @return
	 */
	@RequestMapping("/listarPersonas")
	public ArrayList< ClienteVO> listaDePersonas() {
		ClienteDAO Dao=new ClienteDAO(); 
	
		return Dao.listaDePersonas();
		
	}
	@RequestMapping("/modificarPersona")
	public void modificarPersona(ClienteVO persona) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.modificarPersona(persona);
	    
	 }

}