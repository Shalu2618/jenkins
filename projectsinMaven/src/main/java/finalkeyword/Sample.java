package finalkeyword;

public final class Sample{
	final int A=10;         // variable name(constant name) should be capital because of using final keyword
 final int B;                //blank finaL variable or uninitilized final variable so  the final variable have no values.
 public Sample()
 {
		 B=5;         // blank final variable should be initilised inside the constructor only
 }
 public final void print()
 {
	 System.out.println("final method");
 }
}

