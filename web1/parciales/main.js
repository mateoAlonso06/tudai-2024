"use strict"

let btnAgregar = document.querySelector("#btn-agregar");
let btnMostrar = document.querySelector("#btn-mostrar");

let formularioAlumnos = document.querySelector("#formulario-alumnos");
formularioAlumnos.addEventListener("submit", (e) => e.preventDefault());

btnAgregar.addEventListener("click", agregar);
btnMostrar.addEventListener("click", mostrar);

// declaro mi arreglo de objetos
let listadoAlumnos = [];

function agregar() {
    let informacion = new FormData(formularioAlumnos);

    let nombreAlumno = informacion.get("nombre");
    let calificacionAlumno = parseFloat(informacion.get("calificacion"));

    let nuevoAlumno = {
        "nombre": nombreAlumno,
        "calificacion": calificacionAlumno
    }

    listadoAlumnos.push(nuevoAlumno);
}

function mostrar() {
    let listaResultados = document.querySelector("#resultado-alumnos");

    listaResultados.innerHTML = "";

    for (let i = 0; i < listadoAlumnos.length; i++) {
        if (listadoAlumnos[i].calificacion > 3) 
            listaResultados.innerHTML+= `<li>${listadoAlumnos[i].nombre}</li>`;
        else
            listaResultados.innerHTML+= `<li class="destacado">${listadoAlumnos[i].nombre}</li>`;    
    }
}