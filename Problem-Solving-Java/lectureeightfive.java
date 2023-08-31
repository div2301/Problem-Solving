import java.util.*;
class eightfive{
    public static boolean iseligible(int n){
        if(n>=18)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter age to check eligibility: ");
        n=sc.nextInt();
        sc.close();
        System.out.println("Is the person eligible: "+iseligible(n));
    }
}