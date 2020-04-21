package com.exp.hilti;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Needle {
	 public static int count(String needle, InputStream haystack) throws Exception {
		 
		 int n = haystack.available();
		 byte[] bytes = new byte[n];
		 haystack.read(bytes, 0, n);
		 String s = new String(bytes, StandardCharsets.UTF_8);
		 String[] arr = s.split("\\n");
		 int count = 0;
		 for(String x : arr) {
			 if(x.contains(needle)) {
				 count++;
			 }
		 }
		 return count;
		   //InputStreamReader isReader = new InputStreamReader(inputStream);
	      //Creating a BufferedReader object
	     // BufferedReader reader = new BufferedReader(haystack);
	     // StringBuffer sb = new StringBuffer();
	     // String str;
	     // while((str = reader.readLine())!= null){
	     //    sb.append(str);
	     // }
		/* throw new UnsupportedOperationException("Waiting to be implemented."); */
	    }
	    
	    public static void main(String[] args) throws Exception {
	        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";

	        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
	            System.out.println(Needle.count("there", inStream));
	        }
	    }
}
