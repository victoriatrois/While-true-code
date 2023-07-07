section	.text
   global _start     	; indica onde o programa deve iniciar
	
_start:	            	; inicio do programa
   mov	edx,len		; edx - um dos registrador de 32bits que registra o tamanho das
			; mensagem que iremos exibir na tela
   mov	ecx,msg		; ecx - um dos registrador de 32bits que registra a mensagem
			; que iremos exibir na tela
   mov	ebx,1		; descritor de arquivo (stdout)
   mov	eax,4		; chamada de sistema (sys_write)
   int	0x80		; chamada ao kernel
	
   mov	eax,1		; chamada de sistema (sys_exit)
   int	0x80		; chamada ao kernel

section	.data
msg db 'Hello, world!'	; mensagem a ser exibida
len equ $ - msg		; tamanho da mensagem