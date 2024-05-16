package BuilderDesignPattern;
public class Computer {
    private String HDD;
    private String RAM;

    private Computer(ComputerBuilder builder)
    {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;

    }

    public String getHDD()
    {
        return HDD;
    }
    public String getRAM()
    {
        return RAM;
    }

    public static class ComputerBuilder
    {
        private String HDD;
        private String RAM;




        public ComputerBuilder setHDD(String HDD)
        {
            this .HDD=HDD;
            return this;
        }
        public ComputerBuilder setRAM(String RAM)
        {
            this.RAM=RAM;
            return this;

        }



        public Computer build()
        {
            return new Computer (this);
        }
    }




}

class Main{
    public static void main(String[] args) {
        Computer com= new Computer.ComputerBuilder().setHDD("50").setRAM("500").build();

        System.out.println(com.getHDD()+ com.getRAM());
    }

}