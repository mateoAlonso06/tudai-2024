"use strict";

// ejercicio 1
// let nombre = "Mateo";
// let apellido = "Alonso";
// alert(`Bienvenido ${nombre} ${apellido}`);

// ejercicio 2
let contenedor = document.querySelectorAll(".contenedor");


contenedor.forEach(function(contenedor) {
    let nuevoParrafo = document.createElement("p");
    nuevoParrafo.textContent = "Rellenando el div con una etiqueta p";
    contenedor.appendChild(nuevoParrafo);

    // ejercicio 2.b
    let segundoParrafo = document.createElement("p");
    segundoParrafo.textContent = "Hola soy el segundo parrafo";
    contenedor.appendChild(segundoParrafo);
});

// utilizo un for each porque al seleccionar document.querySelectorAll esto devuelve una lista de nodos
// sobre la cual itero con el foreach y en cada uno de sus nodos relleno el div con una etiqueta p

// ejercicio 3
let resultado = document.querySelector("#resultado");

let boton1 = document.querySelector("#boton1").addEventListener("click", function() {
    crearTexto("1: blue");
});
let boton2 = document.querySelector("#boton2").addEventListener("click", function() {
    crearTexto("2: red");
});
let boton3 = document.querySelector("#boton3").addEventListener("click", function() {
    crearTexto("3: yellow");
});

function crearTexto(boton) {
    resultado.innerHTML = "";
    resultado.innerHTML = boton;
}