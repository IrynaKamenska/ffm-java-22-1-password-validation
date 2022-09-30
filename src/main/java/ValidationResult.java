public class ValidationResult {

    private boolean result;
    private String message;

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public String toString() {
        return "ValidationResult{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
