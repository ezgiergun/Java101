import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) throws Exception {
  
    double armut = 2.14,elma = 3.67,domates = 1.11,muz =0.95,patlican= 5,arKg,elKg,domKg,patKg,muzKg,tutar;
    
    Scanner input = new Scanner(System.in);

    System.out.print("Armut miktarini giriniz: ");
        arKg = input.nextDouble();
        System.out.print("Elma miktarini giriniz: ");
        elKg = input.nextDouble();
        System.out.print("Domates miktarini giriniz: ");
        domKg = input.nextDouble();
        System.out.print("Muz miktarini giriniz: ");
        muzKg = input.nextDouble();
        System.out.print("Patlican miktarini giriniz: ");
        patKg = input.nextDouble();

        tutar = (armut*arKg) + (elma*elKg) + (domates*domKg) + (muz*muzKg) + (patlican*patKg);

        System.out.println("Ödemeniz gereken tutar: " +tutar + " TL");

    }
}