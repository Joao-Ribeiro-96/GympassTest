package gympass.model;

import java.util.Date;

public class Driver {
	private String name;
	private int id;
	private Date laps[];

	
	public Driver(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLaps(Date lapTime, int lapNum) {
		laps[lapNum-1] = lapTime;
	}
	
	public Date getLaps(int lapNum) {
		return laps[lapNum-1];
	}
	

}
