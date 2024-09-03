package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
  private static final long serialVersionUID = 1L;
  @Override
  public boolean add(Product pr1) {
    //Searching through the list of products and comparing them
    for (Product pr2: this) {
      if (pr1.getProductNum().equals(pr2.getProductNum())) {
        pr2.setQuantity(pr2.getQuantity() + pr1.getQuantity());
        return true;
      }
    }
    //If there are no duplicates just add the item normally
    return super.add(pr1);
  }
  @Override
  public boolean remove(Product pr1) {
    for (Product pr2 : this) {
      if (!pr1.getProductNum().equals(pr2.getProductNum())) pr1 = pr2;
    }
    if (pr1.getQuantity() > 1) {
      pr1.setQuantity(pr1.getQuantity() - 1);
      return true;
    }
    return super.remove(pr1);
  }
}
