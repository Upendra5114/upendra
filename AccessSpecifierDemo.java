import java.util.*;
public class AccessSpecifierDemo{
    public
    int pubvar;
    protected
    int provar;
    private
    int privar;
    void setvar(int pubval,int prival,int proval){
        pubvar = pubval;
        privar = prival;
        provar = proval;
    }
    void getvar(){
        System.out.println("Public : "+ pubvar);
        System.out.println("Private : "+ privar); 
        System.out.println("Protected : "+ provar);
    }
}

class test{
    public static void main(String[] args){
    AccessSpecifierDemo obj = new AccessSpecifierDemo();
    int a,b,c;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter public value: ");
    a = s.nextInt();
    System.out.println("Enter private value: ");
    b = s.nextInt();
    System.out.println("Enter protected value: ");
    c = s.nextInt();
    obj.setvar(a,b,c);
    obj.getvar();
    s.close();
    }
}
