import java.util.Scanner;

public class Main3 {  
    public static void main(String[] args) {
    
    double a, b, c, cevreYarisi, alan;
    
    Scanner inp = new Scanner (System.in);
    
    System.out.print("ücgenin a kenarinin uzunlugunu giriniz: ");
    a = inp.nextInt();

    System.out.print("ücgenin b kenarinin uzunlugunu giriniz: ");
    b = inp.nextInt();

    c = Math.sqrt((a*a) + (b*b));
    System.out.println("Hipotenus:" + c);

    cevreYarisi = (a+b+c)/2;
    alan = Math.sqrt((cevreYarisi)*(cevreYarisi-a)*(cevreYarisi-b)*(cevreYarisi-c));
    System.out.println("Alan:" + alan);
    }
}
