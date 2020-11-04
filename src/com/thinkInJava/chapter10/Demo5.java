package com.thinkInJava.chapter10;

public class Demo5 {

    private static class ParcelContents implements Contents{

        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;

        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLable() {
            return label;
        }

        static int x = 10;

        static class AnotherLeval{
            public static void f(){

            }
            static int x = 10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Destination destination = destination("Tasmania");
        Contents contents = contents();
    }
}
