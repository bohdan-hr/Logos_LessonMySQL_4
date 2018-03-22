package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.logos.orm.entity.Teacher;
import ua.logos.orm.entity.TeacherDetails;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		// Teacher teacher = new Teacher();
		// teacher.setLogin("teacher_login");
		// teacher.setPassword("teacher_password");
		// em.persist(teacher);

		// Teacher teacher = em.find(Teacher.class, 1);
		// System.out.println(teacher.getLogin() +" " +teacher.getPassword() );
		// teacher.setLogin("t_login_updete");

		// em.merge(teacher);
		
//		TeacherDetails teacherDetails = new TeacherDetails();
//		teacherDetails.setAge(25);
//		teacherDetails.setFirstName("Ivan");
//		teacherDetails.setLastName("dhtrhrth");
//		teacherDetails.setHobby("Sport");
//		em.persist(teacherDetails);
		
		Teacher teacher = new Teacher();
		teacher.setLogin("login");
		teacher.setPassword("password");
		teacher.setTeacherDetails(new TeacherDetails());
		em.persist(teacher);
		
		
		em.getTransaction().commit();

		em.close();
		factory.close();

	}
}
