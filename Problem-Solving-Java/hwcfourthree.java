import java.util.*;
class hwfourthree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c,m;
        do{
            System.out.println("Enter marks: ");
            m = sc.nextInt();
            if(m>=90)
                System.out.println("This is Good.");
            else if((m>=60)&&(m<=89))
                System.out.println("This is also Good.");
            else 
                System.out.println("This is Good as well.");
            System.out.println("Enter 1 to continue and 0 to exit");
            c = sc.nextInt();
        }while(c==1);
        sc.close();
    }
}
