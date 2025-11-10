public class Cachetest {
    public static void main(String[] args) {
        Cache<String> cacheData = new Cache<>(3);
        Cache<String> cacheDataTestRemove = new Cache<>(3);
        
        
        System.out.println("тест метода add");

        cacheData.add("2b");
        cacheData.add("3c");
        System.out.println(cacheData.getAllElements());
        cacheData.add("4d");
        System.out.println(cacheData.getAllElements() + "\n");


        System.out.println("Тест метода remove");
        
        cacheData.remove("4d");
        System.out.println(cacheData.getAllElements());
        cacheDataTestRemove.remove("5e");
        System.out.println(cacheDataTestRemove.getAllElements() + "\n");


        System.out.println("Тест метода exists");

        cacheData.exists("92dd");
        System.out.println(cacheData.getAllElements());
        cacheData.exists("2b");
        System.out.println(cacheData.getAllElements() + "\n");


        System.out.println("Тест метода getFirst");

        System.out.println(cacheData.getFirst());
        System.out.println(cacheData.getAllElements() + "\n");


        System.out.println("Тест метода getLast");

        System.out.println(cacheData.getLast());
        System.out.println(cacheData.getAllElements() + "\n");


        System.out.println("Тест метода gettenByIndex");

        System.out.println(cacheData.gettenByIndex(0));
        System.out.println(cacheData.getAllElements() + "\n");

 

    }
}