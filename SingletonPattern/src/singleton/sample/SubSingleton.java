/**
 *
 */
package singleton.sample;

/**
 * SubSingletonクラス
 *
 * 継承できないこと示すエラーがどのように検出されるのか確認する
 * @author rashell
 *
 */
public class SubSingleton extends Singleton {

	private final static SubSingleton SINGLE_OBJECT = new SubSingleton();

	public SubSingleton() {
		System.out.println("One instance created.");
	}

}
