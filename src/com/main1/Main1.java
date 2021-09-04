package com.main1;
/**This class simulates a login. If you do what the console tells you,
 * the loginAndPassword method will return true, otherwise it will return false.*/
import java.util.Scanner;
import com.main1Exception.WrongLoginException;
import com.main1Exception.WrongPasswordException;
public class Main1 {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner a = new Scanner(System.in);
            System.out.print("Please enter your login name. It should be shorter than 20 and cannot contain ' '. Enter: ");
            String login = a.nextLine();
            System.out.print("Your password has to be shorter than 20, must contain at least one number and it cannot contain a ' '");
            System.out.println(" Please enter your password: ");
            String password = a.nextLine();
            System.out.println("Now confirm your password: ");
            String passwordConfirm = a.nextLine();
            checkValidity(login, password, passwordConfirm);

    }
    public static boolean checkValidity(String login, String password, String confirmPassword) {
            boolean verificationPassed = true;
            try {
                try {
                    if (login.length() >= 20 || login.contains(" ")) {
                        verificationPassed = false;
                        throw new WrongLoginException("Login length should be less than 20 and login can't contain blanks");
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (password.length() >= 20 || password.contains(" ") || !password.matches(".*[0-9].*") || !password.equals(confirmPassword)) {
                    verificationPassed = false;
                    throw new WrongPasswordException("Password length should be less than 20 and login can't contain blanks. Confirm password should be equal to the original password");
                }
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(verificationPassed);
            return verificationPassed;
        }
    }

