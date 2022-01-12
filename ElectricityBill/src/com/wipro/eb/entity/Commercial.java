package com.wipro.eb.entity;

public class Commercial extends Connection{

	public Commercial(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		
	}
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
			if(ammount>=10000) {
				ammount=ammount+ammount*0.09f;
			}
			if(ammount>=5000) {
				ammount=ammount+ammount*0.06f;
			
			}
			else {
				ammount=ammount+ammount*0.02f;
				 }
			return ammount;
			}		
				
}
