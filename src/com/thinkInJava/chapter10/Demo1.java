package com.thinkInJava.chapter10;

public class Demo1 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmain");
    }
}

class Parcel4{

    private class PContent implements Contents{

        private  int i = 1;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;

        public PDestination(String label) {
            this.label = label;
        }

        @Override
        public String readLable() {
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContent();
    }
}