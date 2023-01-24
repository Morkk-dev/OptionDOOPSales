package com.company;

public class SalesPerson {

    private String id;
    private Sales[] salesHistory;
    private int count = 0;


    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[0];
    }

    public SalesPerson(String id, Sales[] salesHistory, int count) {
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setSalesHistory(Sales s){
        Sales[] temp = new Sales[salesHistory.length + 1];
        System.arraycopy(salesHistory, 0, temp, 0, salesHistory.length);
        temp[temp.length-1] = s;
        salesHistory = temp;
        count++;
    }

    public Sales getSalesHistory(int i){
        return salesHistory[i];
    }

    public double calcTotalSales(){
        double val = 0.0;
        for(Sales s : salesHistory){
            val += s.getValue() * s.getQuantity();
        }
        return val;
    }
}
