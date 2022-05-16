package ComBriedglab;
import java.util.Scanner;

    public class GenricsMethod {
        //compareTo method for Checking Maximum from 3 Integer Object
        public <T extends Comparable<T>> T compareTo(T a,T b,T c) {
            if(a.compareTo(b) > 0){
                if(a.compareTo(c) > 0) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if(b.compareTo(c) > 0) {
                    return b;
                } else {
                    return c;
                }
            }
        }

        public static void main(String[] args)
        {

            int a,b,c;
            double x,y,z;
            String s1,s2,s3;
            System.out.println("Welcome to Java Core - ");
            System.out.println("Enter Three Positive Number ");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter First Number ");
            a=scanner.nextInt();
            System.out.println("Enter Second Number ");
            b=scanner.nextInt();
            System.out.println("Enter Third Number ");
            c=scanner.nextInt();
            GenricsMethod intMethod=new GenricsMethod();
            System.out.println("Maximum from Three Integer Object : "+intMethod.compareTo(a,b,c));
            System.out.println("Enter Three Floating Number ");
            System.out.println("Enter First Number ");
            x=scanner.nextDouble();
            System.out.println("Enter second Number ");
            y=scanner.nextDouble();
            System.out.println("Enter Three Number ");
            z=scanner.nextDouble();
            GenricsMethod floatMethod = new GenricsMethod();
            System.out.println("Maximum from  3 Float Object : "+floatMethod.compareTo(x,y,z));
            //Creating Generic String Object for String Comparison
            System.out.println("Enter Three String Value ");
            System.out.println("Enter First String ");
            s1=scanner.next();
            System.out.println("Enter Second String ");
            s2=scanner.next();
            System.out.println("Enter Three String ");
            s3=scanner.next();
            GenricsMethod stringMethod = new GenricsMethod();
            System.out.println("Maximum from 3 String Object : "+stringMethod.compareTo(s1,s2,s3));
        }
    }

