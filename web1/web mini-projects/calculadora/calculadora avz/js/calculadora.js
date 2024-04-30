// addEvenListeners
const resultado = document.querySelector("#resultado").addEventListener("click", resolverOperacion);

const input1 = document.querySelector("#valorInput1").value;
const input2 = document.querySelector("#valorInput2").value;

// evitar que el usuario ingrese valores de tipo string, retomar en otro momento
input.addEventListener("keydown", function(event) {
    const keyCode = event.keyCode || event.which;

    if(!(/[0-9\+\-\*\/\.]/.test(String.fromCharCode(keyCode)))) {
        event.preventDefault();
    }
});

// resolver mediante inputs
function resolverOperacion() {
    if(input1 != null && input2 != null) {
        console.log();
    }
}
