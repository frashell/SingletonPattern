/**
 *
 */
package singleton.sample;

/**
 * @author rashell
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		Integer iObj1 = new Integer(1);
		Integer iObj2 = new Integer(1);

		if (iObj1 == iObj2) {
			System.out.println("A:iObj1 and iObj2 are same instance.");
		} else {
			System.out.println("A:iObj1 and iObj2 are different instance.");
		}

		if (iObj1.equals(iObj2)) {
			System.out.println("B:iObj1 and iObj2 are same instance.");
		} else {
			System.out.println("B:iObj1 and iObj2 are different instance.");
		}


		Singleton singleObj1 = Singleton.getInstance();
		Singleton singleObj2 = Singleton.getInstance();

		if (singleObj1 == singleObj2) {
			System.out.println("A:singleObj1 and singleObj2 are same instance.");
		} else {
			System.out.println("A:singleObj1 and singleObj2 are different instance.");
		}

		if (singleObj1.equals(singleObj2)) {
			System.out.println("B:singleObj1 and singleObj2 are same instance.");
		} else {
			System.out.println("B:singleObj1 and singleObj2 are different instance.");
		}
		System.out.println("End.");
	}

}
