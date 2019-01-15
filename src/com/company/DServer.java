package com.company;

import java.net.*;
import java.util.*;
import java.io.*;

public class DServer {
        private DatagramSocket socket;
        private DatagramPacket sendPacket;
        private DatagramPacket recievePacket;




}



























/*

    private DatagramSocket socket;
    private byte[] buffer = new byte[256];

    public DServer() {
        try {
            socket = new DatagramSocket(8000);
            DatagramPacket sendPack = new DatagramPacket(buffer, buffer.length);
            DatagramPacket recievePack = new DatagramPacket(buffer, buffer.length);

            while (true) {
                Arrays.fill(buffer, (byte) 0);
                socket.receive(recievePack);
                String data = new String(buffer);
                data.trim();
                System.out.println(data);
                double radius = Double.parseDouble(String.valueOf(data));
                double area = radius * radius * Math.PI;
                sendPack.setAddress(recievePack.getAddress());
                sendPack.setPort(recievePack.getPort());
                sendPack.setData(String.valueOf(area).getBytes());
                socket.send(sendPack);
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
 */