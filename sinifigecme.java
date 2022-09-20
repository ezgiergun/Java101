import java.util.Scanner;
public class sinifigecme {
    public static void main(String[] args) throws Exception {
        
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        while(true){
            mat = input.nextInt();
            if(mat>100 || mat<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        System.out.println("Fizik notunuz :");
        while(true){
            fizik = input.nextInt();
            if(fizik>100 || fizik<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }
        
        while(true){
            turkce = input.nextInt();
            if(turkce>100 || turkce<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        };
        
        while(true){
            kimya = input.nextInt();
            if(kimya>100 || kimya<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }
        System.out.println("Müzik notunuz :");
        while(true){
            muzik = input.nextInt();
            if(muzik>100 || muzik<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        if (average <= 55) {
            System.out.println("Kaldınız, seneye görüşürüz!");
       
        }else{
            System.out.println("Tebrikler, sınıf geçtiniz!") ;
            
        }
        System.out.println("Ortalamanız: " + average);


    }
}
