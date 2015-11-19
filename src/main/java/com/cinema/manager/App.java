package com.cinema.manager;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cinema.manager.controller.dao.AuditoriumDao;
import com.cinema.manager.demo.Demo;
import com.cinema.manager.model.Auditorium;

/**
 * Main application. Runs all demos.
 *
 * @author Igor_Shingaryov
 *
 */
public class App {

	List<Demo>	demoList;

	public App(List<Demo> demoList) {
		super();
		this.demoList = demoList;
	}

	public List<Demo> getDemoList() {
		return demoList;
	}

	public void setDemoList(List<Demo> demoList) {
		this.demoList = demoList;
	}

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");

		App application = (App) context.getBean("application");

		for (Demo demo : application.getDemoList()) {
			demo.execute();
		}

		// Test dao for database
		AuditoriumDao auditoriumDao = (AuditoriumDao) context.getBean("auditoriumDaoDBImpl");
		System.out.println(auditoriumDao.getAuditoriums());

		//auditoriumDao.create("Rocket", 400, "1 - 20");

		System.out.println(auditoriumDao.getAuditorium(5));
		auditoriumDao.delete(4);
		System.out.println(auditoriumDao.getAuditoriums());

		Auditorium auditorium = auditoriumDao.getAuditorium(5);
		auditorium.setName("Cinema");
		auditoriumDao.update(0, auditorium);
		System.out.println(auditoriumDao.getAuditoriums());

		context.close();
	}
}
