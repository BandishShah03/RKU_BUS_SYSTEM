package com.example.praticeapp.Models;

public class RecyclerViewModel {


    public int busicon;
    public String firstpoin, lastpoint, busnumber,bustime;

    public RecyclerViewModel(int busicon, String bustime, String busnumber, String firstpoin, String lastpoint) {
        this.busicon = busicon;
        this.bustime = bustime;
        this.busnumber = busnumber;
        this.firstpoin = firstpoin;
        this.lastpoint = lastpoint;


    }
}
