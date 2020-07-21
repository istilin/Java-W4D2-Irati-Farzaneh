package Irati.A6;

public class Main {
    public void method(String string1, String string2, String string3) throws Exception1, Exception2, Exception3{
        try  {
            throw new Exception1("Exception1");
        }
        catch(Exception e){
            System.out.println("Error: "  +  e.getMessage());
        }

        try  {
            throw new Exception2("Exception2");
        }
        catch(Exception e){
            System.out.println("Error: "  +  e.getMessage());
        }

        try  {
            throw new Exception1("Exception3");
        }
        catch(Exception e){
            System.out.println("Error: "  +  e.getMessage());
        }
    }
    public static void main(String[] args) throws Exception3, Exception2, Exception1 {

        Main main = new Main();
        main.method("Hello", "World", "!");
    }
}
