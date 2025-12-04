public class PriorityQueue {

    private Prioritizable[] arr;
    private int size;

    public PriorityQueue() {
        arr = new Prioritizable[100];
        size = 0;
    }

    public void insert(Prioritizable element) {
        if (size == arr.length) return; // queue full

        int i = size - 1;

        // shift all elements with LOWER priority to the right
        while (i >= 0 && arr[i].getPriority() < element.getPriority()) {
            arr[i + 1] = arr[i];
            i--;
        }

        // Elements with EQUAL or HIGHER priority stay before it → stable order

        arr[i + 1] = element;
        size++;
    }

    public Prioritizable remove() {
        if (size == 0) return null;
        Prioritizable first = arr[0];

        // shift left
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

        size--;
        arr[size] = null;

        return first;
    }
}
