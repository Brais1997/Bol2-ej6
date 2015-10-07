/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog6;

import java.util.Scanner;

/**
 *
 * @author balvarezescudero
 */
public class Prog6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tarifa ,pagado;
        System.out.print("Tarifa=");
        Scanner obx= new Scanner(System.in);
        tarifa = obx.nextFloat();
        System.out.print("Pagado=");
        pagado = obx.nextFloat();
        System.out.print("Desconto="+ ((tarifa-pagado)*100)/tarifa +"%");
    }
    
}
