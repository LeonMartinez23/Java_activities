import java.util.*;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Variables
        double a,b,res;
        
        //Ingrese primer dato
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        a = numero1.nextDouble();
        
        //Ingrese segundo dato
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Ingresa b: ");
        b = numero2.nextDouble();

        //Operacion
        res = Math.pow(a, 2)+Math.pow(b, 2)+(a+b)*2;

        System.out.println("El resultado es: "+res);
    }
}
