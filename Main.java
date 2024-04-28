public class Main {
    public static void main(String[] args) {

        etudiant student = new etudiant();

    
        student.ajouter(15, "Mathématiques");

    
        System.out.println("Note ajoutée : " + student.getNote());
        System.out.println("Cours ajouté : " + student.getClass());
    }
}
