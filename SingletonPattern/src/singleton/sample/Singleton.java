/**
 *
 */
package singleton.sample;

/**
 * <p>
 * Singletonクラス
 * </p>
 * <ul>
 * <li>指定したクラスのインスタンスが絶対に1個しか存在しないことを保証したい
 * <li>インスタンスが1個しか存在しないことをプログラム上で表現したい
 * </ul>
 * 唯一無二の存在であるため、サブクラス（継承）ができないよう制限を設ける
 * @author frashell
 *
 */
public final class Singleton {
//public class Singleton {
	private final static Singleton UNIQUE_OBJECT = new Singleton();
	private Singleton() {
		System.out.println("One instance created.");
	}
	public final static Singleton getInstance() {
		return UNIQUE_OBJECT;
	}

}
