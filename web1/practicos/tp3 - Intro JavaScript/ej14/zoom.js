let image = document.querySelector("#image");

image.addEventListener("mouseover", function(){
    ZoomIn(image);
});

image.addEventListener("mouseout", function() {
    ZoomOut(image);
})

function ZoomIn(image) {
    // obtener el ancho y alto de la imagen
    let width = image.clientWidth;
    let height = image.clientHeight;

    image.style.width = (width + 90) + "px";
    image.style.height = (height + 90) + "px";
}

function ZoomOut(image) {
    let width = image.clientWidth;
    let height = image.clientHeight;
    image.classList.remove("zoomed");

    image.style.width = (width - 90) + "px";
    image.style.height = (height - 90) + "px";
}
