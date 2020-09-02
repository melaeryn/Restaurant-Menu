package restaurant;
import java.util.*;

public class MenuItem {


    private double menuPrice;
    private String name;
    private String description;
    private String category;
    private Date added = new Date();
    private boolean isNew = false;



    public MenuItem(String name, double price, String cat, String description) {
        this.name = name;
        this.menuPrice = price;
        this.category = cat;
        this.description = description;
        isNew = true;
    }
    public String getName() {
        return name;
    }

    public boolean equals(MenuItem compare){
        if(this.name == compare.getName() && this.description == compare.getDescription() &&
        this.menuPrice == compare.getPrice() && this.category == compare.getCategory()){
            return true;
        }
        return false;
    }
    //gets and sets price.
    public double getPrice() {
        return this.menuPrice;
    }

    public void setPrice(double price) {
        this.menuPrice = price;
    }

    //gets and sets category.
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // gets and sets description.
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    //sets date to given date.
    public Date getDate() {
        return added;
    }

    public void setDate(Date newDate) {
        this.added = newDate;
    }

    //two methods- one to tell you if it is new and one to change the value of isNew.
    public boolean isNew() {
        return this.isNew;
    }

    public void toggleIsNew() {
        this.isNew = !(this.isNew);
    }
}