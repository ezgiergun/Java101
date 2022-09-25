import java.util.Scanner;
public class artikYil {
    public static void main(String[] args){

    int yil;
    String yazi1 = "Bu bir artik yildir!";
    String yazi2 = "Bu bir artik yil degildir!";

    Scanner input = new Scanner(System.in);
    System.out.println("Yili Giriniz: ");
    yil = input.nextInt();
    
    if (yil % 100 == 0){
        if (yil % 400 == 0){
            System.out.println(yazi1);
        }else{
            System.out.println(yazi2);
        }
    } else if (yil % 4 == 0){
        System.out.println(yazi1);
        
    }else{
        System.out.println(yazi2);
    }
    }
}
