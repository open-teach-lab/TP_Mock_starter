package fr.amu.iut.exercice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MoyenneArithmetiqueTest {

    @Mock
    private Etudiant e;

    private CalculMoyenne algo;

    @BeforeEach
    void setUp() {
        algo = new MoyenneArithmetique();
    }

    @Test
    void pasDeNoteRetourne0() {
    }

    @Test
    void calculMoyenneUneNote() throws Exception  {
    }

    @Test
    void calculMoyenneDeuxNotes() throws Exception  {
    }

    @Test
    void calculMoyenneCinqNotes() throws Exception  {
    }

    @Test
    void verifieUnSeulAppelAGetNbNotes() throws Exception  {
    }

}