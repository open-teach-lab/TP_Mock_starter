package fr.amu.iut.exercice3;

public interface Etudiant {
    int getNbNotes() throws EtudiantSansNoteException;
    Note getNote(int i);
}
