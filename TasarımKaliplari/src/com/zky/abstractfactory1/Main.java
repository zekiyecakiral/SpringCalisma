package com.zky.abstractfactory1;

public final class Main
{
       public static void main(String[] args)
       {
             ProductClientA pcA = new ProductClientA();
             pcA.doSomeClientAJob();
         
             ProductClientB pcB = new ProductClientB();
             pcB.doSomeClientBJob();
       }
}