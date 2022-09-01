let numero = [5, 8, 2, 9, 3];
console.log(`Nosso vetor é: ${numero}`);
numero[numero.length] = 10;
console.log(`Nosso vetor é: ${numero}`);
numero.push(7);
console.log(`Nosso vetor é: ${numero}`);
console.log(`O vetor tem ${numero.length} posições.`)
console.log(`O primeiro elemento do vetor é o número ${numero[0]}.`)
console.log(`O vetor em ordem crescente fica ${numero.sort((a, b) => {return a-b})}`);

for (let posicaoAtual in numero) {
  console.log(`A posição ${posicaoAtual} armazena o valor ${numero[posicaoAtual]}.`)
}

let posicao = numero.indexOf(11);
if (posicao == -1) {
  console.log(`Esse valor não existe no vetor.`);
} else {
  console.log(`Esse valor foi encontrado na posição ${posicao}.`);
}