import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit = true;

        while (exit){
            String[] menuPositions = {"1. Найти сотрудника в словаре",
            "2. Добавить нового сотрудника в словарь",
            "3. Изменить имя, отдел и должность существующего сотрудника в словаре",
            "4. Удалить сотрудника из словаря",
            "5. Выйти из программы"};

            for (int i = 0; i < menuPositions.length; i++){
                System.out.println(menuPositions[i]);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите пункт: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    Employee.findAnEmployee();
                    break;
                case 2:
                    Employee.newEmployee();
                    break;
                case 3:
                    Employee.changingEmployeeData();
                    break;
                case 4:
                    Employee.deletingAnEmployee();
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    break;
            }
        }

    }
}