import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);
    
       //Değerlerin İStenilmesi:
        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();
        System.out.println(fizik);
        
        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();
        System.out.println(kimya);
        
        System.out.print("Turkce:");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Muzik Notunuz:");
        muzik = inp.nextInt();
        System.out.println(muzik);

        //Sonuc icin ortalamanın hesaplanmasi:
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6;
        System.out.println("Ortalamaniz:"+ortalama);
        
        boolean kosul = ortalama >= 60;
        boolean sonuc = kosul;
        String str = sonuc ? "Gectiniz." : "Kaldiniz." ;
        System.out.println(str);
    }
}