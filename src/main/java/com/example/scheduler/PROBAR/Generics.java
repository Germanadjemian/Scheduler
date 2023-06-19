package com.example.scheduler.PROBAR;

import java.util.ArrayList;
import java.util.List;

public class Generics<T>
{
    public static void main(String[] args)
    {
        List lista= new ArrayList<>();
        lista.add("Holaaaaaaaaaaaaaaaaaaaaaaa");
        lista.add(1);
        String ejemplo= (String) lista.get(0);
        System.out.println(ejemplo);
        Integer ejemplo2= (Integer) lista.get(1);
        System.out.println(ejemplo2);
        System.out.println("----------------------------------------------------------------------");
        for(Object o:lista){
            System.out.println(o);
        }
    }
}
