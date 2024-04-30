"use strict";

let inputNombre = document.querySelector("#nombre");
let inputApellido = document.querySelector("#apellido");
let inputProfesion = document.querySelector("#profesion");
let inputCorreo = document.querySelector("#correo");
let inputPhone = document.querySelector("#numberPhone");
let inputAddress = document.querySelector("#direccion");

// addEvenListenrs
inputNombre.addEventListener("keyup", function() {
    let texto = inputNombre.value;
    let nombre = document.querySelector("#tarjetaNombre");
    if (texto == "") 
        nombre.innerText = "Nombre";
    else 
        nombre.innerText = texto;
});

inputApellido.addEventListener("keyup", function() {
    let texto = inputApellido.value;
    let apellido = document.querySelector("#tarjetaApellido");
    if (texto == "") 
        apellido.innerText = "Apellido";
    else 
        apellido.innerText = texto;
});


inputProfesion.addEventListener("keyup", function(){
    let texto = inputProfesion.value;
    let profesion = document.querySelector("#tarjetaProfesion");
    if (texto == "") {
        profesion.innerText = "Profesion";
        profesion.classList.add("placeholder");
    }
    else {
        profesion.classList.remove("placeholder");
        profesion.innerText = texto;
    }
});


inputCorreo.addEventListener("keyup", function(){
    let texto = inputCorreo.value;
    let correo = document.querySelector("#tarjetaCorreo");
    if (texto == "") {
        correo.innerText = "Direccion de correo";
        correo.classList.add("placeholder");
    }
    else {
        correo.classList.remove("placeholder");
        correo.innerText = texto;
    }
});

inputPhone.addEventListener("keyup", function(){
    let texto = inputPhone.value;
    let telefono = document.querySelector("#tarjetaNumero");
    if (texto == "") {
        telefono.innerText = "Numero de telefono";
        telefono.classList.add("placeholder");
    }
    else {
        telefono.classList.remove("placeholder");
        telefono.innerText = texto;
    }
});

inputAddress.addEventListener("keyup", function(){
    let texto = inputAddress.value;
    let direccion = document.querySelector("#tarjetaDireccion");
    if (texto == "") {
        direccion.innerText = "Direccion";
        direccion.classList.add("placeholder");
    }
    else {
        direccion.classList.remove("placeholder");
        direccion.innerText = texto;
    }
});