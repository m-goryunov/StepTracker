public class StepTracker {
    int [][] monthAndDay = new int[12][30]; // Использовал двумерный массив, так как показалось интеренее реализовать так, не смотря на указание в подсказке на GetDate. Наставник был не против)
    void stepSaver(int monthInput, int dayInput, int stepInput) {
        monthAndDay[monthInput - 1][dayInput - 1] = stepInput;
    }
    void showStatsByDay(int monthInput){
        for (int j = 0; j < monthAndDay[0].length; j++) {
            System.out.print((j + 1) +" день: " + monthAndDay[monthInput-1][j] +", "); //Не дошло как вынести это на Main и стоит ли? Ведь массив в этом классе.
        }   System.out.println(); // Что бы последующие выводы на экран были в следующей сроке, а не как при System.out.print(); Умнее не придумал.
    }
    int showStatsMonthly(int monthInput){
        int sumSteps = 0;
            for (int j = 0; j < monthAndDay[0].length; j++){
            sumSteps = sumSteps + monthAndDay[monthInput-1][j];
            }
            return(sumSteps);
    }
    int findMaxStreak(int monthInput, int stepsGoal){
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
        return(maxStreak);
    }
}

