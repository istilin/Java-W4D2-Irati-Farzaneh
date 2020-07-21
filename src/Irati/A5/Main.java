package Irati.A5;


public class Main {
    private String name;
    private String password;


    public Main(String name, String password){
        this.name = name;
        this.password = password;
    }
    public void f() throws LetterPasswordException{

    }

    public void g() throws ShortPasswordException{
        if (password.length()<8){
            throw new ShortPasswordException("Password is too short.");
        }
    }
    public static void main(String[] args) {

    }
}
