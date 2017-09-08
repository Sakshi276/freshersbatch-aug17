package com.practice.autocloseablepackage;

public class MyAutoCloseable implements AutoCloseable  {

	@Override
	public void close() throws Exception {
		
		System.out.println("Customized close moethod");
		
	}

}
