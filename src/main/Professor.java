package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor {
	String name;
	List<CourseListener> listeners;
	
	public Professor(String name) {
		this.name =name;
		listeners = new ArrayList<>();
	}
	
	public void addListener(CourseListener c) {
		listeners.add(c);
	}
	
	public void removeListener(CourseListener c) {
		listeners.remove(c);
	}
	
	public void setMidterm(Date date) {
		//the prof creates the event and sends it
		CourseEvent e = new CourseEvent(date, this);
		for (CourseListener cl: listeners) {
			cl.midtermAnnouncemnet(e);
		}
	}
	
	public static void main(String [] args) {
		Professor p = new Professor("Johm");
		Student s = new Student();
		Student s2 = new Student();
		
		p.addListener(s);
		p.addListener(s2);
		
		p.setMidterm(new Date());
	}

}
