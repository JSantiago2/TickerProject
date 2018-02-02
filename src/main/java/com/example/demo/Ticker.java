package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker {

    private String base;
    private String target;
    private String price;
    private String volume;
    private String change;
    private List<Markets> markets;

    public Ticker(){
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget(){
        return target;
    }

    public void setTarget(String target){
        this.target = target;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public List<Markets> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Markets> markets) {
        this.markets = markets;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", change='" + change + '\'' +
                ", markets=" + markets +
                '}';
    }
}
