package exceptionhadling;

 public class CustomException {
	public static void print(int age) throws LicenseException {
		if (age > 18) {
			System.out.println("Elgible for licence");
		} else {
			throw new LicenseException("Not Elgible for license");
		}
	}

	public static void main(String[] args) {

		try {
			CustomException.print(10); 
		} catch (LicenseException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}