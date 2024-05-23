"use strict"

document.addEventListener("DOMContentLoaded", iniciar);

function iniciar() {
    const div = document.querySelector("#bloque");

    setTimeout(cambiarDeColor, 1000);

    function cambiarDeColor() {
        let clases = ["red", "blue", "yellow", "green", "pink"]
        let i = 0;
        let intervalo = setInterval(() => {
            if (i > 0) {
                div.classList.remove(clases[i - 1]);
            } else {
                div.classList.remove(clases[clases.length - 1]);
            }

            div.classList.add(clases[i]);
            
            i = (i + 1) % clases.length;
        }, 500);
    }
}