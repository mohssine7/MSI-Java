import Model.Etudiant;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
//        Etudiant e = new Etudiant();
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Entrez Cin");
//        String x = sc.nextLine();
//        Pattern pattern = Pattern.compile("[A-Z]{1,2}[0-9]{6}");
//        Matcher matcher = pattern.matcher(x);
//        boolean test = matcher.matches();
//        if (test==true)
//        {
//            e.setCin(x);
//        }
//        while (test==false){
//            System.out.println("Réssayez");
//            x=sc.nextLine();
//            Matcher matcher2= pattern.matcher(x);
//            test= matcher2.matches();
//            if (test==true) {
//                e.setCin(x);
//            }
//        }
//        System.out.println(e.getCin());
        String str = "Sample String";
        System.out.println(str.getClass().getSimpleName());
        String a ="test";
        Field f = str.getClass().getField();


    }
}