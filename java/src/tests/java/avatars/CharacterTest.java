package avatars;

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
}
