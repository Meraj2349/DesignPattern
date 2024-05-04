// Double Checked Locking based  Singleton design pattern
package designPatternExample;
class  EfficientSingleton {
	private static volatile  EfficientSingleton obj = null;
	private  EfficientSingleton() {}

	public static  EfficientSingleton getInstance()
	{
		if (obj == null) {
			// To make thread safe
			synchronized ( EfficientSingleton.class)
			{
				// check again as multiple threads
				// can reach above step
				if (obj == null)
					obj = new  EfficientSingleton();
			}
		}
		return obj;
	}
}
