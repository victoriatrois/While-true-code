section .text

global _start

_start:

    mov edx, 0  ;resto 
    mov eax, 52 ;dividendo; quociente
    mov ecx, 10 ;divisor
    div ecx

    add eax, '0'
    mov [quo], eax
    
    add edx, '0'
    mov [rem], edx

    ;escreve a mensagem
    mov	ecx,msg1	
    mov	edx, len1
    mov	ebx,1	
    mov	eax,4	;chamada de sistema (sys_write)
    int	0x80	;chamada ao kernel
    
    ;add quo, Ah
    ;add quo, OxD
    
    mov     ecx, quo
    mov     edx, 1
    mov     ebx, 1
    mov     eax, 4
    int     0x80
    
    ;escreve a mensagem
    mov	ecx,msg2	
    mov	edx, len2
    mov	ebx,1	
    mov	eax,4	;chamada de sistema (sys_write)
    int	0x80	;chamada ao kernel
    
    mov     ecx, rem
    mov     edx, 1
    mov     ebx, 1
    mov     eax, 4
    int     0x80

    mov     eax, 1
    int     0x80

section .data
    msg1 db  "Quociente: "
    len1 equ $ - msg1
    
    msg2 db  " Resto: "
    len2 equ $ - msg2

segment .bss

    quo resb 1
    rem resb 1
