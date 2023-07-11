section .text

global _start

_start:

    mov ah, [contador]

    mov bh, [max]
    
    cmp ah, bh
    jg encerra

escreve:

    add ah, '0'
    mov [valor], ah
    

    mov     ecx, valor
    mov     edx, 1
    mov     ebx, 1
    mov     eax, 4
    int     0x80
    
    ;restaura o valor das variáveis contador e max
    mov ah, [contador]
    mov bh, [max]
    
    inc ah
    mov [contador], ah
    cmp ah, bh
    jl escreve
    
    
encerra:
    ;encerra o programa
    mov     eax, 1
    int     0x80

section .data
    contador db 3
    max db 10
    
segment .bss
    valor resb 1
