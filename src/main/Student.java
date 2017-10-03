package main;

public class Student implements CourseListener {

	public void midtermAnnouncemnet(CourseEvent e) {
		Professor p = (Professor)e.getSource();
		
		System.out.println("The midterm is on "+ e.MidtermDate.toString()+"? Why is prof "+ p.name +" so LAAAME?");
	}
}
