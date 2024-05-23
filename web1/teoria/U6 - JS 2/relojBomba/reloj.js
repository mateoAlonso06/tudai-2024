"use strict"

// cargo todo el contenido del DOM
document.addEventListener('DOMContentLoaded', iniciar);

/* de esta manera encapsulo las variables y funciones de mi codigo
dentro de mi funcion y asi evitar variables globales
que podrian llegar a ocasionar problemas con otros archivos js */
function iniciar() {
    let btnActivarBomba = document.querySelector("#btnActivar");
    let cuentaRegresiva = document.querySelector("#cuentaRegresiva");
    let valorTiempo = document.querySelector("#tiempo");

    btnActivarBomba.addEventListener("click", iniciar);

    function iniciar() {
        const tiempoArranque = 5;
        alert(`Se iniciara la cuenta regresiva en ${tiempoArranque} segundos, corra!!!!!`);

        setTimeout(iniciarCuentaRegresiva, 5000);
    }

    function iniciarCuentaRegresiva() {
        let valorActual = valorTiempo.value;
        let intervalo = setInterval(() => {
            cuentaRegresiva.innerHTML = valorActual;
            if (valorActual !== 0) 
                valorActual--;
            else {
                clearInterval(intervalo);
                alert("Boooom!!");
            }
        }, 1000);
    }
}
