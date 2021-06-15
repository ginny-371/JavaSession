public class CheckingException extends Exception {
    public CheckingException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi: "+ super.getMessage();
    }
}
