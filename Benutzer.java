import java.util.ArrayList;
public class Benutzer {

	public String name ;
	public ArrayList freundeList;

	public Benutzer(String name) {
		this.name= name;
		this.freundeList = new ArrayList();
	}
	public void befreundet(Benutzer benutzer){
		freundeList.add(benutzer);
		//System.out.println("You have new Friend : " +benutzer.name);
	}

	public void nachrichtSChreiben(Nachricht box , String text){
		box.nachrichtenSchreiben(box ,text);
	}

}