package org.example;

public class ToLowerCase709 {
    public String toLowerCase(String str){
        String result = "";
        for (char c :str.toCharArray()){
            if(Character.isUpperCase(c)){
                result = result +(char)(c+32);
            }else{
                result = result + c;

            }
        }
        return result;
    }
}

