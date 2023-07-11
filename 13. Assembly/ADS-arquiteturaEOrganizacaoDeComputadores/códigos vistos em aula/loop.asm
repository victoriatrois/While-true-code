section .text

global _start

_start:

    mov ah, [contador]

    mov bh, [max]
    
    cmp ah, bh
    jg encerra

escreve:
    ;escreve a palavra 'teste'
    mov     ecx, msg
    mov     edx, len
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
    ;escreve a palavra 'saiu'
    mov     ecx, msg2
    mov     edx, len2
    mov     ebx, 1
    mov     eax, 4
    int     0x80
    ;encerra o programa
    mov     eax, 1
    int     0x80

section .data
    contador db 0
    max db 10
    
    msg db  "teste "
    len equ $ - msg
    msg2 db  "saiu"
    len2 equ $ - msg2

    
segment .bss

    sum resb 1
