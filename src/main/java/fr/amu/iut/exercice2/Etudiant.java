package fr.amu.iut.exercice2;

public interface Etudiant {
    int getNbNotes() throws EtudiantSansNoteException;
    double getNote(int i);
}
