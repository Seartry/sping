package com.pactera.util;

public class Result<T>{
    private String status;
    private String msg;
    private T data;
    private String throwable;

    public Result(){

    }

    public Result(String status,String msg){
        this.status = status;
        this.msg = msg;
    }

    public Result(String status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(String status, String msg, T data, String throwable) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.throwable = throwable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getThrowable() {
        return throwable;
    }

    public void setThrowable(String throwable) {
        this.throwable = throwable;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", throwable='" + throwable + '\'' +
                '}';
    }
}
