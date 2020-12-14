package com.example.alfresco.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AlfrescoHelper {

    private final static String SEPARATOR = " ";
    private final static String FIZZ = "fizz";
    private final static String BUZZ = "buzz";
    private final static String ALFRESCO = "alfresco";

    Logger logger = Logger.getLogger(AlfrescoHelper.class.toString());

    public static List<String> rangeTransformer(List<Integer> input) {
        List<String> output = new ArrayList<>();
        for (Integer item : input) {
            StringBuilder itemResult = new StringBuilder(SEPARATOR);
            if (item.toString().contains("3")) {
                itemResult.append(ALFRESCO);
            } else {
                if (item % 3 == 0) {
                    itemResult.append(FIZZ);
                }
                if (item % 5 == 0) {
                    itemResult.append(BUZZ);
                }
                if (itemResult.length() < 2) {
                    itemResult.append(item);
                }
            }
            output.add(itemResult.toString());
        }
        return output;
    }
}
