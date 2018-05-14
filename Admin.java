import java.util.ArrayList;

public class Admin extends Benutzer {

	public Object verwalten;

	public Admin(String name) {
		super(name);

	}
	public void friendsList(Benutzer benutzer){
		System.out.println(benutzer.name +" Friends are : ");
		for(int i = 0;i <benutzer.freundeList.size() ;i++){
			Benutzer ben =(Benutzer) benutzer.freundeList.get(i);
			System.out.println(ben.name);
		}

	}
	public void forumAnzeigen(Forum forum){

		System.out.println('\n' +"||    Forum complet with the Discussion   ||");
		System.out.println("The new Forum called : " +forum.titel);
		for(int i = 0;i <forum.forumBox.size() ;i++){
			System.out.print(forum.forumBox.get(i) );
		}
		System.out.println();
	}
	public void zeigAdmins(Forum forum){
		System.out.println("\nThe Admins are : ");
		for(int i = 0;i <forum.adminS.size() ;i++){
			Admin adminName =(Admin) forum.adminS.get(i);
			System.out.println(adminName.name);
		}
	}
	public void nachrichtenZeigen(Nachricht box){
		for (int i = 0; i < box.nachrichtenBox.size(); i++) {
			System.out.print("Nachricht von " +box.absender.name +" to " );
			System.out.println(box.empfänger.name +"   :\n" +box.nachrichtenBox.get(i) +"\n");
		}
	}

}