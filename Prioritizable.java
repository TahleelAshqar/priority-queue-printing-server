public interface Prioritizable {
    int MAX_PRIORITY = 10, MIN_PRIORITY = 1;

    int getPriority();
    void setPriority(int p);
}
