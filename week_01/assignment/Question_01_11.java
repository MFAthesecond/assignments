package week_01.assignment;

public class Question_01_11 {
    public static void main(String args[]) {
        System.out.println("Population projection");
        System.out.println("Current population:  312032486 ");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds. ");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula:");
        System.out.println("Yearly population +((births per year)" +
                " - (deaths per year) + (new immigrants per year) ");
        System.out.println("Year 1 projection:");
        System.out.println(312032486.0 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Year 2 projection:");
        System.out.println(312032486.0 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)
                + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Year 3 projection:");
        System.out.println(312032486.0 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)
                + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45) + (60 * 60 * 24 * 365 / 7)
                - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Year 4 projection:");
        System.out.println(312032486.0 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)
                + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45) + (60 * 60 * 24 * 365 / 7)
                - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45) + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Year 5 projection:");
        System.out.println(312032486.0 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)
                + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45) + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13)
                + (60 * 60 * 24 * 365 / 45) + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)
                + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
    }
}
