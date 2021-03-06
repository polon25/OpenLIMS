package openlims.client;

public class Item {
	
	private int ID=-1;
	private String name=null;
	private int count=-1;
	private String note=null;
	
	public Item() {
		
	}
	
	public Item(int ID, String name, int count, String note) {
		this.setID(ID);
		this.setName(name);
		this.setCount(count);
		this.setNote(note);
	}

	//Getters and setters
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
