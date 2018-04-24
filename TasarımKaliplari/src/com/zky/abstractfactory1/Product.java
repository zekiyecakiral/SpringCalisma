package com.zky.abstractfactory1;

import java.util.Date;

public class Product implements IProduct
{     
       private final String _serialNumber;
       private Date _productDate;

       public Product(String serialNumber)
       {
             _serialNumber = serialNumber;
             _productDate = new Date();
       }

       @Override
       public String getProductName()
       {
             return "i am product";
       }

       @Override
       public String getProductSerialNumber()
       {
             return _serialNumber;
       }

       @Override
       public Date getProductionDate()
       {
             return _productDate;
       }     
}