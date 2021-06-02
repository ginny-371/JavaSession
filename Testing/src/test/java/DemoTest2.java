import org.junit.Test;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import java.util.Scanner;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class DemoTest2 {
    @Test
    public void testFormat_Email(){
        String email = "tongdongcs.com";
        assertThat(email).isNotEmpty()
                .containsPattern("[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$");
    }

    @Test
    public void testWeight(){
        String weight = "34";
        assertThat(weight).isNotEmpty()
                .containsOnlyDigits();
        int i = Integer.parseInt(weight);
        assertThat(i).isStrictlyBetween(0,150);
    }
    //Chung minh la so, phan tu co 9 so, khong co chu)
    @Test
    public void testCmt() {
        String[] array_cmt = new String[5];
        array_cmt[0] = "983729838";
        array_cmt[1] = "983729834";
        array_cmt[2] = "983729834";
        array_cmt[3] = "983729834";
        array_cmt[4] = "hdsk";
        assertThat(array_cmt).doesNotHaveDuplicates();
        int k = array_cmt.length;
        for (int i=0; i<k; i++) {
            assertThat(array_cmt[i]).isNotEmpty()
                    .hasSize(9)
                    .containsOnlyDigits();
        }
    }
}
