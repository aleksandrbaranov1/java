public class Main {
    public static void main(String[] args) {
        Integer x = 0;
        String[] operations = new String[] {"--X","++X","X++"};
        for (int i = 0; i < operations.length; i++) {
            if ((operations[i] == "--X") || (operations[i] == "X--")) {
                x --;
            }
            if ((operations[i] == "X++") || (operations[i] == "++X")) {
                x ++;
            }
        }
        System.out.println(x);
    }
}