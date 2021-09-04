package com.main1Exception;
/**Custom error if the login is wrong*/
public class WrongLoginException extends Exception {
    String message;
    public WrongLoginException(String a) {
        this.message = a;
    }
}
