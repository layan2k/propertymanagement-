package com.mycompany.propertymanagement.controller;

public class CalculatorMain {
    public  static void main(String[] args) {
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(1.5, 2.5);
        Double resultSub = cc.sub(1.0, 2.0);
        System.out.println(result);
        System.out.println(resultSub);
    }

}
