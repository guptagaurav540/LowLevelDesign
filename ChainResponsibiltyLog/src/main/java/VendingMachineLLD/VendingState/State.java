package VendingMachineLLD.VendingState;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Item;
import VendingMachineLLD.VendingMachine;

public interface State {
    public void clickOnInsertCoin(VendingMachine machine);
    public void insertCoin(VendingMachine mach, Coin coin);
    public void clickOnProductSelect(VendingMachine machine);
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception;
    public int getChange(int extraMoney);
    public Item dispatchProduct(VendingMachine machine, int codeNumber) throws Exception;
    public void refundAllMoney(VendingMachine machine);
}
