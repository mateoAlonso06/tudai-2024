"use strict"

document.addEventListener('DOMContentLoaded', iniciar);

function iniciar() {
    const btnAgregar = document.querySelector("#agregar");
    const btnCalcularPromedio = document.querySelector("#calcular");

    let notas = [];

    // addEventListener
    btnAgregar.addEventListener("click", () => {
        let valorNota = parseFloat(document.querySelector("#nota").value);
        notas.push(valorNota);
        mostrarNotas();
    });

    btnCalcularPromedio.addEventListener("click", () => {
        const resultado = document.querySelector("#resultado-promedio");
        let acumulador = 0;
        for (let nota of notas) {
            acumulador += nota;
        }

        let promedio = acumulador / parseFloat(notas.length);
        resultado.innerHTML = `El promedio es: ${promedio}`;
    });

    function mostrarNotas() {
        let listaNotas = document.querySelector("#lista-de-notas");

        listaNotas.innerHTML = "";

        for (let nota of notas) 
            listaNotas.innerHTML += `<li>${nota}</li>`;
    }
}