import java.util.Random;

public class ServerNameGenerator {

    public static String randomName(String[] choices){
        Random name = new Random();
        String randomSelect = choices[name.nextInt(choices.length)];

        return randomSelect;
    }

    public static void main(String[] args){
        String[] adjectives = new String[10];
        String[] nouns = new String[10];

        adjectives[0] = "Black";
        adjectives[1] = "Big";
        adjectives[2] = "Nice";
        adjectives[3] = "Faded";
        adjectives[4] = "Light";
        adjectives[5] = "Round";
        adjectives[6] = "Sharp";
        adjectives[7] = "Damaged";
        adjectives[8] = "Old";
        adjectives[9] = "Ancient";

        nouns[0] = "John";
        nouns[1] = "Joe";
        nouns[2] = "Jose";
        nouns[3] = "Jacob";
        nouns[4] = "Justin";
        nouns[5] = "Julian";
        nouns[6] = "Jack";
        nouns[7] = "Jim";
        nouns[8] = "Jeremy";
        nouns[9] = "Jeffrey";

    System.out.println(randomName(adjectives) + "-" + randomName(nouns));

    }


}
