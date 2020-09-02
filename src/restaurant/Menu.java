package restaurant;
import java.util.*;

public class Menu {


    private ArrayList<MenuItem> restaurantMenu;
    private Date updated;

    public ArrayList<MenuItem> getRestaurantMenu() {
        return restaurantMenu;
    }

    public Menu(){
        this.updated = new Date();
        this.restaurantMenu = new ArrayList<MenuItem>();
    }

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

    public void removeItem(String name) {
        for(int i = 0; i < restaurantMenu.size(); i++){
            if (restaurantMenu.get(i).getName() == name){
                restaurantMenu.remove(i);
            }
        }
    }

    public void printItem(String name){
        MenuItem printMe = null;
        for(int i = 0; i < restaurantMenu.size(); i++){
            if (restaurantMenu.get(i).getName() == name){
                printMe = restaurantMenu.get(i);
                break;
            }
        }
        if(printMe.isNew()) {
            System.out.println("New! " + printMe.getName() + "\n" +
                    printMe.getPrice() + "\n" +
                    printMe.getDescription() + "\n" +
                    printMe.getDate());
        }
        else{
            System.out.println(printMe.getName() + "\n" +
                    printMe.getPrice() + "\n" +
                    printMe.getDescription() + "\n" +
                    printMe.getDate());
        }
    }

    public void printAll(){
        for(int i = 0; i < restaurantMenu.size(); i++){
            if(restaurantMenu.get(i).isNew()) {
                System.out.println("New! " + restaurantMenu.get(i).getName() + "\n" +
                        restaurantMenu.get(i).getPrice() + "\n" +
                        restaurantMenu.get(i).getDescription() + "\n" +
                        restaurantMenu.get(i).getDate());
            }
            else{
                System.out.println(restaurantMenu.get(i).getName() + "\n" +
                        restaurantMenu.get(i).getPrice() + "\n" +
                        restaurantMenu.get(i).getDescription() + "\n" +
                        restaurantMenu.get(i).getDate());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        //adds item. saves date.
        menu.addItem("gorgonzola", 9.99,"dessert","delicious cheese");
        //print the menu.
        menu.printAll();

        Thread.sleep(10000);
        menu.addItem("pop tarts", 9.99,"dessert","delicious pastry");
        ArrayList<MenuItem> newMenu = menu.getRestaurantMenu();
        newMenu.get(0).toggleIsNew();
        menu.printAll();

    }
}
