section	.text
   global _start     ;indica onde o programa deve iniciar
	
_start:	            ;inicio do programa
   mov	edx,len     ;tamanho da mensagem
   mov	ecx,msg     ;mensagem
   mov	ebx,1       ;descritor de arquivo (stdout)
   mov	eax,4       ;chamada de sistema (sys_write)
   int	0x80        ;chamada ao kernel
	
   mov	eax,1       ;chamada de sistema (sys_exit)
   int	0x80        ;chamada ao kernel

section	.data
msg db 'Hello, world!'  ;mensagem a ser exibida
len equ $ - msg     ;tamanho da mensagem