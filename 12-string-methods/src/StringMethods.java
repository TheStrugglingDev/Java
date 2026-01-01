public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "14/10/1992";
        int startingIndex = birthDate.indexOf("1992");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "14", "10", "1992");
        System.out.println("newDate = " + newDate);

        newDate = "14" + "/" + "10" + "/" + "1992";
        System.out.println("newDate = " + newDate);

        System.out.println("newDate = " + newDate.replace('/', '-'));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(25));

        System.out.println("ABC\n".repeat(3).indent(10));
        System.out.println("-".repeat(25));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(25));
    }
}
