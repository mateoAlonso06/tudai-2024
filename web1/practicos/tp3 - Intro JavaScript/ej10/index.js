let contenedor = document.querySelector("#container")

contenedor.addEventListener("click", function(event) {

    let x = event.clientX - event.target.offsetLeft;
    let y = event.clientY - event.target.offsetTop;

    let divExistente = document.elementFromPoint(x,y);
    if (divExistente && divExistente.classList.contains("generated-div")) {
        alert("Ya existe un elemento en esta posicion");
    } else {
        let newDiv = document.createElement("div");
        newDiv.classList.add("generated-div");
        newDiv.style.left = x + "px";
        newDiv.style.top = y + "px";
    
        contenedor.appendChild(newDiv);
    }
});