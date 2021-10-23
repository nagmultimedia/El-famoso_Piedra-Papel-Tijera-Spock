package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static int puntajeJug1 = 0;
    public static int puntajeJug2 = 0;

    public static void main(String[] args) {

        String jugadaJug1;
        String jugadaJug2;

        System.out.println("Por favor ingrese el nombre del jugador 1:");
        String nomJug1= input.nextLine();
        System.out.println("Por favor ingrese el nombre del jugador 2:");
        String nomJug2= input.nextLine();

        while (true){

            System.out.println(nomJug1+" por favor ingrese su jugada, pa para papel, pi para piedra, ti para tijera o sp para Spock:");
            jugadaJug1 = input.nextLine();
            if (jugadaJug1.contentEquals("*")) {
                break;
            } else {
                while( !jugadaJug1.equals("pa")  && !jugadaJug1.equals("pi") && !jugadaJug1.equals("ti") && !jugadaJug1.equals("sp")) {
                    System.out.println(nomJug1 + " por favor ingrese una jugada válida, pa para papel, pi para piedra, ti para tijera o sp para Spock:");
                    jugadaJug1 = input.nextLine();
                }
            }

            System.out.println(nomJug2+" por favor ingrese su jugada, pa para papel, pi para piedra, ti para tijera o sp para Spock:");
            jugadaJug2 = input.nextLine();
            if (jugadaJug2.contentEquals("*")) {
                break;
            } else {
                while( !jugadaJug2.equals("pa")  && !jugadaJug2.equals("pi") && !jugadaJug2.equals("ti") && !jugadaJug2.equals("sp")) {
                    System.out.println(nomJug2 + " por favor ingrese una jugada válida, pa para papel, pi para piedra, ti para tijera o sp para Spock:");
                    jugadaJug2 = input.nextLine();
                }
            }

            cualGana(jugadaJug1,jugadaJug2);
        }

        System.out.println("Puntaje de "+nomJug1 +" : "+puntajeJug1 + " | Puntaje de "+nomJug2 +" : "+puntajeJug2);

    }

    public static void cualGana (String res1, String res2) {
        if (res1.equals("pa") && res2.equals("ti")){
            puntajeJug2++;
        } else if (res1.equals("ti") && res2.equals("pi")){
            puntajeJug2++;
        } else if (res1.equals("pi") && res2.equals("pa")){
            puntajeJug2++;
        } else if (res1.equals("ti") && res2.equals("sp")){
        puntajeJug2++;
        } else if (res1.equals("pi") && res2.equals("sp")){
            puntajeJug2++;
        } else if (res1.equals("sp") && res2.equals("pa")){
            puntajeJug2++;
        } else if (res1.equals(res2)){
            /* no pasa nada, son iguales */
        } else
            puntajeJug1++;
    }

}
