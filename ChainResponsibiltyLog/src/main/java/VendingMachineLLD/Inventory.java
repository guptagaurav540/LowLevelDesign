package VendingMachineLLD;

public class Inventory {
    ItemSelf[] inventory = null;

    Inventory(int itemCount){
        inventory = new ItemSelf[itemCount];
        initializeEmptyInventory();

    }
    public void initializeEmptyInventory()
    {
        int startCode  = 101;
        for(int i=0;i< inventory.length;i++)
        {
            ItemSelf space = new ItemSelf();
            space.setCode(startCode+i);
            space.setSoldOut(true);
            inventory[i] = space;
        }
    }
    void addItem(Item item, int codeNumber) throws Exception {
        int index = codeNumber - 101;
        ItemSelf itemSelf =  inventory[index];
        if(itemSelf.isSoldOut()){
            itemSelf.item = item ;
            itemSelf.setSoldOut(false);
        } else {
            throw new Exception("already item present, you can not add item here.");
        }
    }
    public Item getItem(int codeNumber) throws Exception {
        int index= codeNumber - 101;
        if(inventory[index].isSoldOut())
        {
            throw new Exception("item already Sold out");
        }
        else {
            return inventory[index].getItem();
        }
    }
    public void updateSoldItem(int codeNumber)
    {
        int index = codeNumber - 101;
        inventory[index].setSoldOut(true);
    }
}
