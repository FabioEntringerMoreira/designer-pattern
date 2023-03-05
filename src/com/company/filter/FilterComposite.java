package com.company.filter;

import com.company.filter.enums.ColumnEnum;
import com.company.filter.enums.FilterEnum;

public class FilterComposite {

    private final ColumnEnum column;

    private final FilterEnum filter;

    private final Value value;


    public FilterComposite(ColumnEnum column, FilterEnum filter, Value value) {
        this.column = column;
        this.filter = filter;
        this.value = value;
    }
}
