public class MethodOverloading2 {
    static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        sum(1,2,3);
        sum(1,2);
        
    }
    
}
