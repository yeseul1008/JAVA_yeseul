package extendQuiz;

public class Ebook extends Book {
	double filesize;
	
	public Ebook() {
		this("Unknown", "Unkown", 0.0);
	}
	
	public Ebook(String title, String author, double size) {
		super(title,author);
		this.filesize = filesize;
	}
	public void setFileSize(double filesize) {
		this.filesize = filesize;
	}
	public void printInfo() {
		System.out.println(getTitle() + " - " + getAuthor() + ", " + "파일 크기 : " + filesize + "MB");
	}
	
}
