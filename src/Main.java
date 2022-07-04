import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас привествует счетчик каллорий!");
        printMenu();
        int command = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();

        while(command != 0) {
            if (command == 1) {
                System.out.println("За какой месяц ввести кол-во шагов?");
                int monthInput = scanner.nextInt();
                System.out.println("За какой день ввести кол-во шагов?");
                int dayInput = scanner.nextInt();
                System.out.println("Сколько шагов записать?");
                int stepInput = scanner.nextInt();
                stepTracker.stepSaver(monthInput,dayInput,stepInput);
            } else if (command == 2) {
                System.out.println("За какой месяц вы хотите посмотреть статистику?");
                int monthInput = scanner.nextInt();
                stepTracker.showStatsByDay(monthInput);
                stepTracker.showStatsMonthly(monthInput);
                stepTracker.findMaxStreak(monthInput);
            } else if (command == 3) {
                System.out.println("Ввведите новое значение цели по количеству шагов за день.");
                int newStepsGoal = scanner.nextInt();
                stepTracker.changeStepsGoal(newStepsGoal);
            } else if (command == 4) {
                System.out.println("Выход");
                break;
            } else {
            System.out.println("Такая команда не поддерживается.");
            }
            printMenu();
            command = scanner.nextInt();
        }
    }
    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Ввести количество шагов за день");
        System.out.println("2. Посмотреть статистику за месяц");
        System.out.println("3. Изменить цель по количеству шагов за день");
        System.out.println("4. Выход из программы");

    }
}
