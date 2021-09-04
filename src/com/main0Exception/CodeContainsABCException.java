package com.main0Exception;
//Costume error if the doc number doesn't contain 'abc'
public class CodeContainsABCException extends Exception{
    String message;
    public CodeContainsABCException(String a) {
        this.message = a;
    }
}
