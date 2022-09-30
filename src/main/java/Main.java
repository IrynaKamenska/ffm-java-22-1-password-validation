public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(validatePasswordBool(""));
    }

    public static ValidationResult validatePassword(String password) {
        ValidationResult validationResult = new ValidationResult();

        if (password == null) {
            validationResult.setResult(false);
            validationResult.setMessage("Kein Passwort übergeben");
            return validationResult;
        }
        if (password.length() < 8 || password.length() > 20) {
            validationResult.setResult(false);
            validationResult.setMessage("Passwort zu kurz oder zu lang");
            return validationResult;
        }
        if (password.contains(" ") || password.contains("123456") || password.contains("passwort")) {
            validationResult.setResult(false);
            validationResult.setMessage("Passwort enthält verbotene Zeichenketten");
            return validationResult;
        }
        if (passwordContainsNoNumbers(password)) {
            validationResult.setResult(false);
            validationResult.setMessage("Passwort muss min. eine Zahl enthalten");
            return validationResult;
        }
        if (passwordContainsNoUpperCase(password)) {
            validationResult.setResult(false);
            validationResult.setMessage("Passwort muss min. einen Großbuchstaben enthalten");
            return validationResult;
        }
        if (passwordContainsNoLowerCase(password)) {
            validationResult.setResult(false);
            validationResult.setMessage("Passwort muss min. einen Kleinbuchstaben enthalten");
            return validationResult;
        }
        validationResult.setResult(true);
        validationResult.setMessage("Passwort ist korrekt");
        return validationResult;
    }
    public static boolean validatePasswordBool(String password) {
        if (password == null) {
            return false;
        }
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        if (password.contains(" ") || password.contains("123456") || password.contains("passwort")) {
            return false;
        }
        if (passwordContainsNoNumbers(password)) {
            return false;
        }
        if (passwordContainsNoUpperCase(password)) {
            return false;
        }
        return !passwordContainsNoLowerCase(password);
    }

    public static boolean passwordContainsNoNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean passwordContainsNoUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean passwordContainsNoLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)))
                return false;
        }
        return true;
    }
}