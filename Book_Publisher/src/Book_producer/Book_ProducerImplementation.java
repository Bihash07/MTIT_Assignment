package Book_producer;

public class Book_ProducerImplementation implements Book_ProducerInterface {
	
	@Override
	public int items_1(int item) {
		// TODO Auto-generated method stub
		if(item== 1){
			System.out.println("Fantasy one book");
			return Book_ProducerInterface.Fantasy;
		}
		else if(item == 2){
			System.out.println("Horror one book");
			return Book_ProducerInterface.Horror;
		}	
		else if(item == 3){
			System.out.println("Adventure one book");
			return Book_ProducerInterface.Adventure;
		}
		else if(item == 4){
			System.out.println("Classics:1KG");
			return Book_ProducerInterface.Classics;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListBooks_1() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : Fantasy one book: Rs."+ Book_ProducerInterface.Fantasy+".00");
		System.out.println(" 2 : Horror one book: Rs."+ Book_ProducerInterface.Horror+".00");
		System.out.println(" 3 : Adventure one book: Rs."+ Book_ProducerInterface.Adventure+".00");
		System.out.println(" 4 : Classics one book: Rs."+ Book_ProducerInterface.Classics+".00");
	}




	@Override
	public int items_2(int item) {
		if(item== 1){
			System.out.println("Comic:1KG");
			return Book_ProducerInterface.Comic;
		}
		else if(item == 2){
			System.out.println("GraphicNovel:1KG");
			return Book_ProducerInterface.GraphicNovel;
		}	
		else if(item == 3){
			System.out.println("Mystery:1KG");
			return Book_ProducerInterface.Mystery;
		}
		else if(item == 4){
			System.out.println("Detective:1KG");
			return Book_ProducerInterface.Detective;
		}
		else {
			System.out.println("Invalid");
			return 0;
		}
	}

	@Override
	public void ListBooks_2() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : Comic one book: Rs."+Book_ProducerInterface.Comic+".00");
		System.out.println(" 2 : GraphicNovel one book: Rs."+Book_ProducerInterface.GraphicNovel+".00");
		System.out.println(" 3 : Mystery one book: Rs."+Book_ProducerInterface.Mystery+".00");
		System.out.println(" 4 : Detective one book: Rs."+Book_ProducerInterface.Detective+".00");
	

	}	
}
