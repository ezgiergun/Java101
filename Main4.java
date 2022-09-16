import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
      
        double perKm = 2.20, km0 = 10, km, tutar;
       
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç km yol gideceksiniz?");
        km = inp.nextInt();

        
        tutar = km0 + (km*perKm);
        tutar = tutar<20 ? 20 : (km0 + (km*perKm));
        System.out.println("Ödemeniz gereken tutar: " +tutar);
















    }
}
