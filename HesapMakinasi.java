import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        int num1, num2, selection;
        
        Scanner input = new Scanner(System.in);
        System.out.print ("İlk sayıyı girin: ");
        num1 = input.nextInt();
        System.out.print ("İkinci sayıyı girin: ");
        num2 = input.nextInt();
        
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n 4-Bölme");
        System.out.println("Seçiminiz: ");
        selection = input.nextInt();
      

    //Switch ile Yapımı
        switch (selection) {
            case 1: System.out.println("Toplam : "+ (num1 + num2));
                break;
            case 2: System.out.println("Çıkarma : "+ (num1 - num2));
                break;
            case 3: System.out.println("Çarpma : "+ (num1 * num2));
                break;
            case 4:
                    if (num2 == 0) {
                        System.out.println("Bir Sayı 0'a Bölünemez!");
                    } else {
                        System.out.println("Bölme: " + (num1 / num2));
                    }
                    break;
                default: System.out.println("Yanlış Bir Değer Girdiniz.Tekrar Deneyiniz :) ");
        }
} 
}

  
        //If-Else İle Yapımı
        /*if (selection == 1){
            System.out.println("Toplam : "+ (num1 + num2));
         } elseif (selection == 2){
            System.out.println("Çıkarma : "+ (num1 - num2));
         } elseif (selection == 3){
            System.out.println("Çarpma : "+ (num1 * num2));
         } elseif (selection == 4){
            if (num2!=0) {
                System.out.println("Bölme : "+ (num1 / num2));
            }else{
                System.out.println("Bir sayı 0'a bölünemez")
            }
            
        } else {
            System.out.println("Yanlış seçim, tekrar dene.")
        } */
