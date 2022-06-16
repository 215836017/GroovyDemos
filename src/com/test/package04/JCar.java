package com.test.package04;

public class JCar {

    private int miles;
    private final int year;

    public JCar(int theYear) {
        this.year = theYear;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        JCar car = new JCar(2022);
        System.out.println("Year: " + car.getYear());
        System.out.println("Miles: " + car.getMiles());
        car.setMiles(200);
        System.out.println("Miles: " + car.getMiles());
    }
}
