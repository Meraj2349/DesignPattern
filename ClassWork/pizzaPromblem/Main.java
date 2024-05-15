package ClassWork.pizzaPromblem;

// Abstract Product
interface Topping {
    String getName();
}

// Concrete Products
class Cheese implements Topping {
    public String getName() {
        return "Cheese";
    }
}

class Pepperoni implements Topping {
    public String getName() {
        return "Pepperoni";
    }
}

// Abstract Factory
interface ToppingFactory {
    Topping createTopping();
}

// Concrete Factories
class CheeseFactory implements ToppingFactory {
    public Topping createTopping() {
        return new Cheese();
    }
}

class PepperoniFactory implements ToppingFactory {
    public Topping createTopping() {
        return new Pepperoni();
    }
}


public class Main {
    public static void main(String[] args) {
        // Create pizza with cheese topping
        ToppingFactory cheeseFactory = new CheeseFactory();
        Pizza cheesePizza = new Pizza(cheeseFactory);
        cheesePizza.addTopping();

        // Create pizza with pepperoni topping
        ToppingFactory pepperoniFactory = new PepperoniFactory();
        Pizza pepperoniPizza = new Pizza(pepperoniFactory);
        pepperoniPizza.addTopping();
    }
}
