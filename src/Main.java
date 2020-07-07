import Kalman.*;
import java.util.*;

public class Main {
    private static KalmanFilter kalmanfilter = new KalmanFilter();

    public static void main(String[] arg) {

        kalmanfilter.initial();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-75);
        list.add(-76);
        list.add(-81);
        list.add(-75);
        list.add(-77);
        list.add(-76);
        list.add(-86);

        int oldvalue = list.get(0);
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            oldvalue = kalmanfilter.KalmanFilter(oldvalue, value);
            alist.add(oldvalue);
        }

        System.out.println(list);
        System.out.println(alist);

    }
}