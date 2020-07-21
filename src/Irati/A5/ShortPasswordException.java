package Irati.A5;

public class ShortPasswordException extends Exception{
    public ShortPasswordException(String password){
        super(password);
    }
}
