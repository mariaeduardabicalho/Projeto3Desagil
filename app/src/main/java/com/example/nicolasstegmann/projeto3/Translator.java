package com.example.nicolasstegmann.projeto3;

import java.util.HashMap;
import java.util.LinkedList;

public class Translator {
    private class Node {
        private char value;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        public Node() {
            this.value = ' ';
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }
        public Node(char value) {
            this.value = value;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public char getValue() {
            return value;
        }
        public Node getParent() {
            return parent;
        }
        public void setParent(Node parent) {
            this.parent = parent;
        }
        public Node getLeftChild() {
            return leftChild;
        }
        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }
        public Node getRightChild() {
            return rightChild;
        }
        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
    }
    private Node root;
    private HashMap<Character, Node> map;

    private String signal;

    // ESTE CONSTRUTOR DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public Translator() {
    }

    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public char morseToChar(String code) {
        StringBuffer result = new StringBuffer("");
        Node current = root;
        for (int i = 0; i < code.length(); i++) {
            signal = code.substring(i, i + 1);
            if (signal.equals(".")) {
                if (current.getLeftChild() != null) {
                    current = current.getLeftChild();
                } else {
                    current.setLeftChild(new Node());
                    current = current.getLeftChild();
                }
            } else if (signal.equals("-")) {
                if (current.getRightChild() != null) {
                    current = current.getRightChild();
                } else {
                    current.setRightChild(new Node());
                    current = current.getRightChild();
                }
            } else {
                result = result.append(current.getValue());
                current = root;
                }
            }
        result = result.append(current.getValue());
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public String charToMorse(char c) {
        return null;
    }


    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public LinkedList<String> getCodes() {
        return null;
    }
}
}
