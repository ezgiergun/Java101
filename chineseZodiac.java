import java.util.Scanner;
public class chineseZodiac {
    public static void main(String[] args){
    
    String burc = "Çin zodyagina göre burcunuz: ";
    Scanner input = new Scanner(System.in);
    System.out.println("Dogum yilinizi giriniz: ");
    int year = input.nextInt();
    int result = (year%12);

    if (result == 0) {
        System.out.println(burc +"Maymun");
    }else if (result == 1){
        System.out.println(burc +"Horoz");
    }else if (result == 2){
        System.out.println(burc + "Köpek");
    }else if (result == 3){
        System.out.println(burc +"Domuz");
    }else if (result == 4 ){
        System.out.println(burc +"Fare");
    }else if (result == 5 ){
        System.out.println(burc +"Öküz");
    }else if (result == 6 ){
        System.out.println(burc +"Kaplan");
    }else if (result == 7 ){
        System.out.println(burc +"Tavsan");
    }else if (result == 8 ){
        System.out.println(burc +"Ejderha");
    }else if (result == 9 ){
        System.out.println(burc +"Yilan");
    }else if (result == 10 ){
        System.out.println(burc +"At");
   
    }else{
        System.out.println(burc +"At");
    }
    
    }

    }

