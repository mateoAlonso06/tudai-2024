"use strict"

let btnContarParrafos = document.getElementById("contadorParrafos").addEventListener("click", () => {
    // contar cantidad de parrafos
    let contador = 0;

    const cantidadParrafos = document.querySelectorAll("p");
    const resultadoParrafos = document.querySelector("#cantidadParrafos");

    for (let parrafo of cantidadParrafos)
        contador++;

    resultadoParrafos.innerHTML = contador;
});

let btnContarItems = document.getElementById("contadorItems").addEventListener("click", () => {
    // contar cantidad de items de una lista
    let contador = 0;
    
    const lista = document.querySelector("#lista-menu");
    const resultadoItems = document.querySelector("#cantidadItems");

    for (const item of lista.children)
        contador++;

    resultadoItems.innerHTML = contador;
});

let btnContarNoticias = document.getElementById("contadorNoticias").addEventListener("click", () => {
    // contar cantidad de divs con la clase "noticia"
    let contador = 0;

    const totalNoticias = document.querySelectorAll(".noticia");
    const resultadoNoticias = document.querySelector("#cantidadNoticias");

    for (let noticia of totalNoticias)
        contador++;

    resultadoNoticias.innerHTML = contador;
});