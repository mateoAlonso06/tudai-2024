// Las funciones anonimas en JS son funciones que no tienen un nombre definido. Se usan frecuentemente como funciones de callback
// o cuando no se necesita reutilizar la función.

/*
callback: es una funcion que se pasa como argumento a otra funcion y se ejecuta despues de que la funcion
receptora haya completado su tarea, los callbacks permiten que el codigo se asincrono,
lo que significa que otras tareas pueden continuar ejecutandose mientras se espera que la operacion principal se complete

Esto es especialmente util en operaciones como la manipulación del DOM, llamadas a APIs o temporizadores 
*/
"use strict"

const btnRojo = document.querySelector("#btnRojo");
const btnAzul = document.querySelector("#btnAzul");
const btnAmarillo = document.querySelector("#btnAmarillo");

btnRojo.addEventListener("click", () => reemplazarTexto("rojo"));
btnAzul.addEventListener("click", () => reemplazarTexto("azul"));
btnAmarillo.addEventListener("click", () => reemplazarTexto("amarillo"));

const reemplazarTexto = color => document.querySelector("#resultado").innerHTML = color;

// ejercicio 2
let contador = 0;

btnRojo.addEventListener("click", () => actualizarContador());
btnAzul.addEventListener("click", () => actualizarContador());
btnAmarillo.addEventListener("click", () => actualizarContador());

function actualizarContador() {
    contador++;
    document.querySelector("#contador").innerHTML = contador;
}

// ejercicio 3
let btnCambios = document.querySelector("#btnCambios").addEventListener("click", () => {
    const elementos = document.querySelectorAll(".titulo");

    // cuando tomo todos los elementos con querySelector all debo utilizar una estructura repetitiva coomo for of o for each para recorrer todos los elementos de la lista de nodos
    for(let elemento of elementos) {
        elemento.classList.toggle("nuevaClase");
    }
});