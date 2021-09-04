package com.main0;
import com.main0Exception.CodeContainsABCException;
import com.main0Exception.CodeEndsWith1a2bException;

import com.main0Exception.CodeStartsWith555Exception;
/**This class checks whether the custom exceptions are true or false.*/
public class Main {
    public static void main(String[] args) throws CodeContainsABCException, CodeStartsWith555Exception, CodeEndsWith1a2bException {
        System.out.println("Start");
        try{
        // xxxx-yyy-xxxx-yyyy-xyxy; x is a number, y a letter
                String docNumber = "5554-abc-5678-def-1a2b";
                if (docNumber.toLowerCase().contains("abc")){
                    System.out.println("Contains abc.");
                }else{
                    throw new CodeContainsABCException("Does not contain abc");
                }
                if (docNumber.toLowerCase().startsWith("555")){
                    System.out.println("Starts with 555");
                }else{
                    throw new CodeStartsWith555Exception("Does not start with 555");
                }
                if (docNumber.toLowerCase().endsWith("1a2b")){
                    System.out.println("Ends with 1a2b");
                }else{
                    throw new CodeEndsWith1a2bException("Does not end with 1a2b");
                }

                }catch (Exception e){
            System.out.println("Something went wrong.");
                }
        System.out.println("End");


    }
}
