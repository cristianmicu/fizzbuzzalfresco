package com.example.alfresco.helper;

import com.example.alfresco.model.SpecialWords;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlfrescoHelper {

    private final static String SEPARATOR = " ";

    private AlfrescoHelper() {
    }

    public static String rangeTransformer(String input) {
        StringBuilder result = new StringBuilder();
        for (Integer item : stringToIntegerList(input)) {
            boolean isNumber = true;
            if (item.toString().contains("3")) {
                result.append(SEPARATOR).append(SpecialWords.ALFRESCO.getValue());
            } else {
                if (item % 3 == 0) {
                    result.append(SEPARATOR).append(SpecialWords.FIZZ.getValue());
                    isNumber = false;
                }
                if (item % 5 == 0) {
                    if (isNumber) {
                        result.append(SEPARATOR);
                    }
                    result.append(SpecialWords.BUZZ.getValue());
                    isNumber = false;
                }
                if (isNumber) {
                    result.append(SEPARATOR).append(item);
                }
            }
        }
        return result.toString().trim();
    }

    public static List<Integer> stringToIntegerList(String inputString) {
        return Arrays.stream(inputString.split(","))
                .map(item -> Integer.parseInt(item.trim().toLowerCase()))
                .collect(Collectors.toList());
    }

    public static String createCompleteReport(String textTransformed) {
        StringBuilder completeReportSB = new StringBuilder();
        for (SpecialWords item : SpecialWords.values()) {
            completeReportSB.append(" ")
                    .append(item.getValue())
                    .append(": ")
                    .append(item.getOccurrance(textTransformed));
        }

        return completeReportSB.toString().trim();
    }
}
