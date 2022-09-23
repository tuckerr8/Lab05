public class PartyAffiliation {
    public static void main(String[] args) {
        String party = "R";

        if (party.equalsIgnoreCase("R")) {
            System.out.println("You get an elephant. Roll Tide!");
        } else if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a donkey. EEE HAW!");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You are an independent mind. Think freely.");
        } else {
            System.out.println("You didn't type in a valid party!");
        }
    }
}
