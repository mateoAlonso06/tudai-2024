"use strict"

document.addEventListener("click", iniciar);

function iniciar() {
    let botonesVerMas = document.querySelectorAll(".ver-mas");

    function desplegarContenido(event) {
        // Obtiene el id del contenido relacionado a este botón 
        const targetId = event.target.getAttribute('data-target');
        const content = document.getElementById(targetId);

        // Permite alternar la visibilidad del contenido
        if (content.style.display === 'none' || content.style.display === '') {
            content.style.display = 'block';
        }
        else {
            content.style.display = 'none';
        }
    }

    // Por ultimo añado a cada boton de la lista de nodos el event listener con la función necesaria
    for (let boton of botonesVerMas) {
        boton.addEventListener("click", desplegarContenido);
    }
}