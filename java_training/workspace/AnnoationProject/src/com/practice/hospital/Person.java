package com.practice.hospital;

public class Person implements BPListener{

	public void bpAbove140(int bp) {
        System.out.println("ALERT! BP at "+bp);
  }

}
