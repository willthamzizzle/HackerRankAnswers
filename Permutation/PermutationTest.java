package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void testSort() throws Exception {
        Permutation perm = new Permutation();

        String theString = Permutation.sort("SomeString");
        assertEquals("SomeString", theString);
    }

    @Test
    public void testSolve() throws Exception {

    }
}