public class Main {
    public static class Phone{
        private static String number;
        private String model;
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }
        static String getNumber(){
            return number;
        }
    }
    public static void main(String[] args) {
        Phone Iphone = new Phone("123", "15");
        Phone Galaxy = new Phone("456", "s23");
        System.out.println(Iphone.getNumber());
        System.out.println(Galaxy.getNumber());
        Galaxy.getNumber();
    }
}