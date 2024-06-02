"use strict"
document.addEventListener('DOMContentLoaded', () => {
    // botones
    let btnRegistrar = document.querySelector("#btn-registrar");
    let btnSortear = document.querySelector("#btn-sortear");
    // formulario
    let formRegistro = document.querySelector("#form-registro");

    // resultados
    let listaSorteo = document.querySelector("#lista_sorteo");
    let avisoGanador = document.querySelector("#aviso_ganador");

    // eventos
    formRegistro.addEventListener('submit', (event) => event.preventDefault());

    btnRegistrar.addEventListener('click', agregar);
    btnSortear.addEventListener('click', sortear);

    let participantes = [];

    function agregar() {
        let form_data = new FormData(formRegistro);

        let nombre_participante = form_data.get('nombre');
        let dni_participante = parseInt(form_data.get('dni'));
        let edad_participante = parseInt(form_data.get('edad'));

        let participante = {
            "nombre": nombre_participante,
            "dni": dni_participante,
            "edad": edad_participante
        };

        participantes.push(participante);
        formRegistro.reset();
    }

    function sortear() {
        if (participantes.length > 0) {
            mostrarParticipantes();
    
            let ganador = Math.floor(Math.random() * participantes.length);
    
            avisoGanador.innerHTML = `<p class="ganador">${participantes[ganador].nombre}, dni: ${participantes[ganador].dni}, edad: ${participantes[ganador].edad}</p>`;
        } else {
            avisoGanador.innerHTML = "No hay ningun participante en la lista";
        }
    }

    function mostrarParticipantes() {
        listaSorteo.innerHTML = "";

        for (let i = 0; i < participantes.length; i++) {
            listaSorteo.innerHTML+= `<li>${participantes[i].nombre}, dni: ${participantes[i].dni}</li>`;
        }
    }
});