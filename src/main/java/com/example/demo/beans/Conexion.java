package com.example.demo.beans;

public class Conexion {
    String db;
    String url;

    Conexion() {
        this.db = "mysql";
        this.url = "localhost";
    }

    Conexion(String db, String url) {
        this.db = db;
        this.url = url;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
