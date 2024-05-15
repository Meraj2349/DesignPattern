package ClassWork.ProxyExample;

public class Main {
    public static void main(String[] args) {


        access acces = new proxyAccess();

        acces.check("Admin");

        acces.check("user");
    }
}
