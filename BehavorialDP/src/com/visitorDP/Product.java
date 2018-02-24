package com.visitorDP;
public abstract class Product
{
  protected int price;

  public abstract void accept( ShoppingMallVisitor shoppingMallVisitor );
  
  public int getPrice()
  {
    return price;
  }
}