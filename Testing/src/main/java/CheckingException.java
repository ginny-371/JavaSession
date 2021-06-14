public class CheckingException extends Exception {
    public CheckingException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào không hợp lệ: "+ super.getMessage();
    }
}
