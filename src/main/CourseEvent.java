package main;

import java.util.Date;
import java.util.EventObject;

public class CourseEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Date MidtermDate;
	public CourseEvent(Date MidtermDate, Professor p) {
		super(p);
		this.MidtermDate = MidtermDate;
	}
	
	


}
