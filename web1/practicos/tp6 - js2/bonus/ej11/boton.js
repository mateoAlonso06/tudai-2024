"use strict"

document.addEventListener("click", iniciar());

function iniciar() {
    const btnCambiarEstilo = document.querySelector("#changeStyle").addEventListener("click", () => {
        let headers = document.querySelectorAll("h1");

        headers.forEach(header => {
            let siguienteParrafo = header.nextElementSibling;
            if (siguienteParrafo && siguienteParrafo.tagName.toLowerCase() === 'p') {
                siguienteParrafo.classList.toggle("modificado");
            }
        });
    });
}