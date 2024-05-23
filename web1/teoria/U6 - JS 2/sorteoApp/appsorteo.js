"use strict"

// tomo los elementos del dom y utilizo add even listeners
let btnAgregar = document.querySelector("#add").addEventListener("click", agregar);
// let btnBorrar = document.querySelector("#delete").addEventListener("click", borrar);
// let btnVaciar = document.querySelector("#clear").addEventListener("click", vaciar);
// let btnSortear = document.querySelector("#sortear").addEventListener("click", sortear);

// modelo de datos
let nombres = []; 

function agregar() {
    let nombre = document.querySelector("#nombre").value;

    nombres.push(nombre);

    // muestro el arreglo;
    mostrar(nombres);
}

function mostrar(arr) {
    let lista = document.querySelector("#li-container");
    lista.innerHTML = "";

    for (let i = 0; i < arr.length; i++) {
        lista.innerHTML += "<li>" + arr[i] + "</li>";
    }
}