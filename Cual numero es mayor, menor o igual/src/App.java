import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Variables
        double a,b;
        
        //Ingrese primer dato
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa a: ");
        a = numero1.nextDouble();
        
        //Ingrese segundo dato
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Ingresa b: ");
        b = numero2.nextDouble();

        if (a == b) {
            System.out.println("Los dos numeros son iguales");
        }if(a < b){
            System.out.print(a+" es menor a "+b);
        }if(a > b){
            System.out.println(a+" es mayor a "+b);
        }
    }
}
