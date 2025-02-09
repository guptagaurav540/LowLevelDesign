package VendingMachineLLD.VendingState.Imp;

import VendingMachineLLD.Coin;
import VendingMachineLLD.Item;
import VendingMachineLLD.VendingMachine;
import VendingMachineLLD.VendingState.State;

public class SelectionState implements State {
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
        Item item = machine.getInventory().getItem(codeNumber);
        int paidByuser = 0;
        for(Coin coin:machine.getCoinList()){
            paidByuser+= coin.value;
        }
        if(paidByuser<item.getPrice()){
            System.out.println("insufficient Amount, Product you selected for price: "+item.getPrice()+" and you paid: "+paidByuser);
            refundAllMoney(machine);
            throw new Exception("Insufficient Amount ");
        }
        else if(paidByuser>= item.getPrice())
        {
            if(paidByuser> item.getPrice())
            {
                getChange(paidByuser- item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }
    }

    @Override
    public int  getChange(int extraMoney) {
        return  0;
    }

    @Override
    public Item dispatchProduct(VendingMachine machine, int codeNumber) {
        return null;
    }

    @Override
    public void refundAllMoney(VendingMachine machine) {

    }
}
