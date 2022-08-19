package firstweb;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		BeanFactory b = new ClassPathXmlApplicationContext("sample/spring-servlet.xml");
		StudentDao s = (StudentDao) b.getBean("dao");
		Student st = new Student();
		st.setId(1);
		st.setName("huy");
		st.setSex("male");
		st.setAddress("Phu YEn");
		for(Student s1 : s.getAll()) {
			System.out.println(s1.toString());
		}
	}
}
