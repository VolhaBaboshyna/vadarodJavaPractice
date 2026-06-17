package by.lessons.practices.class7;

public class UserNotFoundException extends RuntimeException{
    private String errorCode;

    public UserNotFoundException() {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
