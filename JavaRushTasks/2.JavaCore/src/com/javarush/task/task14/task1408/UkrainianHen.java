package com.javarush.task.task14.task1408;

/**
 * Created by oleg on 20.03.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }
}
