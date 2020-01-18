package com;

public class Student {
	//encapsul the data member. 
	 private int rollno;
	    private String name;
	    private String address;

	    public void setroll(int rollno){

	        this.rollno=rollno; 
	    }

	    public int getroll(){

	        return this.rollno;
	    }
	    
	    public void setname(String name){

	        this.name=name;
	    }

	    public String getname(){

	        return this.name;
	    }
	    public void setaddress(String address){
	        this.address=address;
	    }
	    public String getAddress(){
	        return this.address;
	    }


}
