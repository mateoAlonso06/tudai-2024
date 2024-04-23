let btnEnviar = document.querySelector("#btnEnviar").addEventListener("click", enviar);

function enviar() {
    let inputFirstName = document.querySelector("#firstname").value;
    let inputLastName = document.querySelector("#lastname").value;

    let contenedor = document.querySelector("#container");

    let newTitle = document.createElement("h2");
    newTitle.textContent = `${inputFirstName} ${inputLastName}`;

    contenedor.appendChild(newTitle);
}