package javaapplication3;
import  java.io.*;
import java.util.*;


// СОЗДАТЬ В КОРНЕ ДИСКА "С" ТЕКСТОВЫЙ ФАЙЛ С ИМЕНЕМ ТЕСТ И ЗАПОЛНИТЬ ЕГО ЛЮБЫИТ ЗНАЧЕНИЯМИ!

public class readfile{
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("c:\\тест.txt"), "Cp1251"));
        List<String> fileContent = new ArrayList<String>() ;
        String str;
        while( (str = br.readLine() ) != null )
            fileContent.add(str);
        System.out.println( fileContent);
        br.close();
    }
}