let numero = document.querySelector('input#numero');
let numeroDigitado = document.querySelector('select#numeroDigitado');
let listaDeValoresDigitados = []; 
let resultado = document.querySelector('div#resultado');

function ehValido(n) {
  if (Number(n) >= 1 && Number(n) <= 100) {
    return true;

  } else {
    return false;
  }
}

function estaListado(n, l) {
  if (l.indexOf(Number(n)) != -1) {
    return true;

  } else {
    return false;
  }
}

function adiciona() {
  if (ehValido(numero.value) && ! estaListado(numero.value, listaDeValoresDigitados)) {
    listaDeValoresDigitados.push(Number(numero.value));

    let valorAdicionado = document.createElement('option');
    valorAdicionado.text = `Número ${numero.value} adicionado à lista.`;
    numeroDigitado.appendChild(valorAdicionado);
    resultado.innerHTML = '';

  } else {
    window.alert('Valor inválido ou repetido.')
  }
  numero.value = "";
  numero.focus();
}

function finaliza() {
  if (listaDeValoresDigitados.length == 0) {
    window.alert('Digite um número.');
    
  } else {
    let totalDeElementos = listaDeValoresDigitados.length;

    
    resultado.innerHTML += `<p>Ao todo, temos ${totalDeElementos} números cadastrados.`;
    resultado.innerHTML += ``

    while (multiplicador <= 10) {
      let produto = document.createElement('option');
      produto.text = `${valorNumero} x ${multiplicador} = ${valorNumero * multiplicador}`;
      produto.value = `selectTabuada${multiplicador}`;
      selectTabuada.appendChild(produto);
      multiplicador++;
  }
  } 
}