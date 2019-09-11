import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
      int time_second,seconds,minutes,hours,time;
      
      System.out.println("enter time in seconds: ");
      time_second = in.nextInt();
      
       seconds = time_second %60;
       minutes = (time_second % 3600)/60;
       hours = time_second / 3600;
       
        System.out.println("time is" + " "+hours +"hour/s"+" "+minutes+" "+"minutes/s"+" "+seconds +" "+ "seconds");
   
    
      //2
    Scanner input = new Scanner (System.in);
        
        double distance , m_gallon, p_gallon, cost;
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble ();
        System.out.print("Enter miles per gallon: ");
        m_gallon = input.nextDouble();
        System.out.print    ("Enter price per gallon: ");
        p_gallon = input.nextDouble ();
        
        
         
             
        cost = (distance/m_gallon)* p_gallon ;
        
        System.out.printf("The cost of driving is $%.2f" , cost);
    }
    
}
