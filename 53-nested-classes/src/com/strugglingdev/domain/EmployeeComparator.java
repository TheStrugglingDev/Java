package com.strugglingdev;

import java.util.Comparator;

public class EmployeeComparator<T extends com.strugglingdev.Employee> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
