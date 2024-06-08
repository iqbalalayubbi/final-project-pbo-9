package com.kel9.fproject;

public class Controller {
    public static  String generateCode(){
        String getLastData = DatabaseConnect.lastRowTable();
        int lastDatanumber = Integer.parseInt(getLastData.substring(3))+1;
        System.out.println(lastDatanumber);
        return String.format("ORD%06d", lastDatanumber);
    }
}
