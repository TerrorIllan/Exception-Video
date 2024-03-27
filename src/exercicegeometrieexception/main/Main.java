package exercicegeometrieexception.main;

import java.util.ArrayList;

public class Main {

    public static void main( String[] args ) /* throws Exception */ {
        WrkExceptionVideo wrk = new WrkExceptionVideo();
        wrk.printExceptionTable();
        System.out.println(wrk.creationNumberFormatException(1));

        try {
            wrk.resumer(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // wrk.resumer(1);



// ArrayList<String> tab = null;
// int i = tab.size();

        ArrayList<String> tab = null;
        if (tab != null) {
            int i = tab.size();
            tab.add("4");
        } else {
            System.out.println("Attention, ArrayList null");
        }
    }

}
