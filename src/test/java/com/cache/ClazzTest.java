package com.cache;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ClazzTest {

    @BeforeTest
    public void before() {
        System.out.print("before");
    }

    @DataProvider(name = "params")
    public Object[][] getParams() {
        return new Object[][]{{2}, {3}};
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void test1() {
        Clazz c = new Clazz();
        assertThat(c.method(2)).isEqualTo(2);
        c.method(1);
    }

    @Test
    public void test2() {
        Clazz mockedClazz = mock(Clazz.class);
        mockedClazz.method(2);
        verify(mockedClazz).method(2);

        when(mockedClazz.method(5)).thenReturn(5);
        mockedClazz.method(5);
        verify(mockedClazz).method(5);

    }


    @Test(dataProvider = "params")
    public void test3(int param) {
        Clazz c = new Clazz();
        assertThat(c.method(param)).isEqualTo(param);
    }
}
