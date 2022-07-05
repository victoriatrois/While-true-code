function carrega(){
  var msg = window.document.querySelector('div#msg');
  var img = window.document.querySelector('img#imagem');
  var dataSistema = new Date();
  var horaAtual = dataSistema.getHours();
  var minutoAtual = dataSistema.getMinutes();

  if(minutoAtual>=0 && minutoAtual<=9){
    minutoAtual= `0${minutoAtual}`;
  }
  if(horaAtual>=0 && horaAtual<=9){
    horaAtual= `0${horaAtual}`;
  }

  msg.innerHTML = `<p>Agora são exatamente ${horaAtual}:${minutoAtual}.</p>`;
  
  if ((horaAtual>=23 && minutoAtual>=30) || (horaAtual>=0 && horaAtual<4)){
    msg.innerHTML+= `<p>Tá tarde, hein! Vai dormir pouco.</p>`;
    img.src = 'imagens/tatardedormirpouco250.png';
    document.body.style.background='#01222b';
  } else if (horaAtual<= 6){
    msg.innerHTML+=`<p>Ta cedo, hein! Dormiu pouco.</p>`;
    img.src = 'imagens/tacedo250.png';
    document.body.style.background='#de772c';
  } else if (horaAtual<12){
    msg.innerHTML+= `<p>Bom dia!</p>`;
    img.src = 'imagens/bomdia250.png';
    document.body.style.background='#dcae7b';
  }else if (horaAtual==12 && minutoAtual>=30){
    msg.innerHTML+=`<p>Boa tarde, já almoçou?</p>`
    img.src='imagens/jaalmocou250.png';
    document.body.style.background='#5d1f35';
  }  else if ((horaAtual==18 && minutoAtual>=30) || horaAtual>18){
    msg.innerHTML+=`<p>Boa noite. Sextou?</p>`;
    img.src='imagens/boanoite250.png';
    document.body.style.background='#2e2540';
  }else {
    msg.innerHTML+= `<p>Boa tarde!</p>`;
    img.src='imagens/boatarde250.png';
    document.body.style.background='#1a8e86';
  }
};