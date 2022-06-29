import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас привествует счетчик каллорий!");

    while(true) {
    printMenu();
        int command = scanner.nextInt();
        if (command == 1) {}

            //...
        if (command == 4) {
            System.out.println("Выход");
            break;
        }
        else {
        System.out.println("Такая команда не поддерживается");
        }
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
