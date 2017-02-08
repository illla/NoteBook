package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSendDemo {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("UDP发送端启动。。。。。");
		DatagramSocket ds=new DatagramSocket();
		String str="UDP来了";
		byte[] buf=str.getBytes();
		DatagramPacket dp=new DatagramPacket(buf, buf.length, 
				InetAddress.getByName("192.168.1.215"), 10000);
		ds.send(dp);
		ds.close();
		
	}

}
