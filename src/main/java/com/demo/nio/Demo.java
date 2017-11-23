package com.demo.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream(new File("F:\\work\\fil\\qq.txt"));
			FileChannel channel = fis.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			channel.read(byteBuffer);
			channel.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
