package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "DigitalVideoDisc{" +
				"title='" + title + '\'' +
				", category='" + category + '\'' +
				", director='" + director + '\'' +
				", length=" + length +
				", cost=" + cost + "$" +
				'}';
	}

	public boolean search(String title) {
		if(title == null) {
			return false;
		}

		String []titleInputArr = title.replaceAll("\\s\\s+", " ").trim().split("\\s");
		String []titleObjectArr = this.title.split("\\s");
		boolean output = true;
		for(String str1 : titleInputArr) {
			int check = 0;
			for(String str2 : titleObjectArr) {

				if(str1.equalsIgnoreCase(str2)) {
					check = 1;
				}
			}

			if(check == 0) {
				output = false;
			}
		}
		return output;
	}

}
