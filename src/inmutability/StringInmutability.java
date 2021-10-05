package inmutability;

/**
 * with the help of Baeldung we will know the concepts of each of the topics that we are going to see in this workshop.
 */
public class StringInmutability {

    public static void main(String[] args) {
        String str = "New value";
        str = "Old value";
        str ="other value";

        System.out.println(str);

        String str1 = "value1";
        String str2 = str1;
        str2 = "new value";

        System.out.println(str2 + " and " + str1);
    }
}
