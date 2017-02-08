package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.TreeSet;

public class UdpReceDemo {
	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket(10000);
		byte[] buf=new byte[1024];
		DatagramPacket dp=new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		String ip=dp.getAddress().getHostAddress();
		int port=dp.getPort();
		String str=new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+"  "+port+"  "+str);

	}

}
