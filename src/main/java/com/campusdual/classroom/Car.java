package com.campusdual.classroom;

    public class Car {
        public String brand;
        public String model;
        public static final int MAX_SPEED = 120;
        public String fuel;
        public int speedometer = 0;
        public int tachometer = 0;
        public String gear = "N";
        public boolean reverse = false;
        public int wheelsAngle = 0;

        public Car(String brand, String model, String fuel) {}

        public Car() {}

        public void start() {
            if (this.tachometer == 0) {
                this.tachometer = 1000;
                System.out.println("Vehículo acendido");
            } else {
                System.out.println("O vehículo xa está acendido");
            }
        }

        public void stop() {
            if (this.speedometer == 0) {
                this.tachometer = 0;
                System.out.println("Vehículo apagado");
            } else {
                System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
            }
        }

        public boolean isTachometerEqualToZero(){
            if (tachometer == 0){
                return true;
            }else{
                return false;}
        }

        public boolean isTachometerGreaterThanZero(){
            if (tachometer > 0){
                return true;
            }else{
                return false;}

        }

        public void accelerate() {
            if (tachometer >= 1000 && speedometer < MAX_SPEED){
                speedometer += 30;
            }
        }

        public void brake() {
            if (tachometer >= 1000 && speedometer > 0){
                speedometer -= 15;
            }

        }

        public void turnAngleOfWheels(int angle) {
            if(angle > 45){
                this.wheelsAngle = 45;
            }else if(angle < -45){
                this.wheelsAngle = -45;
            }else{
                this.wheelsAngle = angle;
            }
        }

        public String showSteeringWheelDetail() { return "El ángulo es: " + wheelsAngle; }

        public boolean isReverse() {

            return false; }

        public void setReverse(boolean reverse) {
            if(speedometer==0 && reverse){
                this.reverse = reverse;
                gear = "R";
            }else {
               gear = "N";
            }
        }

        public void showDetails() {

        }

    }


