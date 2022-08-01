import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args){
        StatsService servise = new StatsService();
        int[] input = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(servise.sum(input));
        System.out.println(servise.avarage(input));


    }
}
