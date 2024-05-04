package factory;

/**
 * Button
 */
public interface Button {

   public abstract void buttonOfEveryOs();
  
   
}

class android  implements Button{
    @Override
    public void buttonOfEveryOs() {
        System.out.println("android button.");
    }
}
 
class ios implements Button{
    @Override
    public void buttonOfEveryOs() {
        System.out.println("ios  button.");
    }
}

/**
 * factortCreation 
 
 */
abstract class factortCreation  {


    public abstract Button create(String s);

    
}

class Factoryy1 extends factortCreation 
{
    

    @Override
    public Button create(String s) {
        if (s =="android")
        {
            return new android(); 
        }

        else if (s=="ios")
        {
           return new ios(); 
        }

        else
        {
            return null;
        }

        
    } 
}

class client
{
    public static void main(String[] args) {
        Factoryy1 f= new Factoryy1();
        Button b = f.create("android");
       b.buttonOfEveryOs();
    }
}


 
