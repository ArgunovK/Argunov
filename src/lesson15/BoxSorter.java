package lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Админ on 26.09.2017.
 */
public class BoxSorter {
    public static List<HeavyBox> sort(List<HeavyBox> boxes, int weight) {
        List<HeavyBox> resultList = new ArrayList<>();
        Iterator<HeavyBox> iterator = boxes.listIterator();
        while (iterator.hasNext()) {
            HeavyBox currentBox = iterator.next();
            if (currentBox.getWeight() > weight) {
                resultList.add(currentBox);
                iterator.remove();
            }
        }
        return resultList;
    }
}
