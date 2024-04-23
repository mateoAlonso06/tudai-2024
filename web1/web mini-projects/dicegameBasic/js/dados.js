"use strict"
let btnTirarDados = document.querySelector("#btn-tirar").addEventListener("click", lanzarDados);
let btnSumar = document.querySelector("#btn-sumar").addEventListener("click", sumarResultado);

// variables globales
let resultado1 = 0, resultado2 = 0;

function lanzarDados() {
    console.log("simulando tirada");
    // tomo las imagenes del html
    let img1 = document.querySelector("#dado1");
    let img2 = document.querySelector("#dado2");

    resultado1 = Math.floor((Math.random() * 6) + 1);
    resultado2 = Math.floor((Math.random() * 6) + 1);

    img1.src = "img/dado"+resultado1+".png";
    img2.src = "img/dado"+resultado2+".png";
}

function sumarResultado() {
    let divContenedor = document.querySelector(".resultado");
    let resultado = document.querySelector("#result");

    if ((resultado1 + resultado2) == 8) {
        divContenedor.classList.remove("perdedor");
        divContenedor.classList.add("ganador");
        resultado.innerHTML = "";
        resultado.innerHTML = "Felicidades ha ganado!";
    }
    else {
        divContenedor.classList.remove("ganador");
        divContenedor.classList.add("perdedor");
        resultado.innerHTML = "";
        resultado.innerHTML = "Lo sentimos, vuelva a intentarlo!"
    }
}