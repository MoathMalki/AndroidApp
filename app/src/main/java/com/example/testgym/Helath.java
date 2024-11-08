package com.example.testgym;


public class Helath {

    private String proplem;

    public String getErrorMessage() {

        return proplem;
    }

    public double calculteBMI(double heighCm, double weighKg) {

        double index = -1;

        if (heighCm <= 0 && weighKg <= 0) {

            proplem = "Heigh and Weigh cant be zero or less ";

        } else {

            index = weighKg / ((heighCm / 100) * (heighCm / 100));
        }
        return index;

    }

    public String determineCatagory(double index) {

        String Catagory = "";

        if (index < 16) {

            Catagory = "Severe Thinness, So You should do muscle-building exercises ";

        } else if (index >= 16 && index < 17) {

            Catagory = "Moderate Thinness, So You should do muscle-building exercises ";


        } else if (index >= 17 && index < 18.5) {

            Catagory = " Mild Thinness, So You should do muscle-building exercises ";

        } else if (index >= 18.5 && index < 25) {

            Catagory = " Normal, So You should do muscle-building exercises ";
        }else if (index >= 25 && index < 30) {

            Catagory = " Over Weight, So You should do weight loss exercises  ";

        }else if (index >= 30 && index < 35) {

            Catagory = " Obese 1 , So You should do weight loss exercises ";

        }else if (index >= 35 && index <40) {

            Catagory = " Obese 2 ,So You should do weight loss exercises  ";


        } else if (index >= 40 ) {
            Catagory = "Obese 3 , So You should do weight loss exercises ";
        }
            return Catagory;

    }

}
