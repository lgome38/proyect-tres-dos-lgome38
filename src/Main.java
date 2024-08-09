import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int calf=0;
        System.out.print(" Ingrese Calificación:");
        Scanner scanner1= new Scanner(System.in);
        calf= scanner1.nextInt();
        System.out.println(calf);


        switch (( calf >= 1 && calf <=2) ? 0 : (calf > 2 && calf <= 4) ? 1 : (calf >4 && calf <= 6) ? 2 : (calf >6 && calf <= 8) ? 3 : (calf >8 && calf <= 10) ? 4 : 5) {

            case 0: System.out.println("Su Calificación es: F");
                break;
            case 1: System.out.println("Su Calificación es: D");
                break;
            case 2: System.out.println("Su Calificación es: C");
                break;
            case 3: System.out.println("Su Calificación es: B");
                break;
            case 4: System.out.println("Su Calificación es: A");
                break;
            case 5: System.out.println("Número no válido, por favor verifique");
                break;
        }
    }
}