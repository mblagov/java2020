package org.mblagov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SummatorTest {

    @Test
    public void testSumPositives() {
        Summator summator = new Summator();
        int actualResult = summator.sum(5,4);
        Assertions.assertEquals(9, actualResult);
    }

    @Test
    public void throwsExceptionOnNegativeNumbers() {
        Summator summator = new Summator();
        Assertions.assertThrows(RuntimeException.class, () -> summator.sum(-1, 1));
    }

    @Test
    public void testReadFromInputStream() {
        InputStream is = new ByteArrayInputStream("5 6".getBytes());

        Summator mock = Mockito.mock(Summator.class);
        Mockito.when(mock.sum(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(2);
        int result = Summator.getSum(is, mock);

        Mockito.verify(mock, Mockito.times(1)).sum(5,6);

        Assertions.assertEquals(result, 2);
    }
}
