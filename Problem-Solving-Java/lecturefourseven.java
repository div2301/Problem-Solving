import java.util.*;
class fourseven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
        sc.close();
        for(i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }  
}
