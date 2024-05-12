package org.example.Semana01;
import java.util.Scanner;
public class TestVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many vehicles are you going to compare");
        int amount = sc.nextInt();
        sc.nextLine();
        Vehiculo[] vehiculos = new Vehiculo[amount];
        byte num = 0;
        float lowerPrice = 0;
        try{
            while (num < amount) {
                System.out.println("Write the make of the vehicle ");
                String make = sc.nextLine();
                System.out.println("Write the model of the vehicle");
                String model = sc.nextLine();
                System.out.println("Write the price of the vehicle");
                float price = sc.nextFloat();
                sc.nextLine();
                vehiculos[num] = new Vehiculo(make, model, price);
                num++;
            }
        }catch (Exception e){
            System.out.println("valor ingresado no es valido");
        }
        float price = vehiculos[0].getPrecio();
        for(int j = vehiculos.length-1; j>0; j--){
            float price2 = vehiculos[j].getPrecio();
            if(price > price2){
                if(lowerPrice != 0){
                    if(price2 < lowerPrice){
                        lowerPrice = price2;
                    }
                }else {
                    lowerPrice = price2;
                }
            }else {
                lowerPrice = price;
            }
        }

        System.out.println(lowerPrice);
    }
}
