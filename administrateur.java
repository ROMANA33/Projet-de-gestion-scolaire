public class administrateur{

    private String utilisateur ;
    private int password ;
    private int note;
    public String cours;



public administrateur(String utilisateur,int password){
this.utilisateur =utilisateur;
this.password=password;
}

public administrateur() {
    //TODO Auto-generated constructor stub
}

public int getNote() {
    return note;
}

public String getCours() {
    return cours;
}



private void authentifier(String utilisateur,int password){
    this.utilisateur=utilisateur;
    this.password=password;
    System.out.println("veuillez entrer vos informations personnelles" +utilisateur + password);

}
public void ajouter(String cours, int note) {
    this.note=note;
    this.cours=cours;
    
    System.out.println("Note ajoutée pour le cours " + cours + ": " + note);
    
}



public void modifier(int note){
    this.note=note;

    System.out.println("veuilles modifier la note de l'etudiant");
}


public void supprimer(int note,String cours){
    this.note=note;
    this.cours=cours;

    System.out.println("suprimmez le cours et la note" + cours + ": " + note);
    
    
}



public void enregistrer(int note,String cours){
    this.note=note;
    this.cours=cours;
    
    System.out.println("enregistrer la note pour le cours " + cours + ": " + note);
    
}


public void consulter(int note,String cours){
    this.note=note;
    this.cours=cours;
    
    System.out.println("consulter la note pour le cours " + cours + ": " + note);
    
}


}



