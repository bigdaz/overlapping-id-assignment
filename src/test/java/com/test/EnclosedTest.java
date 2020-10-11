package com.test;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EnclosedTest {
    public static class TagDTOTests {
        @Test
        public void ValidTagDTOTest() {
        }

        @Test
        public void InvalidTagDTOTest1() {
        }

        @Test
        public void InvalidTagDTOTest2() {
        }
    }

    public static class ValuesDTOTests {
        @Test
        public void ValidValuesDTOTest() {
        }

        @Test
        public void InvalidValuesDTOTest1() {
        }

        @Test
        public void InvalidValuesDTOTest2() {
        }

        @Test
        public void InvalidValuesDTOTest3() {
        }
    }

    public static class ClientIncidentDTOTests {
        @Test
        public void ValidClientIncidentDTOTest1() {
        }

        @Test
        public void ValidClientIncidentDTOTest2() {
        }

        @Test
        public void ValidClientIncidentDTOTest3() {
        }

        @Test
        public void InvalidClientIncidentDTOTest1() {
        }
    }
}