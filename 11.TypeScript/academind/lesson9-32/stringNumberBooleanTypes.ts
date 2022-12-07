function add(n1: number, n2: number, showResult: boolean, phrase: string) {
  const addition = n1 + n2;
  if (showResult) {
  console.log(phrase + addition);
  } else {
    return addition;
  }
}


const number1 =  5;
const number2 = 2.8;
const printResult = true;
const additionPhrase = 'The addition total is: '

add(number1, number2, printResult, additionPhrase);