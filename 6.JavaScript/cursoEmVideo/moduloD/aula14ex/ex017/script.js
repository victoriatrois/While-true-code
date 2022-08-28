function Multiplica() {
  let numero = document.querySelector('input#textoNumero');
  let selectTabuada = document.querySelector('select#selectTabuada');

  if (numero.value.length == 0) {
    window.alert('Digite um número.');
    
  } else {
    let valorNumero = Number(numero.value);
    let multiplicador = 1;
    selectTabuada.innerHTML = '';

    while (multiplicador <= 10) {
      let produto = document.createElement('option');
      produto.text = `${valorNumero} x ${multiplicador} = ${valorNumero * multiplicador}`;
      produto.value = `selectTabuada${multiplicador}`;
      selectTabuada.appendChild(produto);
      multiplicador++;
  }
  }
  
}