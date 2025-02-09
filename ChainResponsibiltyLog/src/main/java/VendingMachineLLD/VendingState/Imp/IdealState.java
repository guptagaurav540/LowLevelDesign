package VendingMachineLLD.VendingState.Imp;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Item;
import VendingMachineLLD.VendingMachine;
import VendingMachineLLD.VendingState.State;

import java.util.ArrayList;

public class IdealState implements State {

    public IdealState(){
        System.out.println("Currently Vending Machine is in IdealState....");
    }
    public IdealState(VendingMachine vendingMachine) {
        System.out.println("Currently Vending Machine is in IdealState....");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine mach, Coin coin) {

    }

    @Override
    public void clickOnProductSelect(VendingMachine machine) {

    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) {

    }

    @Override
    public int getChange(int extraMoney) {
        return 0;
    }

    @Override
    public Item dispatchProduct(VendingMachine machine, int codeNumber) {
        return null;
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {

    }
}
