function Conta() {
  let inicio = document.querySelector('input#textoInicio');
  let fim = document.querySelector('input#textoFim');
  let passo = document.querySelector('input#textoPasso');
  let resultado = document.querySelector('div#resultado');

  if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0) {
    resultado.innerHTML = 'Impossível contar.';
    window.alert('Dados incompletos.');
  } else {
    resultado.innerHTML = 'Contando:<br>';
    valorInicio = Number(inicio.value);
    valorFim = Number(fim.value);
    valorPasso = Number(passo.value);

    if (valorPasso <= 0) {
      window.alert('Passo inválido. Considerando passo = 1.');
      valorPasso = 1;
    }

    if (valorInicio < valorFim) {
        for (let numeroAtual = valorInicio; numeroAtual <= valorFim; numeroAtual += valorPasso) {
          resultado.innerHTML += ` ${numeroAtual}  \u{1F449}`;
        
        }
        
      } else {
        for (let numeroAtual = valorInicio; numeroAtual >= valorFim; numeroAtual -= valorPasso) {
          resultado.innerHTML += ` ${numeroAtual}  \u{1F449}`;
        
        }
      }
      resultado.innerHTML += `\u{1F44F}`;
      }
}