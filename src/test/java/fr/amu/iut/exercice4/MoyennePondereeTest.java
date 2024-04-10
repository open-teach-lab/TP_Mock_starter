package fr.amu.iut.exercice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MoyennePondereeTest {

    @Test
    void calculMoyenneUneNote() throws Exception {
        // 10.0 avec poids 1, résultat 10
    }

    @Test
    void calculMoyenneDeuxNotes() throws Exception  {
        // 10.0 et 12.0, poids 0.5, résultat 11
    }

    @Test
    void calculMoyenneCinqNotes() throws Exception {
        // 10.0, 5.0, 10.5, 12.0 et 15.0, poids 0.2, résultat 10.5
    }

    @Test
    void verifieParametreIncrementationMoyenneAvecValeurPonderee() throws Exception {
    }

}
