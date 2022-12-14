import java.util.scanner;

public class labtask6{

     public static void main(String args[])
     {


       Scanner in = new Scanner(System.in);
       int choice;
       System.out.println("please enter a choice");
       System.out.println("Menu");
       System.out.println("1.Bariyani-150/-");
       System.out.println("2.pizza-250/-");
       System.out.println("3.Mayoroll-180/-");
       System.out.println9"4.Exit");
       choice = in.nextInt();
       switch(choice)
       {
          
          case 1:
          System.out.println("Bariyani is chosen");
          System.out.println("Bariyani's price is 150/-");
          break;
          case 2:
          System.out.println("Pizza is chosen");
          System.out.println("Pizza's price is 250/-");
          break;
          case 3:
          System.out.println("Mayoroll is chosen");
          Systemm.out.println("Mayoroll's price is 180/-");
          break;
          default:
           System.out.println("Invalid item");
            }
       }
}
           
           