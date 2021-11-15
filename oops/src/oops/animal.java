package oops;

public abstract class animal {
public abstract void animalsound();
public void sleep() {
	System.out.println("zzz");
}
}
class pig extends animal{
	public void animalsound() {
		System.out.println("The pig says:wee wee");
	}
}