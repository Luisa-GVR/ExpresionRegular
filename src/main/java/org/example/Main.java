package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        if (args.length==0){
            System.out.println("No argumentos encontrado");
            System.exit(3);
        }

        String regularExp = "(?i)\\b(java|python|go|pascal|perl)\\b";
        Pattern pattern = Pattern.compile(regularExp);

        boolean encontrado = true;
        for(String arg : args){
            Matcher matcher = pattern.matcher(arg);
            while(matcher.find()){
                encontrado = false;
                System.out.println("Se ha encontrado, " + matcher.group());
            }
        }
        if (encontrado){
            System.out.println("No se ha encontrado ninguna coincidencia");
        }
    }
}