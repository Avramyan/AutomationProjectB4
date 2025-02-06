package io.loop.test.day08;

import io.loop.test.utilities.ConfigurationReader;

public class T00_test_config_reader {
    public static void main(String[] args) {
        System.out.println("ConfigurationReader.getProperties(\"browser\") = " + ConfigurationReader.getProperties("browser"));

    }
}
