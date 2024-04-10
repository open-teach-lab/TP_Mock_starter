package fr.amu.iut.exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

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
    void calculMoyenneSansNoteLeveExceptions() throws Exception {
    }

    @Test
    void verifieMessageExceptionQuandCalculMoyenneSansNote() throws Exception {
        // verifie que le message est "Etudiant absent"
    }

}