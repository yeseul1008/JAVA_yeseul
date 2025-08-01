package extendQuiz;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Ebook ebook = new Ebook("자바의 정석", "홍길동", 5.2);
	    ebook.setTitle("Good JAVA");
	    ebook.setFileSize(3.8);
	    ebook.printInfo();
	    
	    Ebook defaultEBook = new Ebook();  // 제목과 저자 Unknown, 파일 크기 0.0
	    defaultEBook.printInfo();

	    Ebook ebook1 = new Ebook("재밌는 오라클", "김철수", 4.5);
	    ebook1.setFileSize(6.0);
	    ebook.printInfo();
	}

}
