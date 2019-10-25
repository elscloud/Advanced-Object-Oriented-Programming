
interface DiAmbilDaging{
	void diAmbilDaging();
}

interface DiAmbilTelur{
	void diAmbilTelur();
}

abstract class Binatang {

}
class Ikanhiu extends Binatang implements DiAmbilDaging{
	Binatang ikan = new Ikanhiu();
	public void diAmbilDaging(){
		
	}
}

class Ayam extends Binatang implements DiAmbilDaging, DiAmbilTelur{
	Binatang ayam = new Ayam();
	public void diAmbilTelur(){
		
	}
	public void diAmbilDaging(){
		
	}
}
public class B {

	
	public static void main(String[] args) {
		if((new Ayam()) instanceof Binatang){
			System.out.println("Ayam adalah binatang");
		}
		if((new Ayam()) instanceof DiAmbilDaging){
			System.out.println("Ayam bisa diambil dagingnya");
		}
		if((new Ayam()) instanceof DiAmbilTelur){
			System.out.println("Ayam bisa diambil telurnya");
		}
		if((new Ayam()) instanceof Object){
			System.out.println("Ayam adalah sebuah object");
		}
		if((new Ayam()) instanceof Ayam){
			System.out.println("Ayam adalah instance dari ayam");
		}

	}

}
