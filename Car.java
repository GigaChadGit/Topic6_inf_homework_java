public class Car {
    // классы
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int cost;
    private int regnum;

    // конструктор
    public Car(int id, String mark, String model, 
               int year, String color,
               int cost, int regnum) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.regnum = regnum;
    }

    // get и set для каждого параметра конструктора

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getMark() {return mark;}
    public void setMark(String mark) {this.mark = mark;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public int getCost() {return cost;}
    public void setCost(int cost) {this.cost = cost;}

    public int getRegnum() {return regnum;}
    public void setRegnum(int regnum) {this.regnum = regnum;}

}