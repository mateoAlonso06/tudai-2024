console.log("Intro js web 1");

// alert("Intro js web 1");

// dentro de la funcion alert puedo utilizar tanto literales como variables

console.log("El console log es una buena herramienta de debug!");
// el console log me permite mostrar mensajes en la consola. Es una buena herramienta de debuggin

// Declaracion de variables y constantes con let y const
let saludoDesdeVariable = "Hola mundo desde variable";
const NUMERO_PI = 3.141516;

console.log(saludoDesdeVariable);
console.log(`Soy la constante PI y mi valor es: ${NUMERO_PI}`);

// Pedir que el usuario ingrese un valor mediante el uso de un prompt
let nombre = prompt("Ingrese su nombre:");
let apellido = prompt("Ingrese su apellido:");

let nombreCompleto = `${nombre} ${apellido}`;

alert(`Bienvenido ${nombreCompleto}`);