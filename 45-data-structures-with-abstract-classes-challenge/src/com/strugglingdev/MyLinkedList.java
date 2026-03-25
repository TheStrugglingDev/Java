package com.strugglingdev;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (newItem == null) {
            return false;
        }

        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);

            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }

            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                } else {
                    root = newItem;
                }

                newItem.setNext(currentItem);
                currentItem.setPrevious(newItem);
                return true;

            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item == null) {
            return false;
        }

        ListItem currentItem = root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if (comparison == 0) {
                if (currentItem == root) {
                    root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());

                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;

            } else if (comparison < 0) {
                currentItem = currentItem.next();

            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem currentItem = root;
            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}