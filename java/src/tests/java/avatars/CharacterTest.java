package avatars;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
    private Character character;

    @Before
    public void setUp() {
        character = new Character();
    }

    @Test
    public void canSetName() {
        character.setName("Dave");
    }

    @Test
    public void canGetName() {
        assertEquals("Dave", character.getName());
    }

    @Test
    public void canSetAndGetName() {
        character.setName("Droggo");
        assertEquals("Droggo", character.getName());
    }
}
