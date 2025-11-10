import java.util.LinkedList; // для LinkedList

public class Cache<T> {
    private LinkedList<T> cacheList;
    private int lastElements;

    public Cache(int n) {
        this.cacheList = new LinkedList<>(); 
        this.lastElements = n;
    }


}
