public class BirthMonth {
    public static void main(String[] args) {
        int birthMonth = 14;

        if (birthMonth < 1) {
            System.out.println("Please enter a correct month");
        } else if (birthMonth > 12) {
            System.out.println("Please enter a correct month");
        } else {
            System.out.println("Your birth month is: " + birthMonth);
        }
    }
}
