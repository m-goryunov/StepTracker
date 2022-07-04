public class StepTracker {
    int [][] monthAndDay = new int[12][30]; // Использовал двумерный массив, так как показалось интеренее реализовать так, не смотря на указание в подсказке на GetDate. Наставник был не против)
    int stepsGoal = 10000;
    Converter converter = new Converter();

    void stepSaver(int monthInput, int dayInput, int stepInput) {
        if (stepInput > 0) {
            for (int i = 0; i < monthAndDay.length; i++) {
                for (int j = 0; j < monthAndDay[0].length; j++) {
                    monthAndDay[monthInput - 1][dayInput - 1] = stepInput; //Записал в массив данные о шагах.
                }
            }
        } else {
            System.out.println("Колчество шагов не может быть отрицательным");
        }
    }
    void showStatsByDay(int monthInput){ // Вывод информации по кажому дню.
            for (int j = 0; j < monthAndDay[0].length; j++) {
                System.out.print((j + 1) +" день: " + monthAndDay[monthInput-1][j] +", ");
            }
        System.out.println(); // Что бы последующие выводы на экран были в следующей сроке, а не как при System.out.print();
    }
    void showStatsMonthly(int monthInput){ //Вся месячная статистика, кроме лучшей серии
        int sumSteps = 0;
            for (int j = 0; j < monthAndDay[0].length; j++){
            sumSteps = sumSteps + monthAndDay[monthInput-1][j]; //Общая сумма шагов по дням в определенном месяце
            }
        System.out.println("Общая сумма шагов за месяц: " + sumSteps);
        System.out.println("Среднее ко-во шагов за месяц составляет: " + sumSteps/30);
        System.out.println("За месяц вы прошли: " + converter.stepsToKm(sumSteps) + " километров");
        System.out.println("За месяц вы сожгли: " + converter.stepsToKCal(sumSteps) + " килокалорий");
    }
    void findMaxStreak(int monthInput){ //Поиск лучшей серии
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
    void changeStepsGoal(int newStepsGoal){ //Изменение цели
        if (newStepsGoal>=0){
            stepsGoal = newStepsGoal;
            System.out.println("Значение изменено на: " + stepsGoal);
        } else {
            System.out.println("Значение не может быть отрицательным");
        }
    }
}

