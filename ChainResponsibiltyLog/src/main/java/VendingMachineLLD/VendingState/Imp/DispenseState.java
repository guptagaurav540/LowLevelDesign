package VendingMachineLLD.VendingState.Imp;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Item;
import VendingMachineLLD.VendingMachine;
import VendingMachineLLD.VendingState.State;

public class DispenseState implements State {
    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in DispenseState");
        dispatchProduct(machine,codeNumber);
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) {

    }

    @Override
    public void insertCoin(VendingMachine mach, Coin coin) {

    }

    @Override
    public void clickOnProductSelect(VendingMachine machine) {

    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int extraMoney) {
        return 0;
    }

    @Override
    public Item dispatchProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldItem(codeNumber);
        machine.setVendingMachineState(new IdealState(machine));
        return item;
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {

    }
}
