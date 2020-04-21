package com.exp.patterns.prototype;

public class CloneFactory {
	
	public Animal getClone(Animal sample) {
		
		return sample.makeCopy();
		
	}

}
