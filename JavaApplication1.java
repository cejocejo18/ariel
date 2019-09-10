import java.util.Scanner;
public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    final double h_ensurance = 75.00;
    double F_itax, p_plan, s_tax, ss_tax, GrossAmount, n_pay, mm_tax;
    String e_name;
    System.out.println("Employee name");
    e_name = input.nextLine();
    System.out.println("Gross Amount");
    GrossAmount = input.nextDouble();
    
    F_itax = GrossAmount * 0.15;
    ss_tax = GrossAmount * 0.0575;
    s_tax = GrossAmount * 0.035;
    mm_tax = GrossAmount * 0.0275;
    p_plan = GrossAmount * 0.05;
    n_pay = GrossAmount - F_itax - ss_tax - s_tax - mm_tax - p_plan - h_ensurance;

    System.out.println("Employee name : \n"+  e_name);
    System.out.printf("Federal Income : %.2f\n",F_itax);
    System.out.printf("State tax : %.2f\n",s_tax);
    System.out.printf("Social Security tax : %.2f\n",ss_tax);
    System.out.printf("Medicare/Medicaid tax : %.2f\n",mm_tax);
    System.out.printf("Pension plan : %.2f\n",p_plan);
    System.out.printf("health Insurance : %.2f\n",h_ensurance);
    System.out.printf("Net pay : %.2f\n",n_pay);
    System.out.printf("n\n\n");
    
    //2
    
       int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
       
        System.out.println("Enter 1st Number");
        n1=input.nextInt();
        System.out.println("Enter 2nd Number");
        n2=input.nextInt();
        System.out.println("Enter 3rd Number");
        n3=input.nextInt();
        System.out.println("Enter 4th Number");
        n4=input.nextInt();
        System.out.println("Enter 5th Number");
        n5=input.nextInt();
        System.out.println("Enter 6th Number");
        n6=input.nextInt();
        System.out.println("Enter 7th Number");
        n7=input.nextInt();
        System.out.println("Enter 8th Number");
        n8=input.nextInt();
        System.out.println("Enter 9th Number");
        n9=input.nextInt();
        System.out.println("Enter 10th Number");
        n10=input.nextInt();
        
        int run2 = n1+n2;
        int run3 = run2+n3;
        int run4 = run3+n4;
        int run5 = run4+n5;
        int run6 = run5+n6;
        int run7 = run6+n7;
        int run8 = run7+n8;
        int run9 =run8+n9;
        int run10 =run9+n10;
        
        System.out.println("Running Sum : "+n1+" "+run2+" "+" "+run3+" "+" "+run4+" "+" "+run5+" "+" "+run6+" "+" "+run7+" "+" "+run8+" "+" "+run9+" "+" "+run10);
    }
    
}
