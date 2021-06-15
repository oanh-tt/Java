import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void testB1(){
        String str = "You only live once. But if you do it right. Once is enough";
        assertThat (str).isEqualTo("You Only Live Once. But if You do right. once is Enough")
                .isNotNull();
    }

}
