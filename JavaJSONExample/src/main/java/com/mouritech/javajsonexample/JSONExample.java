package com.mouritech.javajsonexample;

/**
 * Hello world!
 *
 */
public class JSONExample 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JSONObjectUsingJavaProgram jobj = new JSONObjectUsingJavaProgram();
        jobj.createJsonObject();
        
        //create an object 
        ReadJSONObjectUsingJava robj = new ReadJSONObjectUsingJava();
        robj.readJSONObject();
        
        String quotation = "All is \"well\" ";
        System.out.println(quotation);
        
    }
}
