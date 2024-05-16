package ClassWork.BilderToDecorator;


// Interface for computer component
interface ComputerComponent {
    String getDescription();
    double getCost();
}

// Concrete component - Base computer
class BaseComputer implements ComputerComponent {
    private String HDD;
    private String RAM;
    private double cost;

    public BaseComputer(String HDD, String RAM, double cost) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return "HDD: " + HDD + ", RAM: " + RAM;
    }

    @Override
    public double getCost() {
        return cost;
    }
}

// Decorator - Graphics Card
class GraphicsCard implements ComputerComponent {
    private ComputerComponent computer;
    private double cost;

    public GraphicsCard(ComputerComponent computer, double cost) {
        this.computer = computer;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", Graphics Card";
    }

    @Override
    public double getCost() {
        return computer.getCost() + cost;
    }
}

// Decorator - Bluetooth
class Bluetooth implements ComputerComponent {
    private ComputerComponent computer;
    private double cost;

    public Bluetooth(ComputerComponent computer, double cost) {
        this.computer = computer;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", Bluetooth";
    }

    @Override
    public double getCost() {
        return computer.getCost() + cost;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a base computer
        ComputerComponent baseComputer = new BaseComputer("500 GB", "2 GB", 500);

        // Adding optional components using decorators
        ComputerComponent computerWithGraphicsCard = new GraphicsCard(baseComputer, 100);
        ComputerComponent computerWithBluetooth = new Bluetooth(computerWithGraphicsCard, 50);

        // Output description and cost
        System.out.println("Computer Description: " + computerWithBluetooth.getDescription());
        System.out.println("Computer Cost: $" + computerWithBluetooth.getCost());
    }
}
