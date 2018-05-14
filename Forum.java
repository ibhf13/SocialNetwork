import java.util.ArrayList;
public class Forum {

	public ArrayList forumBox;
	public ArrayList adminS;
	public String titel;


	public Forum(String titel) {
		this.titel = titel;
		this.adminS = new ArrayList();
		this.forumBox = new ArrayList();
	}

	public void forumVeroffentlichen(Admin adminName ,String text) {
		adminS.add(adminName);
		forumBox.add(text);

	}

	public void forumAntwort(Benutzer benutzer, String text) {
		forumBox.add("\n" +benutzer.name +":\t");
		forumBox.add(text);
	}


	public void addAdmin(Admin adminName) {
		adminS.add(adminName);
	}
}