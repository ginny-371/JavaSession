public class StringException extends Exception {
    public StringException(String message){
        super(message);
    }
    @Override
    public String getMessage(){
        return "Lỗi không nhập đúng văn bản: "+ super.getMessage();
    }
}
