package service.comparator;

import java.util.Comparator;

public class SortByLamda implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b-a;
    }
}
