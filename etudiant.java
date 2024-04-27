
public class etudiant {
    public String nom;
    public String prenom;
    public int  age;
    private String mail;
    private int note;
    public String cours;


public etudiant(String nom,String prenom,int age,String mail){

    this.nom=nom;
    this.prenom=prenom;
    this.age=age;
    this.mail=mail;

}


public void consulter(int note,String cours){
    this.note=note;
    this.cours=cours;
    
    System.out.println("consulter la note pour le cours " + cours + ": " + note);
    
}

public void inscrire(String nom,String prenom,String mail){
    this.nom=nom;
    this.prenom=prenom;
    this.mail=mail;

    System.out.println("veuillez entrer vos informations personnelles:"+nom +prenom+mail);
    
}


private void authentifier(String nom,String prenom,String mail,int age){
    this.nom=nom;
    this.prenom=prenom;
    this.mail=mail;
    this.age=age;


    System.out.println("veuillez entrer vos informations personnelles:"+nom +prenom+age+mail);
    
    

}



}
