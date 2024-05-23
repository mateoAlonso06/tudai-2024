"use strict"

// botones
let sumar = document.querySelector("#sumar");
let restar = document.querySelector("#restar");
let agregar = document.querySelector("#agregar");

// resultado
let pasosVista = document.querySelector("#cantidadPasos");

let cantidadPasos = 0;

sumar.addEventListener("click", () => {
    cantidadPasos++;
    pasosVista.innerHTML = cantidadPasos;
});

restar.addEventListener("click", () => {
    if (cantidadPasos > 0) 
        cantidadPasos--;

    pasosVista.innerHTML = cantidadPasos;
});

agregar.addEventListener("click", () => {
    let valorInput = document.querySelector("#ingresarCantidad").value;
    if (valorInput > 0) {
        cantidadPasos += parseInt(valorInput);
        pasosVista.innerHTML = cantidadPasos;
    }
});