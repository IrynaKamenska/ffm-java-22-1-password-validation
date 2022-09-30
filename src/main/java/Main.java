public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(validatePasswordBool(""));
    }

    public static String validatePassword(String password) {
        if (password == null) {
            return "Kein Passwort angegeben";
        }
        if (password.length() < 8 || password.length() > 20) {
            return "Passwort zu kurz";
        }
        if (password.contains(" ") || password.contains("123456") || password.contains("passwort")) {
            return "Passwort enthält verbotene Zeichenketten";
        }
        if (passwordContainsNotNumbers(password)) {
            return "Passwort muss min. eine Zahl enthalten";
        }
        if (passwordContainsNotUpperCase(password)) {
            return "Passwort muss min. einen Großbuchstaben enthalten";
        }
        if (passwordContainsNotLowerCase(password)) {
            return "Passwort muss min. einen Kleinbuchstaben enthalten";
        }
        return "Passwort korrekt";
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
        if (passwordContainsNotNumbers(password)) {
            return false;
        }
        if (passwordContainsNotUpperCase(password)) {
            return false;
        }
        return !passwordContainsNotLowerCase(password);
    }

    public static boolean passwordContainsNotNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean passwordContainsNotUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean passwordContainsNotLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)))
                return false;
        }
        return true;
    }
}