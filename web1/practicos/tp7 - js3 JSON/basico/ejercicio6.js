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

// console table de cada elemento dentro del array
for (let element of tabla) {
    console.table(element);
}

// mostrar por consola las estadisticas del primer equipo
for (let val in tabla[0]) {
    if (tabla[0].hasOwnProperty(val)) 
        console.log(`${val}: ${tabla[0][val]}`);
}

// mostrar por consola la cantidad de equipos de la tabla
console.log("La cantidad de equipos es de: " + tabla.length);

// imprimir usando el DOM la diferencia de puntos entre el primer y segundo equipo de la tabla
let resultado = document.querySelector("#resultado");

// tomo los valores de cada objeto en su propiedad puntos y los resto
let diferencia = tabla[0].puntos - tabla[tabla.length - 1].puntos;
resultado.innerHTML = diferencia;
