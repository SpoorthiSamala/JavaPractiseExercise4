package com.stackroute.junit;

public class CheckingWhetherTheStringContainsName {
    public  String returnTrueIfStringContainsName(String string,String name)
    {
        String stringreturn="";
        String[] str=string.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(name))
            {
                return "true";
            }
        }
        return "false";
    }
}
