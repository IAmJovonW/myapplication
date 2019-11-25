package com.example.myapplication;

public class Cart {
    private int Id;
    private String Status;
    private int Size;
    private String Barcode;


    public Cart(){

    }

    public Cart(int id, String status, int size, String barcode){
        this.Id = id;
        this.Status = status;
        this.Size = size;
        this.Barcode = barcode;
    }

    public int getId() {
        return Id;
    }

    public String getStatus() {
        return Status;
    }

    public int getSize() {
        return Size;
    }

    public String getBarcode() {
        return Barcode;
    }
}