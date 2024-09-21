package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SearchesTest {

    @Test
    void testFindHighestFraction() {
        Fraction fraction = new Searches().findHighestFraction();
        assertNotNull(fraction);
        assertEquals(2, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testFindUserNameBySomeImproperFraction() {
        assertEquals(List.of("Oscar", "Ana", "Paula"), new Searches().findUserNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

}