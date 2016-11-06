import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ScorpionOrange on 2016/11/03.
 * 用1~49之间的49个Integer对象填充数组，然后随机地打乱列表，并从打乱后的列表中选取前6个，
 * 最后再将选择的数值进行排序和打印。类似六合彩的形式。
 */
public class ShuffleTest {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 49; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
