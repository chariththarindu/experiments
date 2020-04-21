package com.exp;

public enum Operation {

	
	ADD{
		public int eval(int x , int y) { return x+y;}
	},
	SUBTRACT {
		public int eval(int x , int y) { return x-y;}
	};
	
	public abstract int eval(int x, int y);
}

