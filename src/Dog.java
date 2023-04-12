public class Dog {
    private String name;
    private String color;
    private int age;
    private int teeth;

    public Dog(String name, String color, int age, int teeth) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.teeth = teeth;
    }
    public  Dog(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }


}
