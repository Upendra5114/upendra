import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("upendra", 1);
        obj.put("sampath", 2);
        obj.put("praveen", 3);
        obj.put("balu", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
