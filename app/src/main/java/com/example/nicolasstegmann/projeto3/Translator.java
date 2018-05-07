package com.example.nicolasstegmann.projeto3;

import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.LinkedList;

public class Translator extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse1);

        editText = (EditText) findViewById(R.id.editText);
    }
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


    // ESTE CONJUNTO DE ATRIBUTOS NÃO PODE SER MODIFICADO, OU
    // SEJA, NÃO É PERMITIDO ADICIONAR NEM REMOVER ATRIBUTOS!
    private Node root;
    private HashMap<Character, Node> map;


    // ESTE CONSTRUTOR DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public Translator() {

        root = new Node();

        Node n2;
        char e = 'e' ;
        n2 = new Node('e');
        Node n3 = new Node( 't');
        root.setLeftChild(n2);
        root.setRightChild(n3);

        Node n4 = new Node('i');
        Node n5 = new Node( 'a');
        n2.setLeftChild(n4);
        n2.setRightChild(n5);

        Node n6 = new Node('n');
        Node n7 = new Node( 'm');
        n3.setLeftChild(n6);
        n3.setRightChild(n7);

        Node n8 = new Node('s');
        Node n9 = new Node( 'u');
        n4.setLeftChild(n8);
        n4.setRightChild(n9);

        Node n10 = new Node('r');
        Node n11 = new Node( 'w');
        n5.setLeftChild(n10);
        n5.setRightChild(n11);

        Node n12 = new Node('d');
        Node n13 = new Node( 'k');
        n6.setLeftChild(n12);
        n6.setRightChild(n13);

        Node n14 = new Node('g');
        Node n15 = new Node( 'o');
        n7.setLeftChild(n14);
        n7.setRightChild(n15);

        Node n16 = new Node('h');
        Node n17 = new Node( 'v');
        n8.setLeftChild(n16);
        n8.setRightChild(n17);

        Node n18 = new Node('f');
        Node n19 = new Node();
        n9.setLeftChild(n18);
        n9.setRightChild(n19);

        Node n20 = new Node('l');
        Node n21 = new Node();
        n10.setLeftChild(n20);
        n10.setRightChild(n21);

        Node n22 = new Node('p');
        Node n23 = new Node('j');
        n11.setLeftChild(n22);
        n11.setRightChild(n23);

        Node n24 = new Node('b');
        Node n25 = new Node('x');
        n12.setLeftChild(n24);
        n12.setRightChild(n25);

        Node n26 = new Node('c');
        Node n27 = new Node('y');
        n13.setLeftChild(n26);
        n13.setRightChild(n27);

        Node n28 = new Node('z');
        Node n29 = new Node('q');
        n14.setLeftChild(n28);
        n14.setRightChild(n29);

        Node n30 = new Node();
        Node n31 = new Node();
        n15.setLeftChild(n30);
        n15.setRightChild(n31);

        Node n32 = new Node('5');
        Node n33 = new Node('4');
        n16.setLeftChild(n32);
        n16.setRightChild(n33);

        Node n34 = new Node();
        Node n35 = new Node('3');
        n17.setLeftChild(n34);
        n17.setRightChild(n35);

        Node n36 = new Node();
        Node n37 = new Node();
        n18.setLeftChild(n36);
        n18.setRightChild(n37);

        Node n38 = new Node();
        Node n39 = new Node('2');
        n19.setLeftChild(n38);
        n19.setRightChild(n39);

        Node n40 = new Node();
        Node n41 = new Node();
        n20.setLeftChild(n40);
        n20.setRightChild(n41);

        Node n42 = new Node('+');
        Node n43 = new Node();
        n21.setLeftChild(n42);
        n21.setRightChild(n43);

        Node n44 = new Node();
        Node n45 = new Node('1');
        n23.setLeftChild(n44);
        n23.setRightChild(n45);

        Node n46 = new Node('6');
        Node n47 = new Node('=');
        n24.setLeftChild(n46);
        n24.setRightChild(n47);

        Node n48 = new Node('/');
        Node n49 = new Node();
        n25.setLeftChild(n48);
        n25.setRightChild(n49);

        Node n50 = new Node('7');
        Node n51 = new Node();
        n28.setLeftChild(n50);
        n28.setRightChild(n51);

        Node n52 = new Node('7');
        Node n53 = new Node();
        n30.setLeftChild(n52);
        n30.setRightChild(n53);

        Node n54 = new Node('9');
        Node n55 = new Node('0');
        n31.setLeftChild(n54);
        n31.setRightChild(n55);

    }



    // ESTE MÉTODO DEVE SER PREENCHIDO DE ACORDO COM O ENUNCIADO!
    public char morseToChar(String code) {

        Node n = root;

        //char arr[] = code.toCharArray();
        //for(char s: arr){
        for (int i = 0; i < code.length(); i++) {
            char sinal = code.charAt(i);
            if (sinal == '.') {
                if(n.getLeftChild()!= null){
                    n = n.getLeftChild();
                }

            }
            else  {
                if (n.getRightChild()!= null){
                    n = n.getRightChild();
                }
            }

        }

        //LinkedList<Character> list = new LinkedList<>();
        //list.add(v);
        return n.getValue();
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
