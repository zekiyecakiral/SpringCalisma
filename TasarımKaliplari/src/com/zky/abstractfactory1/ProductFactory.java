package com.zky.abstractfactory1;

public class ProductFactory
{
       /**seri numarasinin sequential artan bir numara oldugunu varsayalim*/
       private static int _serialNumber = 0;

       public IProduct makeProduct()
       {
             String serialNumber = generateSerialNumber();
             return new Product(serialNumber);
       }

       private String generateSerialNumber()
       {
             return (++_serialNumber)+"";
       }
}