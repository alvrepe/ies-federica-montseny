package Tarea_Vehiculo;

import java.util.Scanner;

public class MainVehicles {

    static Scanner scanner = new Scanner(System.in);

    static Vehiculo[] listVehicles(){
        System.out.println("Introduce el tamaño de la lista");
        Vehiculo[] listvehicles = new Vehiculo[scanner.nextInt()];
        for(int i = 0; i < listvehicles.length; i++){
            listvehicles[i] = vehicleData();
        }

        return listvehicles;
    }

    static Vehiculo vehicleData() {
        System.out.println("Introduce un tipo de vehiculo");
        String type = scanner.next();
        System.out.println("Introduce una velocidad");
        double speed = scanner.nextDouble();
        System.out.println("Intrduce un color");
        String color = scanner.next();
        System.out.println("Introduce una matricula");
        String plate = scanner.next();

        Vehiculo vehicle = new Vehiculo(type, speed, color, plate);
        return vehicle;
    }

    public static void main(String[] args) {
        Vehiculo[] vehicles = listVehicles();
       for (int i = 0; i < vehicles.length; i++){
           Vehiculo vehicle = vehicles[i];
           System.out.println("Las matriculas son " + vehicle.getMatricula());
       }

    }
}
