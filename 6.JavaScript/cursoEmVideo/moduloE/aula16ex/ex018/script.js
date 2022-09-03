let numeroDoFormulario = document.querySelector('input#numeroInserido');
let listaHTML = document.querySelector('select#listaHTML');
let resultado = document.querySelector('div#resultado');
let valoresInseridos[];

function isValidNumber(numero) {
  if (Number(numero) > 0 && Number(numero) < 101) {
    return true;

  } else {
    return false;
  }

}

function isListed(numero, lista) {
  if (valoresInseridos.indexOf(Number(numeroDoFormulario)) != -1) {
    return true;
  }
}


function Adiciona() {
  if (isValidNumber(numeroDoFormulario.value) && !isListed(numeroDoFormulario.value)) {

  } else {
    window.alert('Valor inválido ou já encontrado na lista.');
  }
}