"use strict"

let btnPrender = document.querySelector("#prender").addEventListener("click", prender);
let btnApagar = document.querySelector("#apagar").addEventListener("click", apagar);

function prender() {
    let background = document.querySelector("#fondo");
    background.classList.remove("apagado");
    document.querySelector("#fondo").classList.add("prendido");
}

function apagar() {
    let background = document.querySelector("#fondo");
    background.classList.remove("prendido");
    background.classList.add("apagado");
}
// const prender = () => document.querySelector("#fondo").classList.add("prendido");
// const apagar = () => document.querySelector("#fondo").classList.add("apagado");