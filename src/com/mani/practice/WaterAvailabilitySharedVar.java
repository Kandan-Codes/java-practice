package com.mani.practice;

public class WaterAvailabilitySharedVar {
    private static Integer waterTank1CapacityInLitres = 500, waterTank2CapacityInLitres = 500;
    public static void main(String[] args) throws InterruptedException {
        CarWashThread carWashThread = new CarWashThread();
        WateringTreeThread wateringTreeThread = new WateringTreeThread();
        carWashThread.start();
        wateringTreeThread.start();

        carWashThread.join();
        wateringTreeThread.join();

        if(waterTank1CapacityInLitres == 0){
            System.out.println("Tank 1 is empty");
        }
        else {
            System.out.println("Tank 1 is not empty yet "+waterTank1CapacityInLitres);
        }

        if(waterTank2CapacityInLitres == 0){
            System.out.println("Tank 2 is empty");
        }
        else {
            System.out.println("Tank 2 is not empty yet "+waterTank2CapacityInLitres);
        }
    }

    static class CarWashThread extends Thread{
        @Override
        public void run(){
            int litrePerUsage = 50;
            for(int i=0;i<5000;i++) {
                if (waterTank1CapacityInLitres >= waterTank2CapacityInLitres) {
                    waterTank1CapacityInLitres -= litrePerUsage;
                } else {
                    waterTank2CapacityInLitres -= litrePerUsage;
                }
            }
        }
    }

    static class WateringTreeThread extends Thread {
        @Override
        public void run() {
            int litrePerUsage = 10;
            for(int i=0;i<5000;i++) {
                if (waterTank1CapacityInLitres >= waterTank2CapacityInLitres) {
                    waterTank1CapacityInLitres -= litrePerUsage;
                } else {
                    waterTank2CapacityInLitres -= litrePerUsage;
                }

            }
        }
    }

    static class MotorThread extends Thread {
        @Override
        public void run() {
            int litrePerUsage = 10;
            for(int i=0;i<waterTank1CapacityInLitres;i++) {
                if (waterTank1CapacityInLitres >= waterTank2CapacityInLitres) {
                    waterTank1CapacityInLitres -= litrePerUsage;
                } else {
                    waterTank2CapacityInLitres -= litrePerUsage;
                }
            }
        }
    }
}