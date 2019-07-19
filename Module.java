import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Module {

    public static void randomize(int n) {

        // main queue. uses methods in PriorityQueue to get values
        PriorityQueue pq = new PriorityQueue();

        Random random = new Random();
        ArrayList<String> marvelCharacters = new ArrayList<> (
                Arrays.asList("Iron Man", "Thanos", "Deadpool", "Hulk", "Thor", "Dormammu", "Jean Grey", "Richard Franklins", "Starlord", "Loki", "Apocalypse","Galactus")
        );
        ArrayList<PriorityQueue> charQueue = new ArrayList<>();

        // enqueue n character objects
        for(int i = 0; i < n; i++) {

            int randInt = random.nextInt(marvelCharacters.size());
            // get random character
            String mc = marvelCharacters.get(randInt);
            marvelCharacters.remove(randInt);
            // get random priority
            int priority = random.nextInt(5);

            // initialize a new queue and add to list
            charQueue.add(new PriorityQueue());
            // enqueue the new newest object.
            charQueue.get(charQueue.size()-1).enqueue(mc, priority);
        }

        int count = 0;
        // initiate PriorityQueue methods for each object
        while(count++ < charQueue.size()){

            // toString
            System.out.println("\nThe current queue is: ");
            System.out.println(pq.toString());

            // size
            System.out.println("Current queue size is: ");
            System.out.println(pq.size());

            // peek
            System.out.println("The next character to dequeue is: ");
            System.out.println(pq.peek());

            // dequeue
            pq.dequeue();
        }
    }


    public static void main(String[] args) {

        // must be <= character size (12)
        randomize(5);

    }
}

