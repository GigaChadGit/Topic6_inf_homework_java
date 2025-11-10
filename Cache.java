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

    public boolean remove(T element) {
        if (!cacheList.isEmpty()) { // опрератор ! означает "не"
            cacheList.remove(element);
            return true;

        } else {
            System.out.println("Список пуст");
            return false;

        }
    }

    public boolean exists(T element) {
        if (element != null) {
            for (T item : cacheList) {
                if (item.equals(element)) {
                    System.out.println(element + " такой элемент найден");
                    return true;
                }
            }
        }
        
        System.out.println(element + " такой элемент не найден");
        return false;
    }


    public T getFirst() {
        return cacheList.getFirst();
    }







    // для теста методов (вывод списка)
     public LinkedList<T> getAllElements() {
        return new LinkedList<>(cacheList); // Возвращаем копию списка
    }


}
