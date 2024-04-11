public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        car1.accelerate();
        System.out.println(car1.get_speed());
        car1._break();
        System.out.println(car1.get_speed());
        car1._break();
        System.out.println(car1.get_speed());
        car1._break();
        System.out.println(car1.get_speed());
        car1._break();
        System.out.println(car1.get_speed());
        car1._break();
        System.out.println(car1.get_speed());
    }
}