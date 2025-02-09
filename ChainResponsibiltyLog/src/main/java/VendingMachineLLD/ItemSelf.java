package VendingMachineLLD;


public class ItemSelf {
    int code;
    Item item;
    boolean soldOut;

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }
    public boolean isSoldOut() {
        return soldOut;
    }
}
