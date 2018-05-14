public class Test {
    public static void main(String[] args) {
        Benutzer iebo = new Benutzer("Ibrahem");
        Benutzer pat = new Benutzer("Patrick");
        Benutzer lucy = new Benutzer("Lucifer");

        Admin god = new Admin("God");
        Admin anna = new Admin("Anna");

        Forum gaming = new Forum("Gaming");

        Nachricht box1 = new Nachricht(iebo , lucy);
        Nachricht box2 = new Nachricht(pat,god);
        Nachricht box3 = new Nachricht(anna , pat);

        iebo.nachrichtSChreiben(box1 ,"Lucifer is not The Guilty one ");
        pat.nachrichtSChreiben(box2,"Is Lucifer really guilty?");
        pat.nachrichtSChreiben(box3,"God Dilemma");


        god.befreundet(lucy);
        iebo.befreundet(pat);

        gaming.forumVeroffentlichen(god ,"It's A game");
        gaming.addAdmin(anna);

        gaming.forumAntwort(iebo,"Devil May Cry is Awesome!");
        gaming.forumAntwort(lucy,"Speaking of the Devil ^_^ ");
        gaming.forumAntwort(pat, "LOL");
        gaming.forumAntwort(god , "You all shall go to Hell");

        god.friendsList(iebo);
        god.zeigAdmins(gaming);
        anna.forumAnzeigen(gaming);

        anna.nachrichtenZeigen(box1);
        anna.nachrichtenZeigen(box2);
        anna.nachrichtenZeigen(box3);


    }

}
