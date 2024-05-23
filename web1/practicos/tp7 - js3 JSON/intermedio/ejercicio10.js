"use strict"

let tabla = [
    {
        "nombre": "Barcelona FC",
        "puntos": 98,
        "pj": 35,
        "pg": 32,
        "pe": 2,
        "pp": 1
    },
    {
        "nombre": "Atlético de Madrid",
        "puntos": 74,
        "pj": 35,
        "pg": 22,
        "pe": 8,
        "pp": 5
    },
    {
        "nombre": "Real Madrid",
        "puntos": 72,
        "pj": 34,
        "pg": 20,
        "pe": 4,
        "pp": 10
    },
    {
        "nombre": "Villarreal FC",
        "puntos": 70,
        "pj": 34,
        "pg": 20,
        "pe": 4,
        "pp": 10 
    },
    {
        "nombre": "Betis FC",
        "puntos": 65,
        "pj": 34,
        "pg": 20,
        "pe": 4,
        "pp": 10
    }
];

let btnRecorrer = document.querySelector("#btnRecorrer").addEventListener("click", imprimir);
let tablaEquipos = document.querySelector("#tabla");

function imprimir() {
    tablaEquipos.innerHTML = "";
    tablaEquipos.innerHTML =
        `<tr>
            <th>Equipo</th>
            <th>Puntos</th>
            <th>Pj</th>
            <th>Pg</th>
            <th>Pe</th>
            <th>Pp</th>
        </tr>`
    for (let i = 0; i < tabla.length; i++) {
        tablaEquipos.innerHTML +=
        `<tr>
            <td>${tabla[i].nombre}</th>
            <td>${tabla[i].puntos}</th>
            <td>${tabla[i].pj}</th>
            <td>${tabla[i].pg}</th>
            <td>${tabla[i].pe}</th>
            <td>${tabla[i].pp}</th>
        </tr>`
    }
}

const btnAgregar = document.querySelector("#btnAgregar").addEventListener("click", agregarEquipo);

function agregarEquipo() {
    const form = document.querySelector("#form");
    /*La interfaz FormData proporciona una manera sencilla de construir un conjunto
    de parejas clave/valor que representan los campos de un formulario y sus valores*/
    let formData = new FormData(form);

    // una vez obtenidos todos los valores de los inputs solo resta agregarlos al objeto
    let nombre_equipo = formData.get("nombre-equipo");
    let puntos_totales = formData.get("puntos");
    let partidos_jugados = formData.get("pj");
    let partidos_ganados = formData.get("pg");
    let partidos_perdidos = formData.get("pp");
    let partidos_empatados = formData.get("pe");

    let nuevoEquipo = {
        "nombre": nombre_equipo,
        "puntos": Number(puntos_totales),
        "pj": Number(partidos_jugados),
        "pg": Number(partidos_ganados),
        "pe": Number(partidos_empatados),
        "pp": Number(partidos_perdidos)
    }

    if (!existe(nuevoEquipo))
        tabla.push(nuevoEquipo);
    else
        alert("El equipo ya existe");
}

function existe(equipo) {
    let existe = false;
    for (let i = 0; i < tabla.length; i++) {
        if (tabla[i].nombre.toLowerCase() === equipo.nombre.toLowerCase())
            existe = true;
    }
    return existe;
}
