import java.util.*;
class threethree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
            if(a==b){
            System.out.println("a=b");
            }                                        
            else if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is smaller than b");
            }
        }
    }
    
