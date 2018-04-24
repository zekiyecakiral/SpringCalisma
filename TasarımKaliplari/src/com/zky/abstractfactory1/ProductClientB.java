package com.zky.abstractfactory1;
public final class ProductClientB
{
       public ProductClientB()
       {
       }

       public void doSomeClientBJob()
       {
             IProduct product = new ProductFactory().makeProduct();

             System.out.println("Product Name -> "+product.getProductName());

             System.out.println("Product Serial Number -> "+
                                 product.getProductSerialNumber());
       }
}