package restaurant;
import java.util.*;

public class Menu {
    private ArrayList<MenuItem> restaurantMenu = new ArrayList<MenuItem>();
    private Date updated;

    public Date getDate() {
        return updated;
    }

    //adds an item to the menu and updates the date that tells when the menu had something new added.
    public void addItem(String name, double price, String category, String description) {
        //creates a MenuItem object with given info for it.
        MenuItem newItem = new MenuItem(name, price, category, description);

        //adds item to menu.
        restaurantMenu.add(newItem);

        //replaces the old updated date with the new one.
        updated = new Date();
    }
}
