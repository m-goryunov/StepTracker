public class StepTracker {
    int [][] monthAndDay = new int[12][30]; // 1й - строка 2й - столбец
    int stepsGoal = 10000;

    void stepSaver(int monthInput, int dayInput, int stepInput) {
        for (int i = 0; i < monthAndDay.length; i++){
            for (int j = 0; j < monthAndDay[0].length; j++){
            monthAndDay[monthInput-1][dayInput-1] = stepInput;
            }
        }
        System.out.println("Значение за месяц " + monthInput + " и день " + dayInput + " в размере " + stepInput + " шагов записано.");
    }
    void showStatMonthly(int monthInput){
        for (int i = monthInput; i == monthInput; i++) {
            for (int j = 0; j < monthAndDay[0].length; j++) {
                System.out.print("Месяц: " + i + ", " + (j + 1) +" день: " + monthAndDay[monthInput-1][j] +", ");
            }
        }
    }
    void showSumStepsMonthly(int monthInput){
        int sumSteps = 0;
        for (int i = monthInput; i == monthInput; i++) {
            for (int j = 0; j < monthAndDay[0].length; j++){
            sumSteps = sumSteps + monthAndDay[monthInput-1][j];
            }
        }
        System.out.println("Общая сумма шагов за месяц " + monthInput + ": " + sumSteps);
        System.out.println("Среднее ко-во шагов за месяц составляет: " + sumSteps/30);
    }
    void changeStepsGoal(int newStepsGoal){
        if (newStepsGoal>=0){
            stepsGoal = newStepsGoal;
            System.out.println("Значение изменено на: " + stepsGoal);
        } else {
            System.out.println("Значение не может быть отрицательным");
        }
    }
    //Пройденная дистанция (в км);
    //Количество сожжённых килокалорий;
    //Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
}

