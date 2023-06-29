package study03;

public class BookArray {

	public static void main(String[] args) {
		Book b = new Book();
		b.setbookName("삼국지1");
		String bs = b.getbookName();
		System.out.println(bs);
		
		
		Book[]lib = new Book[5];
		lib[0] = new Book("삼국지1","나관중");
		lib[1] = new Book("삼국지2","나관중");
		lib[2] = new Book("삼국지3","나관중");
		lib[3] = new Book("삼국지4","나관중");
		lib[4] = new Book("삼국지5","나관중");
		//lib[5] = new Book("삼국지6","나관중");
		System.out.println(lib);
		for(int i =0;i<lib.length;i++) {
			System.out.print(i+" "+lib[i].getbookName()+" By ");
			System.out.println(lib[i].getAuthor());
		}
		for(int i=0;i<lib.length;i++) {
			lib[i].printBookInfo();
		}
	}
}