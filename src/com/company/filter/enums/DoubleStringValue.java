package com.company.filter.enums;

import com.company.filter.Value;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DoubleStringValue implements Value {

    @Override
    public List<Object> value() {
        return Arrays.asList("ASD", "ABC");
    }
}
