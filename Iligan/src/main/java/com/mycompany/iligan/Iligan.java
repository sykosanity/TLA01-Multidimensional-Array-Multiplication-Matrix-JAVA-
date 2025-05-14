/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.iligan;

/**
 *
 * @author Student's Account
 */
public class Iligan {

    
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[][] mutliplicationMatrix = new int[11][11];

        for (int z = 1; z < 11; z++) {
            for (int i = 1; i < 11; i++) {
                mutliplicationMatrix[z][i] = z * i;
            }
        }
        
        for (int z = 1; z < 11; z++) {
            for (int i = 1; i < 11; i++) {

                System.out.printf("%4d", mutliplicationMatrix[z][i]);
            }
            System.out.println("");
        }
    }
}












