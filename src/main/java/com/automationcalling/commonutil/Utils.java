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
        	
        	
        	hub="192.168.64.2"; // for K8S
        	
       // 	hub="localhost"; // For docker-Zalenium
        	
        	System.out.println("View will be in: "+hub);
        	return (hub);
        }
        System.out.println("Return null");
		return null;
        
    }

}
