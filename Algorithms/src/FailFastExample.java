import java.util.Iterator;
import java.util.Map;

public class FailFastExample
{
    
    
    public static void main(String[] args)
    {
        Map premiumPhone = (Map) new HashMap();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }
        
    }
    
}