package exercicegeometrieexception.main;



public class WrkExceptionVideo {

    //Methode montrant la syntaxe du try{} catch{}
    public void syntaxeTryCatch() {
        try {
            //Permet "d’essayer" du code
        } catch (ArithmeticException e) {
            //Permet d’attraper l’erreur qui s’est produite dans le try et de la gérer
        } catch (Exception e) {
            //...
        } finally {
            //Le code contenu dans le finally est exécuté dans tous les cas
        }
    }








    /* ================================================================================================================== */


    // Exception non-gérée, java ne nous oblige pas à attraper l'exception.
    public int creationNumberFormatException(int intToConvert) {
        int convertStrToInt = 0;
        try {
            convertStrToInt = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Attention, il y a une erreur !");
        }
        return convertStrToInt;
    }









    /* ================================================================================================================== */


    public static void methodeQuiGenereUneAutreExceptionNonControlee() throws NumberFormatException {
        int stringToInt = Integer.parseInt("1234a");
    }









    /* ================================================================================================================== */


    public void resumer(int nbr2) throws Exception {
        String valeurAConvertir = "123a";
        int nbr;
        try {
            //Conversion de string en int
            nbr = Integer.parseInt(valeurAConvertir);
        } catch (NumberFormatException e) {
            //Ca va provoquer manuellement l'exception et afficher le message d'après
        }

        if (nbr2 == 0) {
            throw new Exception("Valeur égal à zero");
        } else if (nbr2 >= 1) {
            throw new Exception("Valeur plus grand que 0");
        } else {
            throw new Exception("Valeur plus petit que 0");
        }

    }
    /* ================================================================================================================== */

    public void printExceptionTable() {
        // Titres des colonnes
        System.out.println("--------------------------------------------------------------------- ");
        System.out.println("| Exception non-contrôlée         |         Contrôlée                 |");
        System.out.println("--------------------------------------------------------------------- ");
        // Exceptions non-contrôlées
        System.out.println("| NullPointerException            |         FileNotFoundException     |");
        System.out.println("| ArrayIndexOutOfBoundsException  |         IOException               |");
        System.out.println("| ClassCastException              |         ParseException            |");
        System.out.println("| NumberFormatException           |         SQLException              |");
        System.out.println("|                                 |         ClassNotFoundException    |");
        System.out.println(" --------------------------------------------------------------------- ");
    }

}