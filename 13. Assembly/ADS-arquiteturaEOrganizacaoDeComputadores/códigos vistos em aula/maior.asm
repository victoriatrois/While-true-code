section	.text
   global _start         

_start:	                 
   mov   al, '5'
   sub   al, '0'
   mov   bl, '5'
   sub   bl, '0'
   cmp   al, bl ;compara os dois valores
   je iguais 
   jg  a_maior 
   
b_maior:
   mov   ecx,msg2
   mov   edx, len2
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida

a_maior:
   mov   ecx,msg1
   mov   edx, len1
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida

iguais:
   mov   ecx,msg3
   mov   edx, len3
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel

saida:
   mov   eax, 1 ;chamada de sistema (sys_exit)
   int   80h    ;chamada ao kernel

section	.data
   
   msg1 db "O maior eh o A"
   len1 equ $- msg1
   
   msg2 db "O maior eh o B"
   len2 equ $- msg2
   
   msg3 db "Iguais"
   len3 equ $- msg3
   
  