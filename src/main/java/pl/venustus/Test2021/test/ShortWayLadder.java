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
        for (i = 0; i < (strArray.length - 2); i++) {
            if ((Integer.parseInt(strArray[i]) + Integer.parseInt(strArray[i + 1]))
                    < (Integer.parseInt(strArray[i]) + Integer.parseInt(strArray[i + 2]))) {
                result = result + Integer.parseInt(strArray[i + 1]);
                logger.log(Level.INFO, "rung 1 :" + Integer.parseInt(strArray[i + 1]));
            } else {
                result = result + Integer.parseInt(strArray[i + 2]);
                logger.log(Level.INFO, "rung 2 :" + Integer.parseInt(strArray[i + 2]));
                i++;
            }
        }
        if (strArray.length % 2 == 0) {
            result = result + Integer.parseInt(strArray[strArray.length - 1]);
        }
        return result;
    }
}
