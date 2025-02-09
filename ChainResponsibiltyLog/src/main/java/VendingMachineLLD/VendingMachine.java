package VendingMachineLLD;

import VendingMachineLLD.VendingState.Imp.IdealState;
import VendingMachineLLD.VendingState.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        state = new IdealState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }
    public State getVendingMachineState(){
        return this.state;
    };

    public void setVendingMachineState(State state) {
        this.state = state;
    }

    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inv) {
        inventory = inv;
    }
    public List<Coin> getCoinList() {
        return coinList;
    }
    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
