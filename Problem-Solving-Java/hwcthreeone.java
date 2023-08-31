import java.util.*;
class hwthreeone{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println(" Enter two numbers :");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("Enter character value :");
            String  ch = sc.next();  
            switch(ch){
                case "+" : System.out.println("Sum is : "+(a+b));
                            break;
                case "-" : System.out.println("Diff is : "+(a-b));
                            break;
                case "*" : System.out.println("Product is : "+(a*b));
                            break;
                case "/" : System.out.println("Result is : "+(a/b));
                            break;
                case "%" : System.out.println("Remainder is : "+(a%b));
                            break;
                default  : System.out.println("Invalid choice : ");
            } 
    sc.close();    }
}
