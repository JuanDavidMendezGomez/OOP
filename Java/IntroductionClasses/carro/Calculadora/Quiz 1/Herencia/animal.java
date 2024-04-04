
package Herencia;

public class animal {
    protected String nombre,raza,color,tamaño;
    private String tipo;
    
    public animal(String nombre,String raza,String color,String tamaño){
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.tamaño=tamaño;
        this.tipo="TERRESTRE";
    }
    public void imprimirDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La raza es: "+raza);
        System.out.println("El color es: "+color);
        System.out.println("El tamaño es: "+tamaño);
        System.out.println("El tipo es: "+tipo);
    }
}
