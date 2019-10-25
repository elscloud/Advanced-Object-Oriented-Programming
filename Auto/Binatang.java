
interface DiambilDaging{
	default void diambildaging(){
		System.out.println("diambil daging");
	}
}

interface DiambilTelur{
	default void diambiltelur(){
		System.out.println("diambil telur");
	}
}

class Ikanhiu extends Binatang implements DiambilDaging{
	Binatang ikan = new Ikanhiu();
	public abstract diambildaging();
}
class Ayam extends Binatang implements DiambilDaging, DiambilTelur{
	Binatang ayam = new Ayam();
	public abstract diambiltelur();
}

public abstract class Binatang {

	public Binatang() {
		
	}

	public static void main(String[] args) {
		
	}

}



