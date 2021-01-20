public class checkForString {

    public static void main(String[] args) {
        String stringToCheck = "Ichbincool";
        String stringToCheckFor = "fancy";

        System.out.print("'" + stringToCheck + "' contains " + "'" + stringToCheckFor + "': " + checkForString(stringToCheck, stringToCheckFor));

    }

    public static boolean checkForString(String stringToCheck, String stringToCheckFor) {
        return stringToCheck.contains(stringToCheckFor);
    }
}
