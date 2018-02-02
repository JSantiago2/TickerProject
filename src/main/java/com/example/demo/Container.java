package com.example.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Container {


    private Ticker ticker;
    private long timestamp;
    private boolean success;
    private String error;

    public Container() {
    }

    public Ticker getTicker() {
        return ticker;
    }


    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public long getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Container{" +
                "ticker=" + ticker +
                ", timestamp=" + timestamp +
                ", success=" + success +
                ", error='" + error + '\'' +
                '}';
    }
}
