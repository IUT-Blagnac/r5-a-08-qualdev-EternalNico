package dojo; 

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String owner;
    private String target;
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<>();
    }


    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public void addCocktail(String cocktail) {
        this.cocktails.add(cocktail);
    }

    public List<String> getCocktails() {
        return new ArrayList<>(cocktails);
    }

    public String getOwner() {
        return owner;
    }

    public String getTarget() {
        return target;
    }
}
