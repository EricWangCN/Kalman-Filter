import Kalman.*;
import java.util.*;

public class Main {
    private static KalmanFilter kalmanfilter = new KalmanFilter();

    public static void main(String[] arg) {

        kalmanfilter.initial();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i)
        {
            list.add((int)(100*Math.cos(2*3.1415926*i/7)));
        }

        int oldvalue = list.get(0);
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            oldvalue = kalmanfilter.KalmanFilter(oldvalue, value);
            alist.add(oldvalue);
        }
        System.out.println("滤波前：");
        System.out.println(list);
        System.out.println("滤波后：");
        System.out.println(alist);

    }
}