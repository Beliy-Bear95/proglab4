package devices;

public class DressException extends Exception{
    public DressException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return String.format("no dress");
    }
}
