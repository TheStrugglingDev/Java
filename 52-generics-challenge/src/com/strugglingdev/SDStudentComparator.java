package com.strugglingdev;

import java.util.Comparator;

public class SDStudentComparator implements Comparator<SDStudent> {
    @Override
    public int compare(SDStudent o1, SDStudent o2) {
        return (int) (o1.getPercentComplete() - o2.getPercentComplete());
    }
}
