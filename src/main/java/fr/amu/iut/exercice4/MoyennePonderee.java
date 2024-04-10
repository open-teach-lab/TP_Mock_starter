package fr.amu.iut.exercice4;

public class MoyennePonderee implements CalculMoyenne {
    double moyenne = 0;

    private void incrementerMoyenne(double valeurPonderee) {
        moyenne += valeurPonderee;
    }

    @Override
    public double getMoyenne(Etudiant e) throws MoyenneNonCalculableException {
        // utilisez la méthode incrementerMoyenne
        return moyenne;
    }

}
