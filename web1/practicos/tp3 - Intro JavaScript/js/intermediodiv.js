"use strict";

let btnCambiar = document.querySelector("#btnCambiarColor").addEventListener("click", function() {
    let divMain = document.querySelector("#divEx");

    divMain.classList.toggle("divprops-js");
})