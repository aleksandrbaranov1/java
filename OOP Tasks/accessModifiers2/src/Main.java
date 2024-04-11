public class Main {
    public static void main(String[] args){
        System.out.print(fact(5));
    }
    public static int fact(int arg){
        if(arg <= 1) {
            return 1;
        }
        else{
            return arg * fact(arg - 1);
        }
    }
}