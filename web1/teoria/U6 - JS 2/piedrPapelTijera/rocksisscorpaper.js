"use strict"
// elementos del DOM
let boton = document.querySelector("#play");

const opciones = ["piedra", "papel", "tijera", "lagarto", "spock"];

// even listeners
boton.addEventListener("click", jugar);

function jugar(e) {
    let resultadoCPU = document.querySelector("#resultadoCPU");

    // genero valores entre 0 (incluido) y el
    //tamaño MAXIMO del array (sin incluir) de esta manera nuestr
    // codigo será más dinamico
    let valorJugador = Math.floor(Math.random() * opciones.length);
    let valorCPU = Math.floor(Math.random() * opciones.length);

    resultadoCPU.innerHTML = opciones[valorCPU];
}