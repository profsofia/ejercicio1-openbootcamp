package com.interfaces;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public String save() {
     return "Save";
    }

    @Override
    public String findAll() {
        return "Find All";
    }

    @Override
    public String delete() {
        return "Delete";
    }
}
