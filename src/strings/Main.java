package strings;

public class Main {

    public static String likeIfYoureWatchingIn(int additionalYears ,int firstYear) {
        //String comment = "";
        int currentYear = firstYear;
        String comment = Integer.toString(firstYear);
        for (int i=0; i < additionalYears; i++) {
            currentYear ++;
            comment += ", "+ currentYear;
        }
        return "Like if you're watching in: " + comment;
    }

    public static void main(String[] args) {
        System.out.println(likeIfYoureWatchingIn(150,2000));
        System.out.println("Hello world!");
    }

}