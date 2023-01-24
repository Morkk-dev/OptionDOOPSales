package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SalesPerson[] salesPeople = new SalesPerson[3];
        salesPeople[0] = new SalesPerson("100");
        salesPeople[1] = new SalesPerson("101");
        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100", 300.0, 10));
        salesPeople[0].setSalesHistory(new Sales("A200", 1000.0, 2));
        salesPeople[1].setSalesHistory(new Sales("A300", 2550.40, 10));

        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());

        System.out.println(highest(salesPeople));



    }

    static String highest(SalesPerson[] sp){
        String bestId = "";
        double highVal = 0.0;
        for(SalesPerson s: sp){
            if(s.calcTotalSales() > highVal){
                highVal = s.calcTotalSales();
                bestId = s.getId();
            }
        }
        return bestId;
    }

    static void addSales(Sales s, String id, SalesPerson[] sp){
        for (SalesPerson p : sp){
            if(p.getId().equals(id)){
                p.setSalesHistory(s);
            }
        }
    }

}
