mport java.util.Scanner;

class Calculator{
    void sub(double a, double b)
    {
        System.out.println("a-b: "+(a-b));
    }
    void add(double a, double b)
    {
        System.out.println("a+b: "+(a+b));
    }
    
}
class AdvCalculator extends Calculator{
    void  mul(double a, double b)
    {
        System.out.println("a*b: "+(a*b));
    }
    void div(double a, double b)
    {
        System.out.println("a/b: "+(a/b));
    }

}
// it is not possible for private Inheritance and protected inheritance....by default it is public 
public class Program6 {
    public static void main(String[] args) {
        System.out.println();
        AdvCalculator obj = new AdvCalculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operands");
        double a= input.nextDouble();
        double b= input.nextDouble();
        input.close();
        obj.add(a, b);
        obj.sub(a, b);
        obj.mul(a, b);
        obj.div(a, b);
    }
}
