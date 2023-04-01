/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.ejercicios.EJERCICIO_PRACTICO_GET_SET_TRABAJADORES;

/**
 *
 * @author carri
 */
public class Book {
    private  String title;
    private String author;
    private int pages;
    private float prices;

    public Book() {
    }

    public Book(String title, String author, int pages, float prices) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.prices = prices;
    }
   
  
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
     public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
     public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
    public void setPrices(float prices) {
        this.prices = prices;
    }

    public float getPrices() {
        return prices;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", pages=" + pages + ", prices=" + prices + '}';
    }

 
}
