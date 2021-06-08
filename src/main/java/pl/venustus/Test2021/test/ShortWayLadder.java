package pl.venustus.Test2021.test;

import org.springframework.stereotype.Service;

@Service
public class ShortWayLadder {
    public Integer calcShortWayLadder(String text) {
        String[] strArray = text.split(" ");
        Integer result = Integer.parseInt(strArray[0]);
        int i;
        for (i = 0; i < (strArray.length - 2); i++) {
            if ((Integer.parseInt(strArray[i]) + Integer.parseInt(strArray[i + 1]))
                    < (Integer.parseInt(strArray[i]) + Integer.parseInt(strArray[i + 2]))) {
                result = result + Integer.parseInt(strArray[i + 1]);
                System.out.println("rung 1 :" + Integer.parseInt(strArray[i + 1]));
            } else {
                result = result + Integer.parseInt(strArray[i + 2]);
                System.out.println("rung 2 :" + Integer.parseInt(strArray[i + 2]));
                i++;
            }
        }
        if (strArray.length % 2 == 0) {
            result = result + Integer.parseInt(strArray[strArray.length - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        ShortWayLadder shortWayLadder = new ShortWayLadder();
        System.out.println("Result: " + shortWayLadder.calcShortWayLadder("1 10 100 1 10 15 10 "));
    }
}
