"use strict"

let imagenes = document.querySelectorAll("img");

// recorro el nodo con un for y a cada una de las imagenes les aplico la funcionalidad de hacer zoom
for (let img of imagenes) {
    img.addEventListener("mouseover", () => ZoomIn(img));
    img.addEventListener("mouseout", () => ZoomOut(img));

    img.classList.add("zoomeable");
}

function ZoomIn(image) {
    // obtengo el ancho y alto de la imagen
    let width = image.clientWidth;
    let height = image.clientHeight;

    image.style.width = (width + 90) + "px";
    image.style.height = (height + 90) + "px";

    image.classList.add("zoomed");
    image.classList.add("recuadro");
}

function ZoomOut(image) {
    let width = image.clientWidth;
    let height = image.clientHeight;

    image.style.width = (width - 90) + "px";
    image.style.height = (height - 90) + "px";

    image.classList.remove("zoomed");
    image.classList.remove("recuadro");
}