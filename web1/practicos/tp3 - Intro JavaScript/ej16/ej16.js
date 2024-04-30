"use strict";

let valorAnimal = document.querySelector("#animal").value;
let btnPlay = document.querySelector("#jugar").addEventListener("click", jugar);
let image = document.querySelector("#imgAnimal");

generarImagen();

let animalActual = "";

function generarImagen() {
    let numeroRandom = Math.floor(Math.random() * (6 - 1 + 1)) + 1;
    image.src = "img/img"+numeroRandom+".jpg";

    switch()
}

function jugar()

