package ru.netology.stats;

public class StatsService {
    public int sum(int[] input) {
        int result = 0;
        for (int i = 0; i<input.length; i++){
            result = result + input[i];
        }
        return result;
    }
    public float avarage(int[] input) {
       return (float)sum(input)/input.length;
    }


}
