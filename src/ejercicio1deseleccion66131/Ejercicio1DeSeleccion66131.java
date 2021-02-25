package ejercicio1deseleccion66131;

import java.util.Scanner;
public class Ejercicio1DeSeleccion66131 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int var1 = 0, var2 = 0, var3 = 0;
        System.out.println("Introduce el primer numero a comparar");
        var1= ent.nextInt();
        System.out.println("Introduce el segundo valor a comparar");
        var2= ent.nextInt();
        System.out.println("Introduce el tercer valor a comparar");
        var3= ent.nextInt();
        if(var1 > var2){
            if(var1 > var3){
                System.out.println("El numero de mayor valor es: " + var1);
            }else{
                System.out.println("El numero de mayor valor es: " + var3);
            }
        }else if(var2 > var3){
            System.out.println("El numero de mayor valor es: " + var2);
        }else{
            System.out.println("El numero de mayor valor es: " + var3);
        }       
    }
    
}
