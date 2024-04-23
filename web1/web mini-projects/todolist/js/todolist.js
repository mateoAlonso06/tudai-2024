"use strict";

let btnAgregar = document.querySelector("#btnAgregar").addEventListener("click", agregarTarea);
let btnLimpiarTodo = document.querySelector("#btnLimpiar").addEventListener("click", limpiarTodo);
let contenedorTareas = document.querySelector("#list-box");

function agregarTarea() {
    let tareaInput = document.querySelector("#tareaInput").value;

    let checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.value = tareaInput;

    let label = document.createElement("label");
    label.textContent = tareaInput;

    let liItem = document.createElement("li");
    liItem.appendChild(checkbox);
    liItem.appendChild(label);

    contenedorTareas.appendChild(liItem);
}

function limpiarTodo() {
    contenedorTareas.innerHTML = "";
}