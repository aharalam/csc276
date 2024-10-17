import java.util.Random;

public class TwitterTest {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew Haralambous", "aharalam", 1000000);
        Person person2 = new Person("Carter Brockman", "cbrockman", 500000);
        Person person3 = new Person("Madelyn Moore", "mmoore", 250000);

        Person[] persons = {person1, person2, person3};

        Twitter twitter = new Twitter(persons);

        twitter.printAllUsers();

        String[] randomNames = {"Andrew", "Carter", "Madelyn", "Lucas", "Ryan", "Ian", "Jael-Ruby", "Daiyn", "Sujal", "Blake"};

        Person[] persons2 = new Person[20];

        Random random = new Random();

        // for loop which creates 20 person objects inside, and stores them in a Person array, which you can pass to your Twitter object
        for (int i = 0; i < 20; i++) {
            // use randomization to pick random names from randomNames above for name. Then add a @ sign in front of name for username, and randomly pick number of followers from 1 to 100.
            String randomName = randomNames[random.nextInt(randomNames.length)];

            //String username = "@" + randomName.toLowerCase(); // Wrote the @ symbol inside of Person.java toString() method return statement.
            String username = randomName.toLowerCase();

            int followers = random.nextInt(100) + 1;

            persons2[i] = new Person(randomName, username, followers);
        }

        // print all users and total number of followers like you did above
        Twitter twitter2  = new Twitter(persons2);
        twitter2.printAllUsers();

        System.out.println("Total followers: " + twitter2.calculateTotalFollowers());
    }
}