package org.andres.collection.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    private final SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

    @Test
    void appendToEmptyList() {
        singlyLinkedList.append(1);
        assertEquals(1, singlyLinkedList.size);
    }

    @Test
    void appendToListTwoElements() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(10);
        assertEquals(2, singlyLinkedList.size);
    }

    @Test
    void appendElementToIndex_2() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);

        singlyLinkedList.add(5, 2);
        assertEquals(5, singlyLinkedList.size);
    }

    @Test
    void deleteTest() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);
        System.out.println(singlyLinkedList);

        int resultExpected = 3;
        int deletedValue = singlyLinkedList.delete(2);
        System.out.println(singlyLinkedList.toString());
        assertEquals(resultExpected, deletedValue);
    }

    @Test
    void deleteFirstElementTest() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);
        singlyLinkedList.append(4);
        System.out.println(singlyLinkedList);

        int resultExpected = 1;
        int deletedValue = singlyLinkedList.delete(0);
        System.out.println(singlyLinkedList.toString());
        assertEquals(resultExpected, deletedValue);
    }

    @Test
    void deleteFirstWithOneElementTest() {
        singlyLinkedList.append(1);
        System.out.println(singlyLinkedList);

        int resultExpected = 1;
        int deletedValue = singlyLinkedList.delete(0);
        System.out.println(singlyLinkedList.toString());
        assertEquals(resultExpected, deletedValue);
    }

    @Test
    void deleteWithIndexOutOfBoundsExceptionNegativeTest() {
        assertThrows(IndexOutOfBoundsException.class, () -> singlyLinkedList.delete(-2));
    }

    @Test
    void deleteWithIndexOutOfBoundsExceptionPositiveTest() {
        assertThrows(IndexOutOfBoundsException.class, () -> singlyLinkedList.delete(2));
    }

    @Test
    void getFirstTest() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(10);

        assertEquals(1, singlyLinkedList.getFirst());
    }

    @Test
    void getLastTest() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(10);

        assertEquals(10, singlyLinkedList.getLast());
    }

    @Test
    void getGetFirstNoSuchElementException() {
        assertThrows(NoSuchElementException.class, singlyLinkedList::getFirst);
    }

    @Test
    void getGetLastNoSuchElementException() {
        assertThrows(NoSuchElementException.class, singlyLinkedList::getLast);
    }

    @Test
    void getTest() {
        singlyLinkedList.append(1);
        singlyLinkedList.append(2);
        singlyLinkedList.append(3);

        int resultExpected = 2;

        assertEquals(resultExpected, singlyLinkedList.get(1));
    }

    @Test
    void getNoSuchElementException() {
        singlyLinkedList.append(1);
        assertThrows(IndexOutOfBoundsException.class, () -> singlyLinkedList.get(-1));
    }
}