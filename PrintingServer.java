public class PrintingServer {

    private PriorityQueue queue;

    public PrintingServer() {
        queue = new PriorityQueue();
    }

    public void acceptJob(PrintJob p) {
        queue.insert(p);
    }

    public void print() {
        Prioritizable job = queue.remove();
        if (job == null) return;

        PrintJob casted = (PrintJob) job;
        System.out.println(casted.getText());
    }
}
