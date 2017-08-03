package com.demo.Class;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) throws Exception {
		Demo demo = new Demo();
		demo.filed();
	}
	
	/**
	 * 获取字节码三种方式
	 */
	@SuppressWarnings({ "rawtypes", "unused" })
	public void mothed(){
		/**
		 * 1、对象中创建后获取
		 */
		Person p = new Person();
		Class cla2 = p.getClass();
		
		/**
		 * 2、直接获取
		 */
		Class cla1 = Person.class;
		
		/**
		 * 3、根据路径加载对象，放射中使用频繁，加载未知对象。
		 */
		try {
			Class cla3 = Class.forName("com.demo.Class.Person");
			System.out.println(cla3.getTypeName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void filed() throws Exception{
		RefectPoint point = new RefectPoint();
		Class cla = point.getClass();
		Field[] fields = cla.getFields();
		
		for(Field field : fields){
			if(field.getType() == String.class){
				String oldStr = (String) field.get(point);
				String newStr = oldStr.replace("a", "b");
				field.set(point, newStr);
			}
		}
		System.out.println(point);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
