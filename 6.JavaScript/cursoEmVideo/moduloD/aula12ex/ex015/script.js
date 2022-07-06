function verifica(){
  var data = new Date();
  var anoAtual = data.getFullYear();
  var anoNascimento = document.querySelector('input#txtAno');
  var resultado = document.querySelector('div#resultado');
  if (anoNascimento.value.length == 0 || anoNascimento.value < 1 || anoNascimento.value > anoAtual){
    window.alert('Ano inválido. Verifique os dados e tente novamente.');
  } else {
    var generoFormulario = document.getElementsByName('genero');
    var idade = anoAtual - Number(anoNascimento.value);
    resultado.innerHTML = `Você tem ${idade} anos, `;
    var genero = '';
    var img = document.createElement('img');
    img.setAttribute('id', 'foto');

    if(idade < 4){
      resultado.innerHTML += `é um baby!`;
    } else if (idade < 12){
      resultado.innerHTML += `é uma quiança muito fofa!`;
    } else if (idade < 18){
      resultado.innerHTML += `é um adolescente.`;
    } else if (idade <= 30){
      resultado.innerHTML += `quê que a gente tá fazendo da nossa vida, hein?!<br>`;
    } else if (idade < 60){
      resultado.innerHTML += `é um adulto.`;
    } else {
      resultado.innerHTML += `uma pessoa idosa.`;
    }
  
    if (generoFormulario[0].checked){
      genero = 'Transgênero';
      img.setAttribute('src', 'trans.png');
    } else if (generoFormulario[1].checked){
      generoFormulario = 'Cisgênero';
      img.setAttribute('src', 'cis.png');
    } else {
      generoFormulario = 'Não-binário';
      img.setAttribute('src', 'nb.png');
    }
    resultado.style.textAlign = 'center';
    resultado.appendChild(img);
  }
}