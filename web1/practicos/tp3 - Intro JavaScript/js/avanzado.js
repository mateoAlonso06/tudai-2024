"use strict";

let botonMostrar = document.querySelector("#botonMostrar").addEventListener("click", mostrar);

function mostrar() {
    let div = document.querySelector(".info-container");

    div.classList.toggle("info-display");
}