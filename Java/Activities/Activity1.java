package activities;

public class Activity1 {
        public static void main(String[] args) {
            Car innova = new Car();
            innova.make = 2014;
            innova.color = "Black";
            innova.transmission = "Manual";

            innova.displayCharacterstics();
            innova.accelerate();
            innova.brake();
        }

    }

