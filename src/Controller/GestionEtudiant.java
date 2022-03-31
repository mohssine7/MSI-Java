package Controller;

import Model.Etudiant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionEtudiant {
    Etudiant e = new Etudiant();

    public void createEtudiant(String cin, String nom, String prenom, Integer age, String sexe, String email, String telephone)
    {
        //Vérification cin
        Pattern pattern = Pattern.compile("[A-Z]{1,2}[0-9]{6}");
        Matcher matcher = pattern.matcher(cin);
        boolean test = matcher.matches();
        if (test==true)
        {
            e.setCin(cin);
        }
        while (test==false){
            System.out.println("Réssayez");
            Matcher matcher2= pattern.matcher(cin);
            test= matcher2.matches();
            if (test==true) {
                e.setCin(cin);
            }
        }
        //Vérification nom
        //Vérification prenom
        //Vérification age
        //Vérification sexe
        //Vérification email
        //Vérification telephone

    }

    private void Validator(String cin) {
//        while (test==false){
//            System.out.println("Réssayez");
//            Matcher matcher2= pattern.matcher(x);
//            test= matcher2.matches();
//            if (test==true) {
//                e.setCin(cin);
//            }
//        }
    }


}
