/*RECURSIVIDADE*/

function calculaFatorial(numero){
  if (numero == 1) {
    return 1;

  } else {
    return numero * calculaFatorial(numero-1);
  }
}

console.log(calculaFatorial(5));