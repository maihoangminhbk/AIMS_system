package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{


	public DigitalVideoDisc() {
		
	}

	public DigitalVideoDisc(String id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
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


	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
