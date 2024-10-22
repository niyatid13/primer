
import java.util.*;
public class SortByPrice implements Comparator<Product>{
    
    
   @Override
    public int compare(Product a, Product b){
        return (int) (a.price - b.price);
    }
}
