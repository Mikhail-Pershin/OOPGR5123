package Services;

import java.util.List;
import Domen.Product;

public class VendingMachine {
    private Holder holder;
    public Holder getHolder() {
      return holder;
    }

    public void setHolder(Holder holder) {
      this.holder = holder;
    }

    private CoinDispenser dispenser;
    public CoinDispenser getDispenser() {
      return dispenser;
    }

    public void setDispenser(CoinDispenser dispenser) {
      this.dispenser = dispenser;
    }

    private List<Product> productList;

    public VendingMachine(Holder holder, CoinDispenser dispenser, List<Product> productList) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return productList.get(index);
    }

    public void release() {

    }

    public List<Product> getProductList() {
        return productList;
    }
}