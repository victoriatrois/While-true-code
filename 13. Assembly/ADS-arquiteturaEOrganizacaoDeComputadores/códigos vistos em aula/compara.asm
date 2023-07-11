section	.text
   global _start         

_start:	                 
   mov   al, '5'
   mov   bl, '3'
   cmp   al, bl ;compara os dois valores
   je  iguais ;se iguais pula para o rotulo iguais, senao segue
   
diferentes:
   mov   ecx,msg2
   mov   edx, len2
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida
   
iguais:
   mov   ecx,msg1
   mov   edx, len1
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida

saida:
   mov   eax, 1 ;chamada de sistema (sys_exit)
   int   80h    ;chamada ao kernel

section	.data
   
   msg1 db "Iguais"
   len1 equ $- msg1
   
   msg2 db "Diferentes"
   len2 equ $- msg2
   
  