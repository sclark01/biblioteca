package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

public class BibliotecaApp {
    private final PrintStream printStream;
    private List<Book> bookList;
    private final Menu menu;

    public BibliotecaApp(PrintStream printStream, BufferedReader bufferedReader, List<Book> listOfBooks){
        bookList = listOfBooks;
        this.printStream = printStream;
        menu = new Menu(printStream, bufferedReader, this);
    }

    public void start() {
        printStream.println("Welcome to the Biblioteca Library!");
        menu.showOptions();
        menu.respondToUserInput();
    }

    public void listBooks() {
        String output = "";
        for (Book book : bookList){
            output += book.getDetailsAsString() + "\n";
        }

        printStream.print(output);
    }



}
