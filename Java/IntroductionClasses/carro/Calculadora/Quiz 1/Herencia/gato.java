
package Herencia;

public class gato extends animal{
    private String Marca_arena;
    
    public gato(String nombre,String raza, String color, String tamaño,String marca_arena){
        super(nombre,raza,color,tamaño);
        this.Marca_arena=marca_arena;
    }
    
    public void imprimirMarcaArena(){
        System.out.println("la marca de arena es: "+Marca_arena);
    }
}
