package com.springlearn.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpAnno {
    @Autowired // -------Properties
    @Qualifier("addressAnno2")
    private AddressAnno addressAnno;

    // @Autowired // -------Constructor
    public EmpAnno(AddressAnno addressAnno) {
        this.addressAnno = addressAnno;
        System.out.println("Constructor Injection");
    }

    public EmpAnno() {
    }

    public AddressAnno getAddressAnno() {
        return addressAnno;
    }

    // @Autowired // -------Setter Injection
    public void setAddressAnno(AddressAnno addressAnno) {
        System.out.println("Setter Injection");
        this.addressAnno = addressAnno;
    }

    @Override
    public String toString() {
        return "EmpAnno [addressAnno=" + addressAnno + "]";
    }
}
