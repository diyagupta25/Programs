import java.sql.SQLOutput;
import java.util.Locale;

public class String_methods {
    public static void main(String[] args) {
        String name = "Diya";
        System.out.println(name);

        //name.length
        int value = name.length();
        System.out.println(value);

        //lower case
        String lstring = name.toLowerCase(Locale.ROOT);
        System.out.println(lstring);

        //upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //trim string
        String nontrim = "        Diya       ";
        System.out.println(nontrim);
        String trimst = "     Diya      ";
        System.out.println(trimst.trim());

        //substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        //replace
        System.out.println(name.replace('D','S'));

        //starts and ends with
        System.out.println(name.startsWith("Di"));
        System.out.println(name.endsWith("ya"));

        //index of and at
        System.out.println(name.charAt(2));
        String names = "diyaiyaiya";
        System.out.println(names.indexOf("y"));
        System.out.println(names.indexOf("iy", 5));
        System.out.println(names.lastIndexOf("y"));
        System.out.println(names.lastIndexOf("y",3));

        //equals
        System.out.println(name.equals("Diya"));
        System.out.println(name.equalsIgnoreCase("diya"));

        //escape sequences
        System.out.println("my name \f diya");
        System.out.println("my name \n diya");
        System.out.println("my name \t diya");
        System.out.println("my name \b diya");
        System.out.println("my name \r diya");
        System.out.println("my name \' diya");
        System.out.println("my name \" diya \"");
        System.out.println("my name \\ diya");
    }
}
