 
 import java.util.*;
 public class GenericOld
 { 
	String object;
	private object t;
	public object get()
	{
	return t;
	}
	public void set(object t)
	{
	 this.t=t;
	}
	public static void main(String args[])
	{
	GenericOld type= new GenericOld();
	type.set("Shrii");
	String str=(String)type.get();
	}
}

