"use strict"

const btnMostrar = document.querySelector("#btnMostrar").addEventListener("click", partial);
const wrapper = document.querySelector("#wrapper-content");

// realizo un llamado asincrónico al servidor buscando el html partial
partial('./contenido.html');
function partial(url) {
    // el fetch esta realizando el pedido asincronico al servidor para traer el pedazo de contenido
    
    // then then catch
    console.log('1. Llamé al server');
    fetch(url)
        .then((response) => {
            console.log('2. Respondió el server');
            if (!response.ok) {
                throw new Error('404');
            }
            return response.text();
            // nos retorna otra promesa
        })
        .then((html) => {
            wrapper.innerHTML = html;
        })
        .catch((error) => {
            wrapper.innerHTML = error;
        });

    // las promesas tambien pueden realizarse con asyn await. ver las slides
    // ambas opciones son validas pero es recomendable saber utilizar ambas opciones con las promesas ya que son buenas skills como developer

    // realizo la peticion y sigo con mi codigo
    console.log("3. Ya llame al servidor");
    wrapper.innerHTML = `<h2>Cargando....</h2>`
}