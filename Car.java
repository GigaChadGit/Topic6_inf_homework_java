public class Car {
    // классы
    private int id;
    private String brend;
    private String model;
    private int year;
    private String color;
    private int cost;
    private String regnum;

    // конструктор
    public Car(int id, String brend, String model, 
               int year, String color,
               int cost, String regnum) {
        this.id = id;
        this.brend = brend;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.regnum = regnum;
    }

    // get и set для каждого параметра конструктора

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getBrend() {return brend;}
    public void setBrend(String brend) {this.brend = brend;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public int getCost() {return cost;}
    public void setCost(int cost) {this.cost = cost;}

    public String getRegnum() {return regnum;}
    public void setRegnum(String regnum) {this.regnum = regnum;}

}