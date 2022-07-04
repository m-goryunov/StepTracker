public class StepTracker {
    int [][] monthAndDay = new int[12][30]; // Использовал двумерный массив, так как показалось интеренее реализовать так, не смотря на указание в подсказке на GetDate.
    int stepsGoal = 10000;
    Converter converter = new Converter();

    void stepSaver(int monthInput, int dayInput, int stepInput) {
        if (stepInput > 0) {
            for (int i = 0; i < monthAndDay.length; i++) {
                for (int j = 0; j < monthAndDay[0].length; j++) {
                    monthAndDay[monthInput - 1][dayInput - 1] = stepInput; //Записал в массив данные о шагах.
                }
            }
            System.out.println("Значение за месяц " + monthInput + " и день " + dayInput + " в размере " + stepInput + " шагов записано."); // В ТЗ нет, но для себя вывел
        } else {
            System.out.println("Колчество шагов не может быть отрицательным");
        }
    }
    void showStatsByDay(int monthInput){
        for (int i = monthInput; i == monthInput; i++) {  // так определяю месяц для вывода информации по дням.
            for (int j = 0; j < monthAndDay[0].length; j++) {
                System.out.print("Месяц: " + i + ", " + (j + 1) +" день: " + monthAndDay[monthInput-1][j] +", "); // Вывод информации по кажому дню.
            }
        }
        System.out.println(); // что бы последующие выводы на экран были в следующей сроке
    }
    void showStatsMonthly(int monthInput){
        int sumSteps = 0;
            for (int j = 0; j < monthAndDay[0].length; j++){
            sumSteps = sumSteps + monthAndDay[monthInput-1][j];
            }
        System.out.println("Общая сумма шагов за месяц " + monthInput + ": " + sumSteps);
        System.out.println("Среднее ко-во шагов за месяц составляет: " + sumSteps/30);
        System.out.println("За месяц вы прошли: " + converter.stepsToKm(sumSteps) + " километров");
        System.out.println("За месяц вы сожгли: " + converter.stepsToKCal(sumSteps) + " килокалорий");
    }
    void findMaxStreak(int monthInput){
        int maxStreak = 0;
        int currentStreak = 0;
            for (int j = 0; j < monthAndDay[0].length; j++) {
                if (monthAndDay[monthInput - 1][j] >= stepsGoal) {
                    currentStreak = currentStreak + 1;
                    if (maxStreak < currentStreak)
                        maxStreak = currentStreak;
                } else if (monthAndDay[monthInput - 1][j] < stepsGoal) {
                    currentStreak = 0;
                }
            }
        System.out.println("Ваша лучшая серия составила: " + maxStreak);
    }
    void changeStepsGoal(int newStepsGoal){
        if (newStepsGoal>=0){
            stepsGoal = newStepsGoal;
            System.out.println("Значение изменено на: " + stepsGoal);
        } else {
            System.out.println("Значение не может быть отрицательным");
        }
    }
}

