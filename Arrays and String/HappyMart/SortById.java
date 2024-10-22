
import java.util.*;
class SortById implements Comparator<Product> {
    
    @Override
    public int compare(Product a, Product b){
        return a.productId - b.productId;
    }
    
}
