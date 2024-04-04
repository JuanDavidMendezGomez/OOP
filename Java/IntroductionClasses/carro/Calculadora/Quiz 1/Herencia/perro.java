
package Herencia;

public class perro extends animal{
    private String Marcacroquetas;
    
    public perro(String nombre,String raza, String color, String tamaño,String Marcacroquetas){
        super(nombre,raza,color,tamaño);
        this.Marcacroquetas=Marcacroquetas;
    }
    
    public void imprimirMarcaCroquetas(){
        System.out.println("la marca de croquetas es: "+Marcacroquetas);
    }
}
