"use strict"

document.addEventListener("DOMContentLoaded", iniciar);
function iniciar() {
    const btnAnterior = document.querySelector("#anterior");
    const btnSiguiente = document.querySelector("#siguiente");
    const img = document.querySelector("#imgGaleria");

    let contador = 0;

    btnSiguiente.addEventListener("click", () => {
        console.log(contador);
        if (contador < 10) {
            contador++;
            img.src = `img/${contador}.jpg`;
        } else {
            contador = 1;
            img.src = `img/${contador}.jpg`;
        }
    });

    btnAnterior.addEventListener("click", () => {
        console.log(contador);
        if (contador > 1) {
            contador--;
            img.src = `img/${contador}.jpg`;
        } else {
            contador = 10;
            img.src = `img/${contador}.jpg`;
        }
    });
}