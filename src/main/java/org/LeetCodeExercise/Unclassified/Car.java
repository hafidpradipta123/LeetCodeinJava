package org.LeetCodeExercise.Unclassified;

public class Car {
    private String mesin;
    private Integer ban;
    private Integer bensin;

    public Car(String mesin, Integer ban) {
        this.mesin = mesin;
        this.ban = ban;
    }

    public static void isiBensin(Car target) {
        target.setBensin(10);
    }

    public void setBensin(Integer bensin) {
        this.bensin = bensin;
    }

    public void start() throws IllegalArgumentException {
        if (this.bensin <= 0) {
            throw new IllegalArgumentException("Bego lu, besin kosong ");
        }


    }

    public static void main(String[] arg) {
        Car toyota = new Car("v6", 4);

        Car.isiBensin(toyota);

        Integer bensin;
        try {
            toyota.start();
        } catch (IllegalArgumentException e) {
            System.exit(1);
        }
    }


}
