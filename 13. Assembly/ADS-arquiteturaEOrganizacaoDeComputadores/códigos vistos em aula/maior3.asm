section	.text
   global _start         

_start:	                 
   mov   al, '3'
   sub   al, '0'
   mov   bl, '2'
   sub   bl, '0'
   mov   cl, '1'
   sub   cl,'0'  
   
   cmp   al, bl ;compara os dois valores
   jg a_maior_b
   
;rotulo pra quando b for maior que a
b_maior_a:
   cmp bl, cl
   jg maior_b

a_maior_b:
   cmp al, cl
   jg maior_a
   
;rotulo pra quando c maior que a
maior_c:
   mov   ecx,msg3
   mov   edx, len3
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida

 
 maior_b:
   mov   ecx,msg2
   mov   edx, len2
   mov   ebx,1	
   mov   eax,4	;chamada de sistema (sys_write)
   int   0x80	;chamada ao kernel
   jmp saida

 maior_a:
   mov   ecx,msg1
   mov   edx, len1
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
   
   msg3 db "O maior eh o C"
   len3 equ $- msg3
   
  