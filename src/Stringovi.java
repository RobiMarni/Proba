import java.util.Locale;

public class Stringovi {


    public static void main(String[] args) {


        //substring

        String county = "Montenegro";

        String monte = county.substring(0, 5);
        System.out.println(monte);
        String negro = county.substring(5, 10);
        System.out.println(negro);
        String monteput = monte + "put";
        String bomboneNegro = "bombone" + negro;

        System.out.println(monteput);
        System.out.println(bomboneNegro);

        String name = "Robert";
        String surname = "Marnikovic";
        int age = 24;
        System.out.println(name + " " + surname + " " + age + " " + "godine");


        if (name.equals(surname)) {
            System.out.println("Jesu");
        } else {
            System.out.println("Nisu");
        }

        String e = "";

        if (e.equals("")) {
            System.out.println("prazan");
        } else {
            System.out.println("nije prazan");
        }

        String amp = "AMPLITUDO";
        char charFirstLetter = amp.charAt(7);
        System.out.println(charFirstLetter);

        System.out.println(amp.contains("MPLI"));

        if (amp.contains("MPLI")) {
            System.out.println("Sadrzi");
        } else {
            System.out.println("Ne sadrzi");
        }

        System.out.println(amp.toLowerCase());
        System.out.println(amp.toUpperCase());

        System.out.println(amp.equalsIgnoreCase("amplitudo"));

        String test = "ana voli milovana";
        StringBuilder reverse = new StringBuilder();
        System.out.println(reverse.append(test).reverse());

        String words = "Koliko ima rijeci u recenici?";
        System.out.println(words.split(" ").length);




        /*
         * .replace
         * .trim
         * .startswith()
         * endswith();
         * .indexOf();
         *
         *
         * */


    }
}
