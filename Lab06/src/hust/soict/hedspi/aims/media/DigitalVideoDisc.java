package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String id, String title) {
		super(id, title);

	}

	public DigitalVideoDisc(String id, String title, String category, float cost) {
		super(id, title, category, cost);


	}
	public DigitalVideoDisc(String id, String title, String category, String director, float cost) {
		super(id, title, category, cost);


		this.director = director;

	}
	public DigitalVideoDisc(String id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		this.director = director;
		this.cost = cost;
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

	@Override
	public String toString() {
		return "DigitalVideoDisc{" +
				"director='" + director + '\'' +
				", length=" + length +
				", title='" + title + '\'' +
				", category='" + category + '\'' +
				", cost=" + cost +
				'}';
	}

	public void printInfo() {
		toString();
	}
}
