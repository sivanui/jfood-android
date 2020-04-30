package com.example.jfood_android;

public class Food {

    private int id;
    private String name;
    private int price;
    private String category;
    private Seller seller;

    public Food(int id, String name, int price, String category, Seller seller)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.category=category;
        this.seller=seller;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public String getCategory()
    {
        return category;
    }


    public Seller getSeller()
    {
        return seller;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setPrice(int price)
    {
        this.price=price;
    }

    public void setCategory(String category)
    {
        this.category=category;
    }


    public void setSeller(Seller seller)
    {
        this.seller=seller;
    }

    public String toString()
    {
        return "= Item ===================================" +
                "\nItem ID       : " +  getId() +
                "\nItem Name     : " + getName() +
                "\nItem Price    : " + getPrice() +
                "\nItem Category : " + getCategory() +
                "\nSeller      : " + getSeller().getName() +
                "\n==========================================";
    }
}
