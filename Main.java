package com.fastcampus.de.java.clip3;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world!");
        InnerClass innerClass = new InnerClass();
        innerClass.printName();
    }

    public static class InnerClass {

        public void printName(){
            System.out.println(this.getClass().getName()); // 클래스의 풀 네임을 알려준다.
            System.out.println(this.getClass().getSimpleName()); // 클래스의 선언부 이름을 알려준다.
            }
        }
    }
