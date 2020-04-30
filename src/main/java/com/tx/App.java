package com.tx;

import com.tx.service.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "this is the first github project!" );

        TestService ts=new TestService();
        System.out.println(ts.getString());
    }
}
