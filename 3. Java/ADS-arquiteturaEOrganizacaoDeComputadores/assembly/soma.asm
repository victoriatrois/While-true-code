section	.text
   global _start    

_start:             
   mov	eax,'5'		; o valor passado é uma string (entre aspas simples)
			; eax - registrador 
   sub  eax, '0'	; sub <registrador>, '0' remove as aspas da string,
			; a convertendo para inteiro

   mov 	ebx, '3'
   sub  ebx, '0'	; converte de ASCII para decimal 

   add 	eax, ebx	; soma os dois valores

   add	eax, '0'	; add <resgistrador>, '0'
			; converte de decimal para ASCII

   mov 	[sum], eax	; move o resultado da soma para o endereco identificado por sum

   ;escreve a mensagem
   mov	ecx,msg	
   mov	edx, len
   mov	ebx,1	
   mov	eax,4		; chamada de sistema (sys_write)
   int	0x80		; chamada ao kernel

   ;escreve o valor
   mov	ecx,sum
   mov	edx, 1
   mov	ebx,1
   mov	eax,4		; chamada de sistema (sys_write)
   int	0x80		; chamada ao kernel

   mov	eax,1		; chamada de sistema (sys_exit)
   int	0x80		; chamada ao kernel

section .data
   msg db "A soma eh:", 0xA,0xD 
   len equ $ - msg   
   segment .bss
   sum resb 1