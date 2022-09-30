public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(validatePasswordBool(""));
    }

    public static String validatePassword(String password) {
        if (password == null) {
            return "Passwort ist leer";
        } else if (password.length() < 8) {
            return "Passwort zu kurz";
        } else if (password.contains(" ")) {
            return "Passwort enthält Leerzeichen";
        }
        else
        return "Passwort korrekt";
    }
    public static boolean validatePasswordBool(String password) {
        if (password == null) {
            return false;
        } else if (password.length() < 8 || password.length() > 20) {
            return false;
        } else if (password.contains(" ")) {
            return false;
        } else if (!passwordContainsNumbers(password)) {
            return false;
        } else if (!passwordContainsUpperCase(password)) {
            return false;
        } else if (!passwordContainsLowerCase(password)) {
            return false;
        } else
            return true;
    }

    public static boolean passwordContainsNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean passwordContainsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean passwordContainsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i)))
                return true;
        }
        return false;
    }
}