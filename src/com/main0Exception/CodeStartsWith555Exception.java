package com.main0Exception;
////Costume error if the doc number doesn't start with '555'
public class CodeStartsWith555Exception extends Exception{
    String message;
    public CodeStartsWith555Exception(String a) {
        this.message = a;
    }
}
