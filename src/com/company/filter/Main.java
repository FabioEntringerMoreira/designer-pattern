package com.company.filter;

import com.company.filter.enums.ColumnEnum;
import com.company.filter.enums.FilterEnum;
import com.company.filter.enums.Pessoa;
import com.company.filter.enums.SingleIntValue;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 25, "Rua das flores");
        Value value = new SingleIntValue();

        FilterComposite filterComposite = new FilterComposite(
                ColumnEnum.ADDRESS, FilterEnum.EQUAL, value);

        filter(filterComposite, pessoa);
    }

    public static void filter(FilterComposite filterComposite, Pessoa pessoa){
        List<Predicate<Pessoa>> predicates = new ArrayList<>();

        buildPessoaPredicates(filterComposite, predicates);
    }

    private static void buildPessoaPredicates(FilterComposite filterComposite,
            List<Predicate<Pessoa>> predicates) {


    }

}

