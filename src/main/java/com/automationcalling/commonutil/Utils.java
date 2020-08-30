package com.automationcalling.commonutil;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils 
{

    private Utils() 
    {
        throw new IllegalStateException("Utility class");
    }

    public static String returnProperties(String keyName) throws IOException 
    {
        String hub="";

        
        if (keyName.equalsIgnoreCase("HubName"))
        {
        	hub="localhost";
        	return (hub);
        }
		return null;
        
    }

}
