package com.exp.patterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream{

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		// TODO Auto-generated method stub
		 int s = super.read();
		 return (s == -1 ? s : Character.toLowerCase((char)s));
		
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		int result = super.read(b, off, len);
		for (int i = off; i < off+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
	

}
