package Main;

/**
 *
 * @author Kevin Añazco I
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        String confirmPassword;
        try {
            System.out.println("*** Ingrese su contraseña: ");
            password = scanner.nextLine();
            System.out.println("*** Confirme su contraseña: ");
            confirmPassword = scanner.nextLine();

            PasswordValidator.validatePassword(password, confirmPassword);
            System.out.println("*** Contraseña válida ***");

        } catch (PasswordException e) {
            System.out.println("!!! ERROR: " + e.getMessage());
        }
    }
}
