import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import java.util.Scanner;

public class DemoTest {
    Nhan2so n2s = new Nhan2so();
    CompareString cp = new CompareString();
    char[] expectedArray = { 'G', 'I', 'N', 'N','Y'} ;
    char[] actualArray = { 'G', 'I', 'N', 'N','Y'} ;
    int[] nul= null;
    char[] same = expectedArray;

    //assertEquals() để xác minh giá trị mong đợi và giá trị thực tế bằng nhau. Trong khi assertNotEquals() dùng để xác minh 2 giá trị không giống nhau.
    @Test
    public void testEqual(){
        assertEquals(6,n2s.tinhNhan2so(2,3));
        assertNotEquals(6,n2s.tinhNhan2so(3,7));
    }
    //assertTrue() dùng để xác minh điều kiện phải trả về true trong khi assertFalse() yêu cầu điều kiện kiểm thử phải là false.
    @Test
    public void testTrueFalse(){
        assertFalse(cp.check2String("Đông c","Nguy"));
        assertTrue((cp.check2String("Dong hamham","Dong hamham")));
    }
    //Method assertArrayEquals() dùng để xác mình rằng mảng dự kiến và mảng mong đợi bằng nhau.
    @Test
    public void testArrayEqual(){
        assertArrayEquals(expectedArray,actualArray);
    }
    //Nếu chúng ta muốn kiểm tra một object không được null sử dụng assertNotNull() ngược lại sử dụng assertNull() nếu mong muốn một object là null trong test case.
    @Test
    public void testNull(){
        assertNull(nul);
        assertNotNull(expectedArray);
    }
    //Khi chúng ta muốn kiểm tra 2 object cùng tham chiếu đến một object trong vùng nhớ heap.
    @Test
    public void testSame(){
        assertSame(expectedArray,same);
        assertNotSame(actualArray,same);
    }

}
