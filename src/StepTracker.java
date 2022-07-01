public class StepTracker {
    int[][] monthAndDay = new int[12][30]; // 1й - строка 2й - столбец

    int stepSaver(int monthCount, int dayCount, int stepCount) {
    int saveStep = stepCount;
    monthAndDay[monthCount - 1][dayCount - 1] = saveStep;
    System.out.println("Значение за месяц " + monthCount + "и день " + dayCount + "в размере " + saveStep + "шагов.");
    return saveStep;
    }
    int showStatMonthly

}
