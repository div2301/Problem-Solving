import java.util.*;
class eightfour{
    public static double circum(int r){
        return 2*3.14*r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("enter radius of circle: ");
        r=sc.nextInt();
        sc.close();
        System.out.println("Circumference is: "+circum(r));
    }
}