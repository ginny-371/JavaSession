import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Demo3 {
    String maNhanVien = new String("NV2738236");
    @Test
    public void checkEmployeeCode(){
        assertThat(maNhanVien).isNotEmpty()
                .hasSize(9)
                .containsPattern("NV+[0-9]");
    }
}
