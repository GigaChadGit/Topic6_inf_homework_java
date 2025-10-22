public class Main {
    public static void main(String[] args) {
        // массив машин
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "black", 2500000, "A123BC77"),
            new Car(2, "Toyota", "Corolla", 2019, "white", 1500000, "B234CD88"),
            new Car(3, "Honda", "Accord", 2021, "silver", 2800000, "C345DE99"),
            new Car(4, "Ford", "Focus", 2018, "red", 1200000, "D456EF00"),
            new Car(5, "BMW", "X5", 2022, "blue", 5500000, "E567FG11")
        };

        // применяем метод который возвращает одинаковые бренды и записываем его в переменную
        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        
        // выводим массив машин с одинаковыми брендами
        for(Car car : toyotaCars) {
            System.out.println(car);
        }



     }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        // подсчет количества машин с одинаковыми брендами
        int count = 0;
        for (Car car : cars) {
            if (car.getBrend().equalsIgnoreCase(brend)) {
                count++;
            }
        }

        // нет машин = пустой список
        if (count == 0) {
            return new Car[0];
        }

        // массив для найденных машин
        Car[] result = new Car[count];
        int index = 0;

        // Заполняем массив найденными машинами
        for (Car car : cars) {
            if (car.getBrend().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }

        return result;
    }
}