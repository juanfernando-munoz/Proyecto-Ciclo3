<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="Proyecto de entrenamiento en desarrollo web" />
        <meta name="author" content="Ing. Diego Rodriguez" />
        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js"
            crossorigin="anonymous">
        </script>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
      	<title>Productos</title>
		<style>
			.submit {
				background-color: #a5a5a5;
				padding: .4em;
				-moz-border-radius: 5px;
				-webkit-border-radius: 5px;
				border-radius: 6px;
				color: white;
				font-family: 'Tahoma';
				size: 2;
				text-decoration: none;
				border: none;
				text-align: center;
				margin: 15px;
				margin-top: -2px;
			}
			.submit:hover {
				border: none;
				background: salmon;
				box-shadow: 0px 0px 1px #777;
			}
			.submit1 {
				background-color: #a5a5a5;
				padding: .5em;
				-moz-border-radius: 5px;
				-webkit-border-radius: 5px;
				border-radius: 6px;
				color: white;
				font-family: 'Tahoma';
				size: 2;
				text-decoration: none;
				border: none;
				text-align: center;
				margin: 15px;
				margin-top: 0.1px;
				position: relative;
				left: 200px; 
			}
			.submit:hover {
				border: none;
				background: salmon;
				box-shadow: 0px 0px 1px #777;
			}
			.header {
				padding: 0.1px;
				text-align: Left;
				background: #a5a5a5;
				color: white;
				font-size: 2;
				font-family: 'Tahoma';
				padding-left:10px; 
			}			
			.topnav {
				background-color: white;
				overflow: hidden;
				border-bottom: 5px;
				border-bottom-style: solid;
				border-bottom-color: #a5a5a5;
				border-bottom-width: thin;
			}
			.topnav a {
				float: left;
				color: #bebaba;
				text-align: center;
				padding: 10px 25px;
				text-decoration: none;
				font-size: 12px;
				font-family: 'Tahoma';
			}
			.topnav a:hover {
				background-color: grey;
				color: black;
			}
			.topnav a.active {
				background-color: grey;
				color: black;
			}
		</style>
			<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    </head>	
    <body>
    	<form id="form1" method = "POST" accion="ClienteController">
   		<div class="header">
  			<p> Tienda Generica</p>
		</div>
		<div class="topnav">
			<a href="Usuarios.html">Usuarios</a>
			<a href="Clientes.html">Clientes</a>
			<a href="Proveedores.html">Proveedores</a>
			<a class="active" href="Productos.html">Productos</a>
			<a href="Ventas.html">Ventas</a>
			<a href="Reportes.html">Reportes</a>
		</div>
		</br></br> 
		<div >
        <p style="left:200px"><label for="file" class="submit" type="file">Examinar</label> 
        <input id="file" type="file" accept=".csv" style="display:none;"/>
        <p><button class="submit1" type="submit" onclick ="subirArchivo()">Cargar</button></p>
		</div>
		<script>
			$(document).ready(function() {
				$('input[type="file"]').change(function(e) {
					var geekss = e.target.files[0].name;
					alert(geekss + ', se ha seleccionado el archivo.');
		
				});
			});
		</script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="js/scripts.js"></script>
    <script>includeHTML();</script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
    <script>
        function subirArchivo() {
            try {
                var csvFile = document.getElementById("archivo");
                var input = csvFile.files[0];
                var reader = new FileReader();
                
                reader.onload = function(e) {
                    var text = e.target.result;
                    var arrayLineas = text.split("\n");
                    var xhr = new XMLHttpRequest();
                    xhr.open("DELETE",
                    		"http://localhost:8080/eliminartodoproducto", true);
                    xhr.send();
					 for (var i = 1; i < arrayLineas.length; i += 1) {
                        var arraydatos = arrayLineas[i].split(",");
                        if (arrayLineas[i] == "") {
                            continue;
                        }
                        for (var j = 0; j < arraydatos.length; j += 1) {
                            console.log(i + " " + j + "->" + arraydatos[j]);
                        }
                        var formData = new FormData();
                        formData.append("codigo_producto", arraydatos[0]);
                        formData.append("nombre_producto", arraydatos[1]);
                        formData.append("nitproveedor", arraydatos[2]);
                        formData.append("precio_compra", arraydatos[3]);
                        formData.append("ivacompra", arraydatos[4]);
                        formData.append("precio_venta", arraydatos[5]);
                        var xhr = new XMLHttpRequest();
                        xhr.open("POST",
                                "http://localhost:8080/registrarproducto");
                        xhr.send(formData);
                    }
                    var element = document.getElementById("error");
                    element.classList.add("visually-hidden");
                    var element2 = document.getElementById("correcto");
                    element2.classList.remove("visually-hidden");
                    document.getElementById("archivo").value = "";
                };
                reader.readAsText(input);
            } catch (error) {
                var element = document.getElementById("error");
                element.classList.remove("visually-hidden");
                var element2 = document.getElementById("correcto");
                element2.classList.add("visually-hidden");
                document.getElementById("archivo").value = "";
            }
        }
    </script>
</html>