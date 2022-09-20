import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) throws Exception {
        String userName, password, newPass, result;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiniz: ");
        userName = inp.nextLine();
        System.out.print("Sifreniz: ");
        password = inp.nextLine();

        //Stringler için eşitlik durumunu bu .equals() ile kontrol ediyoruz:
        if ((userName.equals("patika")) && (password.equals("java123"))) {
            System.out.println("Giris Yaptiniz!");
        
        }else{
            Scanner inp2 = new Scanner(System.in);
            System.out.println("Bilgileriniz yanlış");
            System.out.print("Şifrenizi sıfırlamak istermisiniz ? ");
            result = inp2.nextLine();
                if (result.equals("Evet")){
                    System.out.println("Yeni şifrenizi giriniz :");
                     newPass = inp2.nextLine();
                        if (newPass.equals("Patika")){
                            System.out.println("Eski şifre ile Yeni şifre aynı olamaz.");
                        }else{
                            System.out.println("Şifre Oluşturuldu.");
                        }
                    }
        }

    }
}

