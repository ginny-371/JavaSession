import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestBai1 {
    Bai1 b1 = new Bai1();
    @Test
    public void testPassVietHoa(){
        assertEquals("You Only Live Once. But If You Do It Right. One Is Enough",b1.vietHoa("You Only Live Once. But if You do it right. One is Enough"));
    }
    @Test
    public void testfailVietHoa(){
        assertNotEquals("You only Live Once. But If You Do It Right. One Is Enough",b1.vietHoa("You Only Live Once. But if You do it right. One is Enough"));
    }
    @Test
    public void testPassChuanHoa(){
        assertEquals("You only live once. But if you do it right. One is enough",b1.chuanHoa("You Only Live Once. But if You do it right. One is Enough"));
    }
    @Test
    public void testfailChuanHoa(){
        assertNotEquals("You only Live Once. But If You Do It Right. One Is Enough",b1.chuanHoa("You Only Live Once. But if You do it right. One is Enough"));
    }
}
