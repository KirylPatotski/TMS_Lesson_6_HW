package com.main0Exception;
//Costume error if the doc number doesn't end with '1a2b'
public class CodeEndsWith1a2bException extends Exception{String message;
    public CodeEndsWith1a2bException(String a) {
        this.message = a;
    }
}
