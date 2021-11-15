package oops;


public class pencil {

	public static void main(String[] args) {
		System.out.println("hello");
int a=0;
if (a==0) { 
	System.out.println("a is zero!");
	
	
	marker m=new marker();
	System.out.println(m.color);
	System.out.println(m.point);
	System.out.println(m.type);
	System.out.println(m.clicked);
	m.click();
	System.out.println(m.clicked);
	
	
	headphone hp=new headphone();
	System.out.println(hp.charge);
	System.out.println(hp.controls);
	System.out.println(hp.color);
	System.out.println(hp.power);
	System.out.println(hp.volume);
	hp.poweron();
	hp.volumedown();
	System.out.println(hp.power);
	System.out.println(hp.volume);
	
	
	 Car ES = new Car("Hyundai", "blue", 2021, "Elantra", "Sedan");
	    ES.carDetails();
	    
	    
	    pig p=new pig();
	    p.animalsound();
	    p.sleep();
	    
	    Animals myAnimal = new Animals();
	    Animals myPigeon = new Pigeon();  
	    Animals mycrow = new crow();  
	    myAnimal.birdSound();
	    myPigeon.birdSound();
	    mycrow.birdSound();
	    
	    
	    
	    encapsulation obj = new encapsulation();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpid(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee id: " + obj.getEmpempid());
        System.out.println("Employee Age: " + obj.getEmpAge());
	}
	}

}
