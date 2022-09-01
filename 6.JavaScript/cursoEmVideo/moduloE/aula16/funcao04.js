function calculaFatorial(numero) {
  let fatorial = 1;
  for (let contador = numero; contador > 1; contador--) {
    fatorial*= contador;
  }
  return fatorial;

  }

  console.log(calculaFatorial(5));