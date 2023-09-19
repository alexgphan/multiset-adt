import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A template for a test class in case you decide to write any.
 * The basic structure is the same as pytest which you've used in the past.
 * We'll talk more about testing later in the term.
 */
public class TreeTest {

    @Test(timeout = 500)
    public void dummyTest() {
        assertTrue(true);
    }

    @Test(timeout = 500)
    public void testTreeMultiSetAddContains() {
        TreeMultiSet treeMS = new TreeMultiSet();

        // Add some items to the tree
        assertTrue(treeMS.add(1));
        assertTrue(treeMS.add(2));

        // Check that the tree contains the items we added and not others
        assertTrue(treeMS.contains(1));
        assertFalse(treeMS.contains(3));
    }

    @Test(timeout = 500)
    public void testTreeMultiSetRemove() {
        TreeMultiSet treeMS = new TreeMultiSet();

        // Add some items to the tree
        treeMS.add(1);
        treeMS.add(2);

        // Check that the tree contains the items we added and not others
        assertTrue(treeMS.contains(1));
        assertFalse(treeMS.contains(3));

        // Remove an item from the tree
        treeMS.remove(1);

        // Check that the tree no longer contains the item we removed
        assertFalse(treeMS.contains(1));
    }

    @Test(timeout = 500)
    public void testTreeMultiSetIsEmpty() {
        TreeMultiSet treeMS = new TreeMultiSet();

        // Check that the new tree is empty
        assertTrue(treeMS.is_empty());

        // Add an item to the tree
        treeMS.add(1);

        // Check that the tree is no longer empty
        assertFalse(treeMS.is_empty());
    }

    @Test(timeout = 500)
    public void testTreeMultiSetCount() {
        TreeMultiSet treeMS = new TreeMultiSet();

        // Add some items to the tree
        treeMS.add(1);
        treeMS.add(1);
        treeMS.add(2);

        // Check that the tree contains the items we added and not others
        assertTrue(treeMS.contains(1));
        assertFalse(treeMS.contains(3));

        // Check that the tree contains the correct number of each item
        assertEquals(2, treeMS.count(1));
        assertEquals(1, treeMS.count(2));
    }

    @Test(timeout = 500)
    public void testTreeMultiSetSize() {
        TreeMultiSet treeMS = new TreeMultiSet();

        // Add some items to the tree
        treeMS.add(1);
        treeMS.add(1);
        treeMS.add(2);

        // Check that the tree contains the correct number of items in total
        assertEquals(3, treeMS.size());
    }
}