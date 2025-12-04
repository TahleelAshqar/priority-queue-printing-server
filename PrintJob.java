public class PrintJob implements Prioritizable {

    private String text;
    private int priority;

    public PrintJob(String text, int priority) {
        this.text = text;

        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
            this.priority = priority;
        } else {
            this.priority = MIN_PRIORITY;
        }
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int p) {
        if (p >= MIN_PRIORITY && p <= MAX_PRIORITY)
            this.priority = p;
        else
            this.priority = MIN_PRIORITY;
    }

    public String getText() {
        return text;
    }
}
