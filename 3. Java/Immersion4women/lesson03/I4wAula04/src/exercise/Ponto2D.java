/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author v3gc
 */
public class Ponto2D {
    private int x;
    private int y;
    
    //o método construtor não leva parâmetros
    public Ponto2D(/*int x, int y*/){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;//faltou o this.
    }
    
    /*public void getY(int y){
        this.y = y;
    }*/
    
    public void setY(int y){
        this.y = y;
    }
}
