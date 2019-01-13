import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


import clases.examples.A;

public class Start {
	public static String ucFirst(String str) {
		  if (str == null || str.isEmpty()) {
		    return str;            
		  } else {
		    return str.substring(0, 1).toUpperCase() + str.substring(1); 
		  }
		}
	
	public void backtrackingClass(Class a,Object o) throws ClassNotFoundException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {

	if ((!a.getPackage().getName().equals("java.lang")))
		for (Field f : a.getDeclaredFields()) {
				backtrackingClass(f.getType(),a.getMethod("get" + ucFirst(f.getName()), null).invoke(o));
				//System.out.println(f.getType().getDeclaredFields()[0].getType().getDeclaredFields()[0].getType());
				System.out.println("*******************************************************************************");
				System.out.println(f.getType());
				System.out.println("Valor : " + a.getMethod("get" + ucFirst(f.getName()), null).invoke(o));
				System.out.println(f.getName());
				
			}
		}

	public static void main(String[] args) {
		A a = new A();
		Start s = new Start();
		try {
			try {
				s.backtrackingClass(a.getClass(),a);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
