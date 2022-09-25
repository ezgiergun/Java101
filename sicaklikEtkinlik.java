import java.util.Scanner;
public class sicaklikEtkinlik {
    public static void main(String[] args){

    int heat;   
    Scanner input = new Scanner(System.in);    
    System.out.println("Sicaklik girin: ");
    heat = input.nextInt();

    /* İlk yöntem:
    
    if(heat<5){
        System.out.print("Kayak yapabilirsiniz.");
        
    }else if(heat <=25){
        if(heat<=15){
            System.out.println("Sinemaya gidebilirsin");
        }
        if(heat>=10){
            System.out.println("Piknige gidebilirsin.");
        }
    } else {
        System.out.println("Yüzmeye gidebilirsin.");
    }

    İkinci Yöntem:
    */
   
    if (heat < 5)
        System.out.print("Kayak yapabilirsiniz.");
    else if (heat >= 5 && heat < 10){
        System.out.print("Sinemaya gidebilirsiniz.");
    } else if (heat >=10 && heat < 15){
        System.out.print("Sinemaya veya piknige gidebilirsiniz.");   
    } else if (heat >= 15 && heat <25){
        System.out.print("Pikniğe gidebilirsiniz.");
    } else{
        System.out.print("Yüzmeye gidebilirsiniz.");
    }
    }

    }
