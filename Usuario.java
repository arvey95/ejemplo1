package reto3;

public class Usuario {
    String nombre;
    int identificacion;
    String email;
    int edad;
    String area;
    boolean idarea;
    double salario;
    double descuento;
    double pension;

    Usuario(String nombre,int identificacion,String email,int edad,String area, boolean idarea){
this.nombre=nombre;
this.identificacion=identificacion;
this.email=email;
this.edad=edad;
this.area=area;
this.idarea=idarea;


    }
    public void info(){
        if(this.area.equals("desarrollo")){
            salario=4500000.0;
            if(this.idarea){
                salario=salario+2500000.0;
            }
        }
        if(this.area.equals("administrativa")){
            salario=3500000.0;
            if(this.idarea){
                salario=salario+3000000.0;
            }
        }
        descuento=salario*0.08;

        if(salario>=3634104.0){
            pension=salario*0.01;
        }

        salario=salario-descuento ;
        salario=salario-pension;


        System.out.println("[Usuario] :");
        System.out.println( "Nombre: "+this.nombre);
        System.out.println("Identificacion: "+this.identificacion);
        System.out.println("Email: "+ this.email);
        System.out.println("Edad: "+this.edad);
        System.out.println("Area: "+this.area);
        System.out.println("Salario: "+this.salario);

    }



}
