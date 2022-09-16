import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) throws Exception {
    
    double r, pi = 3.14, alan, cevre, dilimAlan, merkezAci;
    Scanner inp = new Scanner(System.in);

    System.out.println("Dairenin yaricapini girin: ");
    r = inp.nextInt();

    alan = pi*r*r;
    System.out.println("Dairenin alani: " +alan);
    cevre = 2*pi*r;
    System.out.println("Dairenin cevresi: " +cevre);

    Scanner inp2 = new Scanner (System.in);
    System.out.println("Daire Diliminin Merkez Acisini Giriniz: ");
    merkezAci = inp2.nextInt();
    
    dilimAlan = (pi*(r*r)*merkezAci)/360;
    System.out.println("Daire diliminin alani: " + dilimAlan);




    }
}
