import java.util.LinkedList; // для LinkedList

public class Cache<T> {
    private LinkedList<T> cacheList;
    // n становиться хранителем последних элементов в тот момент когды
    // в кэш добовляется какой либо новый элемент
    private int lastElements; 
    
    public Cache(int n) {
        this.cacheList = new LinkedList<>(); 
        this.lastElements = n;
    }

    public void add(T element) {
        if (cacheList.size() >= lastElements) {
            cacheList.removeFirst(); // удаляем самый старый элемент
        } 

        cacheList.addLast(element); // добавляем новый элемент в конец списка
    }

    public T boolRemove(T element) {
        if (!cacheList.isEmpty()) { // опрератор ! означает "не"
            boolean removed = cacheList.remove(element);
            return removed ? element : null;

        } else {
            return null;
            
        }
    }






    // для теста методов (вывод списка)
     public LinkedList<T> getAllElements() {
        return new LinkedList<>(cacheList); // Возвращаем копию списка
    }


}
