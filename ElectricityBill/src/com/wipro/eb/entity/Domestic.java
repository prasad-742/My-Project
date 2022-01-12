package com.wipro.eb.entity;

public class Domestic extends Connection{

	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		
	}

	@Override
	public float computeBill() {
		float ammount=0;
		int consume= currentReading-previousReading;
		if(consume<=50) {
			ammount=consume*slabs[0];
		}
		if(consume<=100) {
			ammount=ammount+50*slabs[0]+consume-50*slabs[1];
		}
		else {
			ammount=ammount+50*slabs[0]+consume-50*slabs[1]+consume-100*slabs[2];
		}
			
		return ammount;
	}

}
