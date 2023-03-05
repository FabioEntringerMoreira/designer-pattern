package com.company.strtucturals.decorator.multDecorators;

import com.company.strtucturals.decorator.multDecorators.formatterInterface.AddressFormatter;

public abstract class AddressFormatterDecorator implements AddressFormatter {

    AddressFormatter addressFormatter;

    public AddressFormatterDecorator(AddressFormatter addressFormatter){
        this.addressFormatter = addressFormatter;
    }
}
