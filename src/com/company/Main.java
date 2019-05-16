package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();

    public static void main(String[] args) {
        // write your code here

        int command = 0;
        boolean exit = false;

        printCommand();

        while (!exit) {
            System.out.println("enter our choice");
            command = in.nextInt();
            in.nextLine();

            switch (command) {
                case 0:
                    printCommand();
                    break;
                case 1:
                    myTodoList.printTodoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please pick only from given commands");


            }
        }

    }

    public static void printCommand() {
        System.out.println("\n Commands: " +
                "\n Press 0 : To print instructions" +
                "\n Press 1 : To print all list" +
                "\n Press 2 : To add list in Todo" +
                "\n Press 3 : To modify item in Todo" +
                "\n Press 4 : To remove item from Todo" +
                "\n Press 5 : To search an Item from Todo" +
                "\n Press 6 : To exit the app");
    }

    public static void addItem() {
        System.out.println("Enter items to be added in todo List");
        myTodoList.addItem(in.nextLine());
    }

    public static void updateItem() {
        System.out.println("Enter the item number: ");
        int index = in.nextInt();
        in.nextLine();
        System.out.println("Enter new item to be added");
        String myNewItem = in.nextLine();
        myTodoList.updateTodoList(index -1,myNewItem);

    }
    public static void removeItem() {
        System.out.println("Enter items to be deleted");
        int index = in.nextInt();
        in.nextLine();
        myTodoList.removeTodoList(index -1);
    }
    public static void searchItem() {
        System.out.println("Enter string to be search");
        String searchItem = in.nextLine();

        if (myTodoList.findItem(searchItem) == null) {
            System.out.println("Item not found ");
        } else {
            System.out.println(searchItem + " was found in your list ");
        }
    }
}
