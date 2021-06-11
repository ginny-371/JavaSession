import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MaNhanVien {
    String maNhanVien = new String("NV2738236");
    @Test
    public void checkEmployeeCode(){
        assertThat(maNhanVien).isNotEmpty()
                .hasSize(9)
                .containsPattern("NV+[0-9]");
    }
}

/*
Bài 3 Phân biệt String và StringBuilder
1. String
- Chuỗi không thể thay đổi
- String dùng khi
2. StringBuilder
- Chuỗi có thể thay đổi
- Hỗ trợ nhiều methods để tác động lên chuỗi hơn như ( append, insert, reverse..)
- Hiệu năng của StringBUilder cao hơn

 */
