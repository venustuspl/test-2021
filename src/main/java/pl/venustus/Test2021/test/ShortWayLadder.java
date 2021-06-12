package pl.venustus.Test2021.test;

import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ShortWayLadder {
    public Integer calcShortWayLadder(String text) {
        final var logger = Logger.getLogger(getClass().getName());
        String[] strArray = text.split(" ");
        Integer result = Integer.parseInt(strArray[0]);
        int i;
        int rung1;
        int rung2;
        for (i = 0; i < (strArray.length - 2); i++) {
            rung1 = Integer.parseInt(strArray[i + 1]);
            rung2 = Integer.parseInt(strArray[i + 2]);
            if ((Integer.parseInt(strArray[i]) + rung1)
                    < (Integer.parseInt(strArray[i]) + rung2)) {
                result = result + rung1;
                logger.log(Level.INFO, "rung 1 : {0} ", rung1);
            } else {
                result = result + rung2;
                logger.log(Level.INFO, "rung 2 : {0}", rung2);
                i++;
            }
        }
        if (strArray.length % 2 == 0) {
            result = result + Integer.parseInt(strArray[strArray.length - 1]);
        }
        return result;
    }
}
