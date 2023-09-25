import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добави задача");
            System.out.println("2. Изтрий задача");
            System.out.println("3. Изведи всички задачи");
            System.out.println("4. Изход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Въведете име на задачата: ");
                    scanner.nextLine(); // Почистваме буфера след nextInt()
                    String taskName = scanner.nextLine();
                    Task task = new Task(taskName);
                    tasks.add(task);
                    System.out.println("Задачата е добавена успешно!");
                    break;
                case 2:
                    System.out.print("Въведете номер на задачата за изтриване: ");
                    int taskIndex = scanner.nextInt();
                    if (taskIndex >= 0 && taskIndex < tasks.size()) {
                        tasks.remove(taskIndex);
                        System.out.println("Задачата е изтрита успешно!");
                    } else {
                        System.out.println("Невалиден номер на задачата!");
                    }
                    break;
                case 3:
                    System.out.println("Списък с задачи:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i).getName());
                    }
                    break;
                case 4:
                    System.out.println("Благодарим, че използвахте списъка със задачи!");
                    System.exit(0);
                default:
                    System.out.println("Грешен избор. Моля, опитайте отново.");
            }
        }
    }
}
