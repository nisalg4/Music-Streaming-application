/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author nisalgamage
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bill
 */

import java.util.*;
import java.io.*;
import java.net.*;

public class commModuleServer extends Thread {
    
    static final int byte_size = 9000;
    byte[] packetSize;
    DatagramSocket socket = null;
    int portNumber;
    Dispatcher serverDispatcher;
    boolean isListen = true;

    public commModuleServer(int portNum, Dispatcher dispatcher) {
        this.portNumber = portNum;
        this.serverDispatcher = dispatcher;
    }
    
    public void run() {
        try {
            socket = new DatagramSocket(portNumber);
            System.out.println("Server opened on port: " + portNumber);
            while (isListen) {
                packetSize = new byte[byte_size];
                DatagramPacket requestPacket = new DatagramPacket(packetSize, packetSize.length);
                socket.receive(requestPacket);
                String str=new String(requestPacket.getData(),0,requestPacket.getLength());
                System.out.println("Str"+str);
                System.out.println("Client packet received: " + str);
                Thread t = new PacketRequestHandler(socket, requestPacket, serverDispatcher);
                t.start();
            }
        }
        
        catch(NullPointerException e) 
        { System.out.print("NullPointerException Caught"); 
        e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}


class PacketRequestHandler extends Thread {
    private DatagramSocket socket;
    private DatagramPacket packet;
    public Dispatcher packetDispatcher;

    public PacketRequestHandler(DatagramSocket s, DatagramPacket p, Dispatcher dispatcher) {
        this.socket = s;
        this.packet = p;
        this.packetDispatcher = dispatcher;
    }

    public void run() {
        String requestPacket = new String(packet.getData(),0,packet.getLength());
        
        System.out.println("Server request string: " + requestPacket);
        String response = packetDispatcher.dispatch(requestPacket.trim());
        byte[] packetPayload = response.getBytes();
        DatagramPacket responsePacket = new DatagramPacket(packetPayload, packetPayload.length, packet.getAddress(), packet.getPort());
        try {
            socket.send(responsePacket);
            System.out.println(Arrays.toString(responsePacket.getData()));
            System.out.println("Server has sent response packet, thread terminating");
            this.interrupt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

