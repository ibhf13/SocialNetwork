import java.util.ArrayList;
public class Nachricht {

	ArrayList nachrichtenBox;
	Benutzer absender;
	Benutzer empfänger;



	public void nachrichtenSchreiben(Nachricht box,String text) {
		nachrichtenBox.add(text);
	}

	public Nachricht(Benutzer absender , Benutzer empfänger) {
		this.absender = absender;
		this.empfänger = empfänger;
		this.nachrichtenBox = new ArrayList();
	}


}