package nostrability.schemata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchemataTest {
    @Test void getKind1() { assertNotNull(Schemata.get("kind1Schema")); }
    @Test void getNote() { assertNotNull(Schemata.get("noteSchema")); }
    @Test void getNonexistent() { assertNull(Schemata.get("nonexistent")); }
    @Test void keysCount() { assertTrue(Schemata.keys().size() > 100); }
}
