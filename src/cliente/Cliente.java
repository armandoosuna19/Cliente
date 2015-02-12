/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente;

/**
 *
 * @author fimaz2014
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            VentanaCliente cliente = new VentanaCliente();
            cliente.setVisible(true);
            //cliente.conexion(5555,"192.10.11.14");
            cliente.conexion(5555,"192.10.10.114");
        }
    }

    

