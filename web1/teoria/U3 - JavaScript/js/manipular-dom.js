let nuevoParrafo = document.querySelector("#parrafo");
// mediante un document query selector y un id incluido entre comillas puedo obtener el nodo del DOM que me va a permitir modificar el parrafo

nuevoParrafo.innerHTML = "Texto incluido desde JS";
nuevoParrafo.innerHTML = "Ahora soy el texto 2";
// piso el valor del parrafo primero con el primer inner html y luego con el segundo

// definicion de una funcion sin parametros y que no retorna ningun valor
function saludarCatedra() {
    // tomar valor del input con el metodo .value
    let nombreDeUsuario = document.querySelector("#nombre").value;
    console.log(nombreDeUsuario);

    console.log("hola profe de tmc");
    console.log("hola profe de prog 1");
    console.log("hola profe de web 1");
    console.log("hola profe de ingles 1");
    console.log("hola profe de ingles 2");
    console.log("hola profe de tio");
}

// contar los clicks

// mediante el addEventListener puedo llamar al evento, al utilizar esta funcion necesito de pasar dos parametros
// addEvenListener(1.El nombre del evento: keychange, press, click, etc... 2.El nombre de la funcion sin PARENTESIS)
let btnContarClicks = document.querySelector("#btn-contador").addEventListener("click", contadorClicks);

// tambien se pueden llamar a funciones anonimas dentro de un addEventListener

let cantidadClicks = 0;

function contadorClicks() {
    cantidadClicks++;
    document.querySelector("#resultado").innerHTML = `${cantidadClicks}`;
}