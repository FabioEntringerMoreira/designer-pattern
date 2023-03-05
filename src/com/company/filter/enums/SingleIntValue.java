package com.company.filter.enums;

import com.company.filter.Value;

import java.util.Collections;
import java.util.List;

public class SingleIntValue implements Value {

    @Override
    public List<Object> value() {
        return Collections.singletonList(1);
    }
}
