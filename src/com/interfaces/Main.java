package com.interfaces;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.delete();
        cocheCRUD.findAll();
    }
}
