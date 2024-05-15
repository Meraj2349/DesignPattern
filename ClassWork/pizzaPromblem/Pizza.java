package ClassWork.pizzaPromblem;

// Usage
public class Pizza {
    private ToppingFactory toppingFactory;

    public Pizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    public void addTopping() {
        Topping topping = toppingFactory.createTopping();
        System.out.println("Added " + topping.getName() + " topping.");
    }
}
