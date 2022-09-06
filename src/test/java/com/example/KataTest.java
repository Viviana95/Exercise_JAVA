package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KataTest {
        
    @Test
    public void test_Type_if_odd_print_weird() {
       Kata kata = new Kata();
       String number = kata.Type(3);
       assertEquals("Weird", number); 
    }

    @Test
    void test_if_number_pair_and_range_2_to_5_is_not_weird() {
        Kata kata = new Kata();
        String number = kata.Type(4);
        assertEquals("Not Weird", number); 
    }
    @Test
    void test_if_number_pair_and_range_6_to_20_is_weird() {
        Kata kata = new Kata();
        String number = kata.Type(14);
        assertEquals("Weird", number); 
    }

    @Test
    void test_if_number_pair_and_greater_than_20_is_not_weird() {
        Kata kata = new Kata();
        String number = kata.Type(22);
        assertEquals("Not Weird", number);
    }
    
    
    
}
