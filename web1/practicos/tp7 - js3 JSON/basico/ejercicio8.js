"use strict"

let btnBorrar = document.querySelector("#borrarParrafo");

btnBorrar.addEventListener("click", (e) => {
    borrarParrafo();
});

// elimino desde el ultimo elemento hasta el primero
function borrarParrafo() {
    let parrafos = document.querySelectorAll("p");
    if (parrafos.length > 0) 
        parrafos[parrafos.length - 1].remove();
}