"use strict"
let valorIngresado = document.querySelector("#betNumber").value;
let botonJugar = document.querySelector("#btnPlay").addEventListener("click", jugar);

// botones
// let botonRojo = document.querySelector("#btnRed");
// let botonVerde = document.querySelector("#btnGreen");
// let botonNegro = document.querySelector("#btnBlack");


// let colorUsuario = "";

// botonRojo.addEventListener("click", function() {
//     guardarColor("red");
// });
// botonNegro.addEventListener("click", function() {
//     guardarColor("black");
// });
// botonVerde.addEventListener("click", function() {
//     guardarColor("green");
// });

// function guardarColor(color) {
//     colorUsuario = color;
// }

function jugar() {
    // genero los numeros de la maquina
    let numeroRandom = Math.floor(Math.random() * 37);
    console.log(numeroRandom);

    let divNum = document.querySelector("#resultadoNumerico").innerHTML = numeroRandom;

    if(numeroRandom === valorIngresado)
        alert("Has ganado");
    else 
        alert("Has perdido, vuelve a intentarlo");
}
