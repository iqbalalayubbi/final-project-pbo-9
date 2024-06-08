package com.kel9.fproject;

public class Controller {
    public static  String generateCode(String columnName, String tableName, String formatCode){
        String getLastData = DatabaseConnect.lastRowTable(columnName
        , tableName);
        int lastDatanumber = Integer.parseInt(getLastData.substring(3))+1;
        return String.format(formatCode+"%06d", lastDatanumber);
    }
}
