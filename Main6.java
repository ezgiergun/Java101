import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
    
    double boy, kilo, kitleIndex;
    Scanner inp = new Scanner(System.in);
    System.out.print("Lütfen boyunuzu giriniz: ");
    boy = inp.nextInt();

    Scanner inp2 = new Scanner(System.in);
    System.out.print("Lütfen kilonuzu giriniz: "); 
    kilo = inp2.nextInt();

    kitleIndex = kilo/boy*boy;
    System.out.print("Kitle Endeksiniz: " +kitleIndex);


    }
}
