package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String versionStr = System.getProperty("java.specification.version");
        Double versionDub = Double.parseDouble(versionStr);
        System.out.println(versionStr);
        return versionDub;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    getVersion();
    }
}
