

programa
{
    funcao inicio()
    {
        /*O algoritmo a seguir contém erros. A função dele seria informar, por meio da idade e da resposta do usuário, se ele está apto ou não para dirigir.
Exemplo: usuário tem 18 anos e digitou “Sim” na pergunta se estava habilitado, e o programa mostrou a mensagem: “Usuário, você está apto para dirigir”
(lê-se o nome que foi digitado em vez de “Usuário”). Porém, um amigo fez algumas alterações e agora o algoritmo está dando erro. Você poderia ajudar? 

Descrição:

A função desse exemplo é dizer se o usuário está apto para dirigir. 
Estar apto para dirigir significa que o mesmo deve ter idade maior ou igual 18 e ter habilitação.
Caso nenhum desses critérios forem aceitos, o programa irá se finalizar

programa {
    funcao inicio() {
        
        cadeia nome, habilitação
        inteiro idade
        
        escreva ("Digiteoseunome: \n")
        leia (nomeUsuario)
        escreva ("Olá, seu nome é ", nome)
        
        escreva ("\nQual é a sua idade: \n")
        leia (idade)
        
        escreva ("Você tem habilitação? Digite Sim ou Não \n")
        leia (habilitacao)
        
        se (idade>18ouhabilitação = "Sim")
        {
          escreva (nome, ", você está apto para dirigir!")
        }
    }
}*/
        cadeia nome, habilitacao
        inteiro idade
        
        escreva ("Digite seu nome:\n")
        leia (nome)
        limpa()
        
        escreva ("Digite a sua idade, ", nome, ":\n")
        leia (idade)
        limpa()
        
        escreva ("Digite \"Sim\" se você tem habilitação, senão, digite \"não\".\n")
        leia (habilitacao)
        
        se (idade >= 18 e (habilitacao == "Sim" ou habilitacao == "sim" ou habilitacao == "SIM"))
        {
          escreva (nome, ", você pode dirigir.")
        }
        senao
        {
            escreva("Você não pode dirigir.")
        }
        
        
    }
}