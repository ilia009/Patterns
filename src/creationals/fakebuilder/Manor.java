package creationals.fakebuilder;

import java.util.ArrayList;
import java.util.List;

public class Manor {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public int getCost(){
        int generalCost = 0;

        for(Item item: items){
            generalCost += item.price();
        }
        return generalCost;
    }

    public void showItems(){
        for(Item item: items){
            System.out.println("Item: " + item.name());
            System.out.println("Facility: "+ item.building().build());
            System.out.println("Price: "+ item.price());
        }
    }
}
