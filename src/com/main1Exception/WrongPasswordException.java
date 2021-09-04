package com.main1Exception;
/**Custom error if the password is wrong*/
public class WrongPasswordException extends Exception{
String message;
    public WrongPasswordException(String a) {
        this.message=a;
    }
}
