package com.zorin.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("e:/java/Data1.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(12);
			dout.writeUTF("Zorin");
			dout.writeDouble(88866.33);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("File Created Successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
