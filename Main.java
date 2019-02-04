//Kate Keil, project 1, task list, 2/3/19
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 5;
        int length = 10;
        String[] list = new String[length];

        while (choice != 0) {
            System.out.println("Please choose an option: " + "\r\n" + "(1) Add a task." + "\r\n" + "(2) Remove a task." + "\r\n" + "(3) Update a task." +
                    "\r\n" + "(4) List all tasks." + "\r\n" + "(0) Exit.");
            choice = input.nextInt();

            //add a new task
            if (choice == 1) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter a description of the task: ");
                String newTask = input2.nextLine();
                addTask(list, newTask);
            }

            //remove a task
            if (choice == 2) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Enter a description to remove a task: ");
                String s1 = input3.nextLine();
                removeTask(list, s1);
            }

            //update a task
            if (choice == 3) {
                Scanner input4 = new Scanner(System.in);
                System.out.println("Enter original task: ");
                String s2 = input4.nextLine();
                System.out.println("Enter new task: ");
                String s3 = input4.nextLine();
                updateTask(list, s2, s3);
            }

            //display task list
            if (choice == 4) {
                listTasks(list);

            }
        }
    }

    //add task method
    public static void addTask(String[] storage, String answer) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = answer;
                return;
            }
        }
    }


    //remove task method
    public static void removeTask(String[] storage, String s1){
        for(int i = 0; i < storage.length; i ++){
            storage[i] = null;
            return;
        }
    }

    //update task method
    public static void updateTask(String[] storage, String s1, String s2){
        for(int i = 0; i < storage.length; i ++){
            if(storage[i] == null) {
            }else if (storage[i].compareTo(s1) == 0){
                storage[i] = s2;
                return;
            }
        }
    }

    //display task list method
    public static void listTasks(String[] storage){
        for(int i = 0;  i < storage.length; i++){
            if(storage[i] != null){
                System.out.println(storage[i]);
            }
        }
    }

}



