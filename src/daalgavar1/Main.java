package daalgavar1;

public class Main {

	public static void main(String[] args) {
		
//		a. 2 обьект үүсгэнэ. Эхний обьект дефаулт байгуулагчийг, хоёр дахь обьект аргумент
//		бүхий байгуулагчийг тус тус ашиглана
		
		var rectangle1 = new Rectangle();
		var rectangle2 = new Rectangle(5.0, 15.0);
		
//		b. Эхний обьектын өгөгдлүүдэд олгогдсон дефаулт утгуудыг set функцүүдийн
//		тусламжтай өөрчил.
		
		rectangle1.setHeigth(10.0);
		rectangle1.setWidth(10.0);
		
//		c. Обьект бүрийн өгөгдлүүдийг тус тус хэвлэж хар.
		
		System.out.println("Rectangle1");
		System.out.println(rectangle1.getHeigth());
		System.out.println(rectangle1.getWidth());
		System.out.println("Rectangle2");
		System.out.println(rectangle2.getHeigth());
		System.out.println(rectangle2.getWidth());
		
//		d. Обьект бүрийн талбай болон периметрийн утгыг хэвлэж хар.
		
		System.out.println("Rectangle1");
		System.out.println(rectangle1.Area());
		System.out.println(rectangle1.Perimeter());
		System.out.println("Rectangle2");
		System.out.println(rectangle2.Area());
		System.out.println(rectangle2.Perimeter());
	}

}
