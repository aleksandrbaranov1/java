import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import  java.util.Scanner;
public class Employee {
    private static String name;
    private static int id;
    private static String department;
    private static String jobTitle;

    static Map<Integer, String> workersBase = new HashMap<>();
    public Employee(String name, int id, String department, String jobTitle){
        this.name = name;
        this.id = id;
        this.department = department;
        this.jobTitle = jobTitle;
        String[] workerInfo = {name, department, jobTitle};
        String workerInfo2 = Arrays.toString(workerInfo);
        workersBase.put(id, workerInfo2);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setJobTitle (String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String getDepartment(){
        return department;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public String toString(){
        return String.format("Имя: %s, id: %d, Отдел: %s, Должность: %s", name , id, department, jobTitle);
    }

    public static void findAnEmployee (){
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(workersBase.get(id));
    }

    public static void newEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите id: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите отдел: ");
        department = scanner.nextLine();
        System.out.print("Введите должность: ");
        jobTitle = scanner.nextLine();

        Employee worker = new Employee(name, id, department, jobTitle);

        String[] workerInfo = {name, department, jobTitle};
        String workerInfo2 = Arrays.toString(workerInfo);
        workersBase.put(id, workerInfo2);
    }

    public static void changingEmployeeData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id сотрудника для замены: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите новое имя сотрудника: ");
        name = scanner.nextLine();
        System.out.print("Введите новое отдел сотрудника: ");
        department = scanner.nextLine();
        System.out.print("Введите новую должность сотрудника: ");
        jobTitle = scanner.nextLine();

        String[] workerInfo = {name, department, jobTitle};
        String workerInfo2 = Arrays.toString(workerInfo);
        workersBase.put(id, workerInfo2);
    }

    public static void deletingAnEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id сотрудника для удаления: ");
        id = Integer.parseInt(scanner.nextLine());
        workersBase.remove(id);
    }

}
