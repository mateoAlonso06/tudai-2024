"use strict"

let equipo = {
    "nombre": "Barcelona FC",
    "puntos": 98,
    "pj": 35,
    "pg": 32,
    "pe": 2,
    "pp": 1
}

//1. analiza que muestra console.log(equipo)
console.log(equipo);
// muestra el objeto por completo y sus propiedades

//2.Mostrar por consola estadisticas del equipo
for (let val in equipo) {
    if (equipo.hasOwnProperty(val))
        console.log(`${val}: ${equipo[val]}`);
}

// con el metodo hasOwnProperty evaluamos si el objeto cuenta con la propiedad dicha y luego la imprimo
// utilizo notación de corchetes para mostrar la propiedad del objeto ya que estamos accediendo mediante una variable



