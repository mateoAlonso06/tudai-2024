// Lista de compras

/*Lista de compras, Ademas de que item vamos a comprar el usuario quiere tener tres
botones para indicar la cantidad de unidades (1, 2, o 3)*/

const btnCompra1 = document.querySelector("#compra1").addEventListener("click", () => comprar(1));
const btnCompra2 = document.querySelector("#compra2").addEventListener("click", () => comprar(2));
const btnCompra3 = document.querySelector("#compra3").addEventListener("click", () => comprar(3));

let listado = [];

function comprar(cantidad) {
    let articulo = document.querySelector("#articulo").value;

    let itemNuevo = {
        "producto": articulo,
        "cantidad": cantidad
    }

    listado.push(itemNuevo);
    mostrar();
}

function mostrar() {
    let lista = document.querySelector("#lista");

    lista.innerHTML = "";

    for (let elemento of listado) {
        lista.innerHTML += `<li class="item">${elemento.producto} - ${elemento.cantidad}</li>`
    }
}