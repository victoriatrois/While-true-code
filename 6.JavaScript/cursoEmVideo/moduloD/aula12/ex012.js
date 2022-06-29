var dataSistema = new Date();
var horaAtual = dataSistema.getHours();
var minutoAtual = dataSistema.getMinutes();
console.log(`Agora são exatamente ${horaAtual}:${minutoAtual}.`)
if (horaAtual>23 || (horaAtual>0 && horaAtual<4)){
  console.log(`Tá tarde, hein! Vai dormir pouco.`)
} else if (horaAtual<= 6){
  console.log(`Ta cedo, hein! Dormiu pouco.`);
} else if (horaAtual<12){
  console.log(`Bom dia!`);
}else if (horaAtual<12 && minutoAtual>=30){
  console.log(`Boa tarde, já almoçou?`)
} else if (horaAtual<=18){
  console.log(`Boa tarde!`);
} else if (horaAtual==18 && minutoAtual>=30){
  console.log(`Boa noite. Sextou?`);
}