package bai12_javacolletion.baitap.binary_searchtree;

public interface Tree<E> {
    public boolean insert(E e);
    /**
     * Inorder traversal from the root
     */
    public void inorder();
    /**
     * Get the number of nodes in the tree
     */
    public int getSize();
}
