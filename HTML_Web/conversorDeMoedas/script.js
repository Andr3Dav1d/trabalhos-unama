let converteEuro = 0;
let converteDolar = 0;
let converteReal = 0;
let podeEditar = false;

function converter() {
    let real = document.getElementById("real").value;
    let dolar = document.getElementById("dolar").value;
    let euro = document.getElementById("euro").value;

    let editableAtrributes = document.querySelectorAll("input, #converter")
    let input = document.querySelectorAll('input');

    if (!real && !dolar && !euro) {
        alert("Não há valores a converter");
    } else {
        if (!real && !euro) {
            converteReal = dolar * 4.50;
            converteEuro = converteReal / 5.15;
            converteDolar = dolar;
            podeEditar = true;
        } else if (!real && !dolar) {
            converteEuro = euro;
            converteReal = euro * 5.15;
            converteDolar = converteReal / 4.50;
            podeEditar = true;
        } else if (!dolar && !euro) {
            converteReal = real;
            converteEuro = real / 5.15;
            converteDolar = real / 4.50;
            podeEditar = true;
        } else {
            alert("Você só pode preencher um campo.");
        }

        if (podeEditar) {
            input[0].value = converteReal;
            input[1].value = converteDolar;
            input[2].value = converteEuro;
            editableAtrributes.forEach(element => {
                element.setAttribute("disabled","true");
            });
        }
    }
}

function limpar() {
    document.querySelectorAll('input').forEach(input => {
        input.value = "";
    });

    document.querySelectorAll("input, #converter").forEach(element => {
        element.removeAttribute('disabled');
    });
}