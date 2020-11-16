package com.dijesh.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLangauges {
    private Properties countryAndLangs;

    public Properties getCountryAndLangs() {
        return countryAndLangs;
    }

    public void setCountryAndLangs(Properties countryAndLangs) {
        this.countryAndLangs = countryAndLangs;
    }

    @Override
    public String toString() {
        return "CountriesAndLangauges{" +
                "countryAndLangs=" + countryAndLangs +
                '}';
    }
}
