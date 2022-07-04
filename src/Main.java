import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас привествует счетчик каллорий!");
        printMenu();
        int command = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();
        int stepsGoal = 10000;

        while(command != 0) {
            if (command == 1) {
                System.out.println("За какой месяц ввести кол-во шагов?");
                int monthInput = scanner.nextInt();
                System.out.println("За какой день ввести кол-во шагов?");
                int dayInput = scanner.nextInt();
                System.out.println("Сколько шагов записать?");
                int stepInput = scanner.nextInt();
                if (stepInput > 0) {
                    stepTracker.stepSaver(monthInput,dayInput,stepInput);
                } else {
                    System.out.println("Колчество шагов не может быть отрицательным");
                }

            } else if (command == 2) {
                System.out.println("За какой месяц вы хотите посмотреть статистику?");
                int monthInput = scanner.nextInt();
                stepTracker.showStatsByDay(monthInput);
                int sumSteps = stepTracker.showStatsMonthly(monthInput);
                System.out.println("Общая сумма шагов за месяц: " + sumSteps);
                System.out.println("Среднее ко-во шагов за месяц составляет: " + sumSteps/30);
                System.out.println("За месяц вы прошли: " + converter.stepsToKm(sumSteps) + " километров");
                System.out.println("За месяц вы сожгли: " + converter.stepsToKCal(sumSteps) + " килокалорий");
                int maxStreak = stepTracker.findMaxStreak(monthInput, stepsGoal);
                System.out.println("Ваша лучшая серия составила: " + maxStreak);
            } else if (command == 3) {
                System.out.println("Ввведите новое значение цели по количеству шагов за день.");
                int newStepsGoal = scanner.nextInt();
                if (newStepsGoal > 0){
                    stepsGoal = newStepsGoal;
                    System.out.println("Значение изменено на: " + stepsGoal);
                } else {
                    System.out.println("Значение не может быть отрицательным");
                }
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
