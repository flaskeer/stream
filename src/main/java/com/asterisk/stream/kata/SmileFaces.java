package com.asterisk.stream.kata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author donghao
 * @version 1.0
 *          2017/6/8.
 *          face must have   (: || ;)   && (  ) || D. )
 *          - || ~    does not have to
 */
public class SmileFaces {

    /**
     * mdzz  写的真垃圾
     *
     * @param arr
     * @return
     */
    public static int countSmileys(List<String> arr) {
        List<String> results = new ArrayList<>();
        List<String> eyes = new ArrayList<>();
        List<String> mouths = new ArrayList<>();
        List<String> noses = new ArrayList<>();
        eyes.add(":");
        eyes.add(";");
        mouths.add(")");
        mouths.add("D");
        noses.add("-");
        noses.add("~");
        for (String eye : eyes) {
            for (String mouth : mouths) {
                results.add(eye + mouth);
                for (String nose : noses) {
                    results.add(eye + nose + mouth);
                }
            }
        }
        return Math.toIntExact(arr.stream()
                .filter(results::contains)
                .count());
    }


    public static int countSmileys2(List<String> arr) {
        return (int) arr.stream().filter(face -> face.matches("[:;][-~]?[)D]")).count();
    }


}
