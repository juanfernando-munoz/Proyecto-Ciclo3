alert("conectado");

function escribir1(){
    let cedula = document.getElementById('cedula').value;
    let direccion = document.getElementById('direccion').value;
    let email = document.getElementById('email').value;
    let nombre = document.getElementById('nombre').value;
    let telefono = document.getElementById('telefono').value;

    document.getElementById('txt1').innerHTML = `Cedula: `+ cedula;
    document.getElementById('txt2').innerHTML = `Direccion: `+ direccion;
    document.getElementById('txt3').innerHTML = `Email: `+ email;
    document.getElementById('txt4').innerHTML = `Nombre: `+ nombre;
    document.getElementById('txt5').innerHTML = `Telefono: `+ telefono;
}

function escribir2(){
    let nit = document.getElementById('nit').value;
    let telefono = document.getElementById('telefono').value;
    let nombre = document.getElementById('nombre').value;
    let ciudad = document.getElementById('ciudad').value;
    let direccion = document.getElementById('direccion').value;

    document.getElementById('txt1').innerHTML = `NIT: `+ nit;
    document.getElementById('txt2').innerHTML = `Telefono: `+ telefono;
    document.getElementById('txt3').innerHTML = `Nombre: `+ nombre;
    document.getElementById('txt4').innerHTML = `Ciudad: `+ ciudad;
    document.getElementById('txt5').innerHTML = `Dirección: `+ direccion;
}

function escribir3(){
    let cedula = document.getElementById('cedula').value;
    let usuario = document.getElementById('usuario').value;
    let nombre = document.getElementById('nombre').value;
    let contrasena = document.getElementById('contrasena').value;
    let correo = document.getElementById('correo').value;

    document.getElementById('txt1').innerHTML = `Cedula: `+ cedula;
    document.getElementById('txt2').innerHTML = `Usuario: `+ usuario;
    document.getElementById('txt3').innerHTML = `nombre: `+ nombre;
    document.getElementById('txt4').innerHTML = `Contrasena: `+ contrasena;
    document.getElementById('txt5').innerHTML = `Correo: `+ correo;
}