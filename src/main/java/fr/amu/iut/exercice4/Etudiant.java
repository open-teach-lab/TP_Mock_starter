package fr.amu.iut.exercice4;

public interface Etudiant {
    int getNbNotes() throws EtudiantSansNoteException;
    Note getNote(int i);
    double getMoyenne(CalculMoyenne c);
}
