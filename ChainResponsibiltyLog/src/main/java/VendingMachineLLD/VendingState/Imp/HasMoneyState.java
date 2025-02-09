package VendingMachineLLD.VendingState.Imp;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Item;
import VendingMachineLLD.VendingMachine;
import VendingMachineLLD.VendingState.State;

public class HasMoneyState implements State {
    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) {
        return;
    }


    @Override
    public void insertCoin(VendingMachine mach, Coin coin) {
        System.out.println("Accepted the coin");
        mach.getCoinList().add(coin);
    }

    @Override
    public void clickOnProductSelect(VendingMachine machine) {
        machine.setVendingMachineState( new SelectionState());

    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {


    }

    @Override
    public int getChange(int returnExtraMoney) {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispatchProduct(VendingMachine machine, int codeNumber) {
        return null;
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {

    }
}
