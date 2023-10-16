package com.phuoc.demodatabinding;

public class MainViewModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainViewModel(String name) {
        this.name = name;
    }
}
