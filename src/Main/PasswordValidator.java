package Main;

/**
 *
 * @author Kevin Añazco I
 */
class PasswordException extends Exception {

    public PasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {

    public static void validatePassword(String password, String confirmPassword) throws PasswordException {

        if (!password.equals(confirmPassword)) {
            throw new PasswordException("*** Las contraseñas NO coinciden ***");
        }
        if (password.contains(" ")) {
            throw new PasswordException("*** La contraseña NO debe contener espacios en blanco ***");
        }
        if (password.length() < 8) {
            throw new PasswordException("*** La contraseña DEBE tener por lo menos 8 caracteres *** ");
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if (!hasUpperCase || !hasDigit || !hasSpecialChar) {
            throw new PasswordException("*** La contraseña debe contener un carácter en mayúscula, un número y un carácter especial ***");
        }
    }
}
