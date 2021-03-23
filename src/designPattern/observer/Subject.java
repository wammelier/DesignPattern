package designPattern.observer;

/**
 * @Author Seungwhan Lee(sw4417@into.guru)
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
