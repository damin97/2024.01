package page482;

class DprLive {}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = DprLive.class;
		
		String str = clazz.getResource("photo2.jpg").getPath();
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		
		//2
		Class clazz2 = Class.forName("page482.DprLive");
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		
		//3
		DprLive dprlive = new DprLive();
		Class clazz3 = dprlive.getClass();
		System.out.println(clazz3.getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackageName());
	}

}
