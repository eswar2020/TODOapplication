package com.company;

import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> todoList = new ArrayList<String>();

    //Add items
    public void addItem(String item) {
        todoList.add(item);
    }

    // Remove Items
    public void removeTodoList(int index) {
        String myItem = todoList.get(index);
        todoList.remove(index);
    }

    //Print the entire List
    public void printTodoList() {
        System.out.println("todo list items consists of " + todoList.size() + " items");
        for (int i = 0; i <todoList.size() ; i++) {
            System.out.println("items position " + ( i + 1 ) + " is " + todoList.get(i));
        }
    }
    
    //Update the list
    public void updateTodoList(int index,String list) {
        todoList.set(index,list);
        System.out.println("update completion at index " + index +1);
    }

    //Search feature for user
    public String findItem(String SearchItem){
        int index = todoList.indexOf(SearchItem);

        if (index == -1) {
            return null;
        } else {
            return todoList.get(index);
        }
    }
}
