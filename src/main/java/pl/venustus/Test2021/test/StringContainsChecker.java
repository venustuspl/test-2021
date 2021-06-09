package pl.venustus.Test2021.test;

import org.springframework.stereotype.Service;

@Service
public class StringContainsChecker {
    public boolean checkContainString(String textA, String textB){
        Integer position = 0;
        Integer loop = 0;
        for(int i = 0; i < textA.length(); i++){
            for(int j = position; j < textB.length(); j++){
                if (textB.charAt(j) == textA.charAt(i)){
                    position = j;
                    loop++;
                    break;
                }
            }
        }
        if (loop == textA.length()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StringContainsChecker stringContainsChecker = new StringContainsChecker();
        System.out.println(stringContainsChecker.checkContainString("abc", "ajlkblcjl"));
    }
}
