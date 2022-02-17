import java.util.Scanner;
public class TotalAmount {
    public static void main(String[]args){
        double pear=2.14, apple=3.67, banana=0.95,tomato=1.11, eggplant=5.00, total=0;
        double pearamount, appleamount, bananaamount, tomatoamount, eggplantamount;

        Scanner input=new Scanner(System.in);

        System.out.print("How Many Kilos of Pears ? :");
        pearamount=input.nextDouble();
        System.out.print("How Many Kilos of apple ? :");
        appleamount=input.nextDouble();
        System.out.print("How Many Kilos of banana ? :");
        bananaamount=input.nextDouble();
        System.out.print("How Many Kilos of tomato ? :");
        tomatoamount=input.nextDouble();
        System.out.print("How Many Kilos of eggplant ? :");
        eggplantamount=input.nextDouble();

        total+=(pear*2.14)+(apple*3.67)+(banana*0.95)+(tomato*1.11)+(eggplant*5.00);
        System.out.println("Total price is:"  +total+ "TL");

    }
}
