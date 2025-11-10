public class Cachetest {
    public static void main(String[] args) {
        System.out.println("тест метода add");

        Cache<String> cachedata = new Cache<>(3);
        cachedata.add("1a");
        cachedata.add("2b");
        cachedata.add("3c");
        System.out.println(cachedata.getAllElements());
        cachedata.add("4d");
        System.out.println(cachedata.getAllElements() + "\n");




        System.out.println("Тест метода boolRemove");

        cachedata.boolRemove("4d");
        System.out.println(cachedata.getAllElements());
        

    }
}