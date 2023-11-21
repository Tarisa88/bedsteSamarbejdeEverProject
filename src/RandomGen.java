import java.util.ArrayList;
import java.util.Random;

public class RandomGen {

    private static final String string0 = "Mormors lort";
    private static final String string1 = "Fundet i vejkanten";
    private static final String string2 = "Skråt";
    private static final String string3 = "Efterladt";
    private static final String string4 = "Nyeste bling bling";
    private static final String string5 = "Dyrt i drift";
    private static final String string6 = "Ingen ved det";
    private static final String string7 = "Ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";

    private static ArrayList< String > strings = new ArrayList<>();

    static {
        strings.add( string0 );
        strings.add( string1 );
        strings.add( string2 );
        strings.add( string3 );
        strings.add( string4 );
        strings.add( string5 );
        strings.add( string6 );
        strings.add( string7 );
    }

    public static String randomString() {
        return randomString( strings );
    }

    public static String randomString( ArrayList< String > strings ) {
        Random random = new Random();
        int randomIndex = random.nextInt( strings.size() );
        return strings.get( randomIndex );
    }

    public static int randomInt() {
        Random random = new Random();
        return random.nextInt( 951 ) + 50;
    }

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
