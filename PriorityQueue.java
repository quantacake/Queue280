import java.util.ArrayList;


public class PriorityQueue {

    private static ArrayList<ArrayList<String>> queue = new ArrayList<>();

    public PriorityQueue() {}

    // add an element to the queue
    public void enqueue(String hero, Integer priority) {

        ArrayList<String> list = new ArrayList<>();
        list.add(0, hero);
        list.add(1, Integer.toString(priority));

        queue.add(list);
    }

    // remove and return next priority element
    public void dequeue() {

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        // remove the next element
        queue.remove(peek());
    }

    // check if queue is empty
    public boolean isEmpty() {

        return (queue.size() < 1);
    }

    // return the next element to be removed
    public ArrayList<String> peek() {

        ArrayList<String> list = new ArrayList<>();

        // search for highest priority first
        for (int i = 5; i >= 0; i--) {

            // start search at 0th index
            for (int j = 0; j < queue.size(); j++) {

                if (queue.get(j).get(1).equals(Integer.toString(i))) {
                    return queue.get(j);
                }
            }
        }
        return list;
    }

    // return the size of the queue
    public Integer size() {

        return queue.size();
    }

    // return a string representation of the current queue
    @Override
    public String toString() {

        String format = "";

        for(ArrayList<String> list: queue) {

            format += "(" + list.get(0) + ", " + list.get(1) + "), ";
        }
        return format;
    }

}


