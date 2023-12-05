public class Main {
    public static void main(String[] args){
        cat valentin = new cat();
        valentin.age = 3;
        valentin.name = "Валентин";
        valentin.color = "orange";
        valentin.displayCatInfo();
    }
}

class cat{
    String name;
    int age;
    String color;
    void displayCatInfo() {
        System.out.printf("Name: %s, age: %s, color: %s ", name, age, color);
    }
}