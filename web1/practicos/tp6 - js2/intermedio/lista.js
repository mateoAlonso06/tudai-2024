"use strict"

const btnAgregar = document.querySelector("#agregar");
const btnEliminar = document.querySelector("#borrar");
const btnVaciar = document.querySelector("#vaciar");

const listaCont = document.querySelector("#lista");
const input = document.querySelector("#tarea");

btnAgregar.addEventListener("click", agregar);
btnEliminar.addEventListener("click", eliminar);
btnVaciar.addEventListener("click", vaciar);

const MAX = 10;
let lista = [];

function agregar() {
    let valor = input.value;

    if (lista.length < MAX && !valorRepetido(valor)) {
        lista.push(valor);
    } else {
        if (lista.length == MAX)
            alert("La lista alcanzo su maximo");
        else
            alert("El elemento ya existe dentro de la lista");
    }
    mostrarLista();
}

function eliminar() {
    if (lista.length > 0)
        lista.pop();

    mostrarLista();
}

function vaciar() {
    lista = [];
    listaCont.innerHTML = "";
    input.value = "";
}

function mostrarLista() {
    listaCont.innerHTML = "";

    for (let i = 0; i < lista.length; i++) {
        listaCont.innerHTML += "<li>" + lista[i] + "</li>";
    }
}

function valorRepetido(valor) {
    let existe = false;
    for (let elemento of lista) {
        if (valor === elemento)
            existe = true;
    }
    return existe;
}