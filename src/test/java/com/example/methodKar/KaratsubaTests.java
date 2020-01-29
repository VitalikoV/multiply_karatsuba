package com.example.methodKar;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaratsubaTests {

    Karatsuba karatsuba;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("Starting");
    }

    @BeforeEach
    void init(){
        karatsuba = new Karatsuba();
    }

    @AfterAll
    static void afterAllInit(){
        System.out.println("Ending");
    }




    @Test
    @DisplayName("Multiplying test 1")
    public void test(){

        long actual = karatsuba.multiply(123,456);
        long expected = 56088;
        assertEquals(expected, actual, "something went wrong");
    }


    @Test
    @DisplayName("Multiplying test 2")
    public void test2(){
        long actual = karatsuba.multiply(1234,456);
        long expected = 562704;
        assertEquals(expected, actual, "something went wrong");
    }

    @Test
    @DisplayName("Multiplying test 3")
    public void test3(){
        long actual = karatsuba.multiply(1234,4567);
        long expected = 5635678;
        assertEquals(expected, actual, "something went wrong");
    }

    @Test
    @DisplayName("Multiplying test 4")
    public void test4(){
        long actual = karatsuba.multiply(-23,45);
        long expected = -1035;
        assertEquals(expected, actual, "something went wrong");
    }

    @Test
    @DisplayName("Multiplying test 4")
    public void test5(){
        long actual = karatsuba.multiply(-20,-30);
        long expected = 600;
        assertEquals(expected, actual, "something went wrong");
    }
}
