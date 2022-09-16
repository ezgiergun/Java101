
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {

        double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutari, kdvliTutar;
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Ücret Tutarini Giriniz : " );
        tutar = input.nextDouble();   //Tutarı giriyor kullanıcı.
        
        kdvTutari = (tutar > 1000) ? tutar * kdvOran2 : tutar * kdvOran1;
        kdvliTutar = tutar + kdvTutari;
        
        System.out.println("KDVsiz Tutar:" + tutar);
        System.out.println("KDV Tutari:" + kdvTutari);
        System.out.println("KDVli Tutar:" + kdvliTutar);
        
        
    }
}





    
