package com.qac.corejava.oops.relations.HasA.IsA;

public class Active extends Bike{
	
	private byte noOftyer;
	private byte maxSpeed;
	
  public Active() {
	  System.out.println("invoiking MahindraThar constrcucotor");
	  
  }
  
  public byte getNoOfTyer() {
	  return noOftyer;
	  
  }
  
  public void setnoOftyer(byte noOftyer) {
	  this.noOftyer = noOftyer;
  }
    
  public byte getMaxSpeed() {
	  return maxSpeed;
  }
  public void setmaxSpeed(byte maxSpeed) {
	  this.maxSpeed = maxSpeed;
	  
  }
}
