let botonCalcular = document.querySelector("#btncalcular").addEventListener("click", calcular);

function calcular() {
    // tomo los valores de los inputs
    console.log("entro en la funcion");
    let input1 = document.querySelector("#number1");
    let input2 = document.querySelector("#number2");

    input1 = parseFloat(input1.value);
    input2 = parseFloat(input2.value);

    let resultado = null;

    if(input1 != null && input2 != null) {
        let operacion = document.querySelector("#operacion").value;

        switch(operacion) {
            case "suma":
                resultado = input1 + input2;
                break;
            case "resta":
                resultado = input1 - input2;
                break;
            case "multiplicacion":
                resultado = input1 * input2;
                break;
            case "resto":
                resultado = input1 % input2; 
                break;
            default:
                {
                    if (input2 != 0)
                        resultado = input1 / input2;
                    else
                        resultado = null;
                }
                break;
        }
    }

    let textAreaResultado = document.querySelector("#resultado");
    textAreaResultado.innerHTML = "";
    textAreaResultado.innerHTML = resultado;
}