package cn.homyit.coreJava.chap8.pair2;

/**
 * @author Cay Horstmann
 * @version 1.00 2004-05-10
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
