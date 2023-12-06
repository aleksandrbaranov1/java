import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Revers revers = new Revers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Your reversed string: " + revers.myReverse(str));
    }
}
class Revers{

    public String myReverse(String str){
        String newStr = " ";
        for(int i = 0; i < str.length(); i++){
            newStr = str.charAt(i) + newStr;
        }
        return newStr;
    }
}