package ComBriedglab;
import java.util.Scanner;
public class GenericsDemo {

    //compareTo method for Checking Maximum from 3 Integer Object
    public static Integer compareTo(Integer a,Integer b,Integer c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        //Welcome message for User
        int a,b,c;
        System.out.println("Enter Three Number ");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number ");
        a=scanner.nextInt();
        System.out.println("Enter Second Number ");
        b=scanner.nextInt();
        System.out.println("Enter Third Number ");
        c=scanner.nextInt();
        System.out.println("Maximum from 3 Integer Object : "+compareTo(a,b,c));
    }
}
