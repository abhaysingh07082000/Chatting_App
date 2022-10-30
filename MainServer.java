/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverr;

/**
 *
 * @author Abhay singh
 */
public class MainServer
{
    public static void main(String[] args) {
        Server s=new Server();//invoke all the things from constructors GUI part
        s.waitingForClient();//waiting for client
        //s.getIpAddress();
        s.setIoStreams();//messages tranfers
    }
}
