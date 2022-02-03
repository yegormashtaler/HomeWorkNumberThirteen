package main.java.org.ithillel.lessons;

import java.util.Objects;
import java.util.Scanner;

public class MainClass {
    public static String[] definitely;

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("""
                > Enter 1 to display dialogs in Russian

                > Enter 2 to display dialogues in Ukrainian

                > Enter 3 to display dialogues in English

                > Enter 4 to display dialogues in Spanish

                > Enter 5 to display dialogues in Italian""");

        String[] dialogOnRussianLanguage = {"> " + "0 - выход из системы, 1 - полный вывод полей классов Книга, Автор, Страна, 2 - поиск по старому и новому году, 3 - поиск по старому и новому цвету, 4 - поиск по старому и новому автору, 5 - поиск по старой и новой стране, 6 - поиск по новому и старому жанру, 7 - поиск по новой и старой обложке, 8 - поиск по новому и старому языку\n"};
        String[] dialogOnUkrainianLanguage = {"> " + "0 - вихід із системи, 1 - повний висновок полів класів Книга, Автор, Країна, 2 - пошук за старим і новим роком, 3 - пошук за старим і новим кольором, 4 - пошук за старим і новим автором, 5 - пошук по старій та новій країні, 6 - пошук за новим та старим жанром, 7 - пошук по новій та старій обкладинці, 8 - пошук по новій та старій мові\n"};
        String[] dialogOnEnglishLanguage = {"> " + "0 - logout, 1 - complete output of the fields of classes Book, Author, Country, 2 - search by old and new year, 3 - search by old and new color, 4 - search by old and new author , 5 - search old and new country, 6 - search new and old genre, 7 - search new and old cover, 8 - search new and old language\n"};
        String[] dialogOnSpanishLanguage = {"> " + "0 - cierre de sesión, 1 - salida completa de los campos de clase Libro, Autor, País, 2 - búsqueda por año antiguo y nuevo, 3 - búsqueda por color antiguo y nuevo, 4 - búsqueda por autor antiguo y nuevo, 5 - buscar país antiguo y nuevo, 6 - buscar género nuevo y antiguo, 7 - buscar portada nueva y antigua, 8 - buscar idioma nuevo y antiguo\n"};
        String[] dialogOnItalianLanguage = {"> " + "0 - logout, 1 - output completo dei campi di classe Libro, Autore, Paese, 2 - ricerca per vecchio e nuovo anno, 3 - ricerca per vecchio e nuovo colore, 4 - ricerca per vecchio e nuovo autore , 5 - cerca il vecchio e il nuovo paese, 6 - cerca il nuovo e il vecchio genere, 7 - cerca la nuova e la vecchia copertina, 8 - cerca la nuova e la vecchia lingua\n"};
        System.out.println();
        System.out.println("> " + "Enter the language number: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = getUserData(scanner);
        switch (userChoice) {
            case 1 -> definitely = dialogOnRussianLanguage;
            case 2 -> definitely = dialogOnUkrainianLanguage;
            case 4 -> definitely = dialogOnSpanishLanguage;
            case 5 -> definitely = dialogOnItalianLanguage;
            default -> definitely = dialogOnEnglishLanguage;
        }
        System.out.println();
        System.out.println(definitely[0]);
        Book bookOne1 = new Book();
        Author bookOne2 = new Author();
        Country bookOne3 = new Country();
        bookOne1.setName("War and Peace");
        bookOne2.setNewName("Washington Irving");
        bookOne1.setYear(1984);
        bookOne2.setNewYear(1965);
        bookOne1.setColor("blue");
        bookOne2.setNewColor("light");
        bookOne1.setAuthor(bookOne2);
        bookOne2.setNewAuthor("Stephen Crane");
        bookOne1.setCountry(bookOne3);
        bookOne3.setTitle("titleOne");
        bookOne3.setNewCountry("Japan");
        bookOne1.setGenre("epic");
        bookOne2.setNewGenre("lyrics");
        bookOne1.setTitle("bookOne");
        bookOne2.setNewTitle("newBookOne");
        bookOne1.setLanguage("日本");
        bookOne2.setNewLanguage("Български");

        Book bookTwo1 = new Book();
        Author bookTwo2 = new Author();
        Country bookTwo3 = new Country();
        bookTwo1.setName("Woe from Wit");
        bookTwo2.setNewName("Edgar Allan Poe");
        bookTwo1.setYear(1853);
        bookTwo2.setNewYear(1843);
        bookTwo1.setColor("red");
        bookTwo2.setNewColor("space");
        bookTwo1.setAuthor(bookTwo2);
        bookTwo2.setNewAuthor("Howard Pyle");
        bookTwo1.setCountry(bookTwo3);
        bookTwo3.setTitle("titleTwo");
        bookTwo3.setNewCountry("Italy");
        bookTwo1.setGenre("novel");
        bookTwo2.setNewGenre("romance");
        bookTwo1.setTitle("bookTwo");
        bookTwo2.setNewTitle("newBookTwo");
        bookTwo1.setLanguage("Italiano");
        bookTwo2.setNewLanguage("Lëtzebuergesch");

        Book bookThree1 = new Book();
        Author bookThree2 = new Author();
        Country bookThree3 = new Country();
        bookThree1.setName("Eugene Onegin");
        bookThree2.setNewName("Ambrose Bierce");
        bookThree1.setYear(1991);
        bookThree2.setNewYear(1833);
        bookThree1.setColor("black");
        bookThree2.setNewColor("camel");
        bookThree1.setAuthor(bookThree2);
        bookThree2.setNewAuthor("Emily Bronte");
        bookThree1.setCountry(bookThree3);
        bookThree3.setTitle("titleThree");
        bookThree3.setNewCountry("Britain");
        bookThree1.setGenre("poem");
        bookThree2.setNewGenre("tragicomedy");
        bookThree1.setTitle("bookThree");
        bookThree2.setNewTitle("newBookThree");
        bookThree1.setLanguage("British");
        bookThree2.setNewLanguage("Eesti keel");

        Book bookFour1 = new Book();
        Author bookFour2 = new Author();
        Country bookFour3 = new Country();
        bookFour1.setName("Wonderful Doctor");
        bookFour2.setNewName("William Shakespeare");
        bookFour1.setYear(1852);
        bookFour2.setNewYear(1845);
        bookFour1.setColor("yellow");
        bookFour2.setNewColor("pale chestnut");
        bookFour1.setAuthor(bookFour2);
        bookFour2.setNewAuthor("P.G.Wodehouse");
        bookFour1.setCountry(bookFour3);
        bookFour3.setTitle("titleFour");
        bookFour3.setNewCountry("Russia");
        bookFour1.setGenre("essay");
        bookFour2.setNewGenre("comedy");
        bookFour1.setTitle("bookFour");
        bookFour2.setNewTitle("newBookFour");
        bookFour1.setLanguage("Русский");
        bookFour2.setNewLanguage("ქართული");

        Book bookFive1 = new Book();
        Author bookFive2 = new Author();
        Country bookFive3 = new Country();
        bookFive1.setName("Hero of our time");
        bookFive2.setNewName("Jack London");
        bookFive1.setYear(1947);
        bookFive2.setNewYear(1945);
        bookFive1.setColor("green");
        bookFive2.setNewColor("olive");
        bookFive1.setAuthor(bookFive2);
        bookFive2.setNewAuthor("Johana Spy-ri");
        bookFive1.setCountry(bookFive3);
        bookFive3.setTitle("titleFive");
        bookFive3.setNewCountry("Ukraine");
        bookFive1.setGenre("story");
        bookFive2.setNewGenre("melodrama");
        bookFive1.setTitle("bookFive");
        bookFive2.setNewTitle("newBookFive");
        bookFive1.setLanguage("Український");
        bookFive2.setNewLanguage("Pilipinas");

        Book bookSix1 = new Book();
        Author bookSix2 = new Author();
        Country bookSix3 = new Country();
        bookSix1.setName("Moron");
        bookSix2.setNewName("Ray Bradbury");
        bookSix1.setYear(1966);
        bookSix2.setNewYear(1956);
        bookSix1.setColor("pink");
        bookSix2.setNewColor("magenta");
        bookSix1.setAuthor(bookSix2);
        bookSix2.setNewAuthor("Anna Sewell");
        bookSix1.setCountry(bookSix3);
        bookSix3.setTitle("titleSix");
        bookSix3.setNewCountry("Germany");
        bookSix1.setGenre("ode");
        bookSix2.setNewGenre("sonnet");
        bookSix1.setTitle("bookSix");
        bookSix2.setNewTitle("newBookSix");
        bookSix1.setLanguage("Deutsch");
        bookSix2.setNewLanguage("Română");

        Book bookSeven1 = new Book();
        Author bookSeven2 = new Author();
        Country bookSeven3 = new Country();
        bookSeven1.setName("Two oceans");
        bookSeven2.setNewName("O.Henry");
        bookSeven1.setYear(1917);
        bookSeven2.setNewYear(1963);
        bookSeven1.setColor("white");
        bookSeven2.setNewColor("lavender");
        bookSeven1.setAuthor(bookSeven2);
        bookSeven2.setNewAuthor("Robert Louis Stevenson");
        bookSeven1.setCountry(bookSeven3);
        bookSeven3.setTitle("titleSeven");
        bookSeven3.setNewCountry("France");
        bookSeven1.setGenre("drama");
        bookSeven2.setNewGenre("poetry");
        bookSeven1.setTitle("bookSeven");
        bookSeven2.setNewTitle("newBookSeven");
        bookSeven1.setLanguage("Francais");
        bookSeven2.setNewLanguage("Esperanto");

        Book bookEight1 = new Book();
        Author bookEight2 = new Author();
        Country bookEight3 = new Country();
        bookEight1.setName("Dead Souls");
        bookEight2.setNewName("Oscar Wilde");
        bookEight1.setYear(1956);
        bookEight2.setNewYear(1978);
        bookEight1.setColor("orange");
        bookEight2.setNewColor("jade");
        bookEight1.setAuthor(bookEight2);
        bookEight2.setNewAuthor("Frances Hodgson Burnett");
        bookEight1.setCountry(bookEight3);
        bookEight3.setTitle("titleEight");
        bookEight3.setNewCountry("Poland");
        bookEight1.setGenre("parable");
        bookEight2.setNewGenre("extravaganza");
        bookEight1.setTitle("bookEight");
        bookEight2.setNewTitle("newBookEight");
        bookEight1.setLanguage("Polanski");
        bookEight2.setNewLanguage("ਪੰਜਾਬੀ");

        Book bookNine1 = new Book();
        Author bookNine2 = new Author();
        Country bookNine3 = new Country();
        bookNine1.setName("Crime and Punishment");
        bookNine2.setNewName("Charles Dickens");
        bookNine1.setYear(1813);
        bookNine2.setNewYear(1946);
        bookNine1.setColor("gold");
        bookNine2.setNewColor("goldenrod");
        bookNine1.setAuthor(bookNine2);
        bookNine2.setNewAuthor("A.A.Milne");
        bookNine1.setCountry(bookNine3);
        bookNine3.setTitle("titleNine");
        bookNine3.setNewCountry("China");
        bookNine1.setGenre("vision");
        bookNine2.setNewGenre("verse-dialogue");
        bookNine1.setTitle("bookNine");
        bookNine2.setNewTitle("newBookNine");
        bookNine1.setLanguage("中国人");
        bookNine2.setNewLanguage("יידיש");

        Book bookTen1 = new Book();
        Author bookTen2 = new Author();
        Country bookTen3 = new Country();
        bookTen1.setName("Overcoat");
        bookTen2.setNewName("Jerome K.Jerome");
        bookTen1.setYear(1884);
        bookTen2.setNewYear(1909);
        bookTen1.setColor("silver spur");
        bookTen2.setNewColor("emerald");
        bookTen1.setAuthor(bookTen2);
        bookTen2.setNewAuthor("Hugh Lofting");
        bookTen1.setCountry(bookTen3);
        bookTen3.setTitle("titleTen");
        bookTen3.setNewCountry("Serbia");
        bookTen1.setGenre("sketch");
        bookTen2.setNewGenre("thought");
        bookTen1.setTitle("bookTen");
        bookTen2.setNewTitle("newBookTen");
        bookTen1.setLanguage("Sven-ska");
        bookTen2.setNewLanguage("Hmoob");
        Book[] booksArrayForOne = {bookOne1, bookTwo1, bookThree1, bookFour1, bookFive1, bookSix1, bookSeven1, bookEight1, bookNine1, bookTen1};
        Author[] bookArrayForTwo = {bookOne2, bookTwo2, bookThree2, bookFour2, bookFive2, bookSix2, bookSeven2, bookEight2, bookNine2, bookTen2};
        Country[] bookArrayForThree = {bookOne3, bookTwo3, bookThree3, bookFour3, bookFive3, bookSix3, bookSeven3, bookEight3, bookNine3, bookTen3};
        int userData = getUserData(scanner);
        switch (userData) {
            case 0 -> {
                System.out.println();
                System.out.println("> " + "Sorry, your choice was output from system...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
            }
            case 1 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getName(), "War and Peace")) || (Objects.equals(book.getName(), "Woe from Wit")) || (Objects.equals(book.getName(), "Eugene Onegin")) || (Objects.equals(book.getName(), "Wonderful Doctor")) || (Objects.equals(book.getName(), "Hero of our time")) ||
                            (Objects.equals(book.getName(), "Moron")) || (Objects.equals(book.getName(), "Two oceans")) || (Objects.equals(book.getName(), "Dead Souls")) || (Objects.equals(book.getName(), "Crime and Punishment")) || (Objects.equals(book.getName(), "Overcoat"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for name of published: " + book.getName());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewName(), "Washington Irving")) || (Objects.equals(author.getNewName(), "Edgar Allan Poe")) || (Objects.equals(author.getNewName(), "Ambrose Bierce")) || (Objects.equals(author.getNewName(), "William Shakespeare")) || (Objects.equals(author.getNewName(), "Jack London")) ||
                            (Objects.equals(author.getNewName(), "Ray Bradbury")) || (Objects.equals(author.getNewName(), "O.Henry")) || (Objects.equals(author.getNewName(), "Oscar Wilde")) || (Objects.equals(author.getNewName(), "Charles Dickens")) || (Objects.equals(author.getNewName(), "Jerome K.Jerome"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the author for new name of published: " + author.getNewName());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((author.getNewYear() == 1965) || (author.getNewYear() == 1843) || (author.getNewYear() == 1833) || (author.getNewYear() == 1845) || (author.getNewYear() == 1945) ||
                            (author.getNewYear() == 1956) || (author.getNewYear() == 1963) || (author.getNewYear() == 1978) || (author.getNewYear() == 1946) || (author.getNewYear() == 1909)) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new year of published: " + author.getNewYear());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewColor(), "light")) || (Objects.equals(author.getNewColor(), "space")) || (Objects.equals(author.getNewColor(), "camel")) || (Objects.equals(author.getNewColor(), "pale chestnut")) || (Objects.equals(author.getNewColor(), "olive")) ||
                            (Objects.equals(author.getNewColor(), "magenta")) || (Objects.equals(author.getNewColor(), "lavender")) || (Objects.equals(author.getNewColor(), "jade")) || (Objects.equals(author.getNewColor(), "goldenrod")) || (Objects.equals(author.getNewColor(), "emerald"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new color of published: " + author.getNewColor());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewAuthor(), "Stephen Crane")) || (Objects.equals(author.getNewAuthor(), "Howard Pyle")) || (Objects.equals(author.getNewAuthor(), "Emily Bronte")) || (Objects.equals(author.getNewAuthor(), "P.G.Wodehouse")) || (Objects.equals(author.getNewAuthor(), "Johana Spy-ri")) ||
                            (Objects.equals(author.getNewAuthor(), "Anna Sewell")) || (Objects.equals(author.getNewAuthor(), "Robert Louis Stevenson")) || (Objects.equals(author.getNewAuthor(), "Frances Hodgson Burnett")) || (Objects.equals(author.getNewAuthor(), "A.A.Milne")) || (Objects.equals(author.getNewAuthor(), "Hugh Lofting"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new author of published: " + author.getNewAuthor());
                    }
                }
                System.out.println();
                for (Country country : bookArrayForThree) {
                    if ((Objects.equals(country.getNewCountry(), "Japan")) || (Objects.equals(country.getNewCountry(), "Italy")) || (Objects.equals(country.getNewCountry(), "Britain")) || (Objects.equals(country.getNewCountry(), "Russia")) || (Objects.equals(country.getNewCountry(), "Ukraine")) ||
                            (Objects.equals(country.getNewCountry(), "Germany")) || (Objects.equals(country.getNewCountry(), "France")) || (Objects.equals(country.getNewCountry(), "Poland")) || (Objects.equals(country.getNewCountry(), "China")) || (Objects.equals(country.getNewCountry(), "Serbia"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the country for new country of published: " + country.getNewCountry());
                    }
                }
                System.out.println();
                for (Country country : bookArrayForThree) {
                    if ((Objects.equals(country.getTitle(), "titleOne")) || (Objects.equals(country.getTitle(), "titleTwo")) || (Objects.equals(country.getTitle(), "titleThree")) || (Objects.equals(country.getTitle(), "titleFour")) || (Objects.equals(country.getTitle(), "titleFive")) ||
                            (Objects.equals(country.getTitle(), "titleSix")) || (Objects.equals(country.getTitle(), "titleSeven")) || (Objects.equals(country.getTitle(), "titleEight")) || (Objects.equals(country.getTitle(), "titleNine")) || (Objects.equals(country.getTitle(), "titleTen"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the country for title of published: " + country.getTitle());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewGenre(), "lyrics")) || (Objects.equals(author.getNewGenre(), "romance")) || (Objects.equals(author.getNewGenre(), "tragicomedy")) || (Objects.equals(author.getNewGenre(), "comedy")) || (Objects.equals(author.getNewGenre(), "melodrama")) ||
                            (Objects.equals(author.getNewGenre(), "sonnet")) || (Objects.equals(author.getNewGenre(), "poetry")) || (Objects.equals(author.getNewGenre(), "extravaganza")) || (Objects.equals(author.getNewGenre(), "verse-dialogue")) || (Objects.equals(author.getNewGenre(), "thought"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new genre of published: " + author.getNewGenre());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewTitle(), "newBookOne")) || (Objects.equals(author.getNewTitle(), "newBookTwo")) || (Objects.equals(author.getNewTitle(), "newBookThree")) || (Objects.equals(author.getNewTitle(), "newBookFour")) || (Objects.equals(author.getNewTitle(), "newBookFive")) ||
                            (Objects.equals(author.getNewTitle(), "newBookSix")) || (Objects.equals(author.getNewTitle(), "newBookSeven")) || (Objects.equals(author.getNewTitle(), "newBookEight")) || (Objects.equals(author.getNewTitle(), "newBookNine")) || (Objects.equals(author.getNewTitle(), "newBookTen"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new title of published: " + author.getNewTitle());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewLanguage(), "Български")) || (Objects.equals(author.getNewLanguage(), "Lëtzebuergesch")) || (Objects.equals(author.getNewLanguage(), "Eesti keel")) || (Objects.equals(author.getNewLanguage(), "ქართული")) || (Objects.equals(author.getNewLanguage(), "Pilipinas")) ||
                            (Objects.equals(author.getNewLanguage(), "Română")) || (Objects.equals(author.getNewLanguage(), "Esperanto")) || (Objects.equals(author.getNewLanguage(), "ਪੰਜਾਬੀ")) || (Objects.equals(author.getNewLanguage(), "יידיש")) || (Objects.equals(author.getNewLanguage(), "Hmoob"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new language of published: " + author.getNewLanguage());
                    }
                }
            }
            case 2 -> {
                for (Book book : booksArrayForOne) {
                    if ((book.getYear() == 1984) || (book.getYear() == 1853) || (book.getYear() == 1991) || (book.getYear() == 1852) || (book.getYear() == 1946) ||
                            (book.getYear() == 1966) || (book.getYear() == 1917) || (book.getYear() == 1956) || (book.getYear() == 1813) || (book.getYear() == 1884)) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for year of published: " + book.getYear());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((author.getNewYear() == 1965) || (author.getNewYear() == 1843) || (author.getNewYear() == 1833) || (author.getNewYear() == 1845) || (author.getNewYear() == 1945) ||
                            (author.getNewYear() == 1956) || (author.getNewYear() == 1963) || (author.getNewYear() == 1978) || (author.getNewYear() == 1946) || (author.getNewYear() == 1909)) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new year of published: " + author.getNewYear());
                    }
                }
            }
            case 3 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getColor(), "blue")) || (Objects.equals(book.getColor(), "red")) || (Objects.equals(book.getColor(), "black")) || (Objects.equals(book.getColor(), "yellow")) || (Objects.equals(book.getColor(), "green")) ||
                            (Objects.equals(book.getColor(), "pink")) || (Objects.equals(book.getColor(), "white")) || (Objects.equals(book.getColor(), "orange")) || (Objects.equals(book.getColor(), "gold")) || (Objects.equals(book.getColor(), "silver spur"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for color of published: " + book.getColor());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewColor(), "light")) || (Objects.equals(author.getNewColor(), "space")) || (Objects.equals(author.getNewColor(), "camel")) || (Objects.equals(author.getNewColor(), "pale chestnut")) || (Objects.equals(author.getNewColor(), "olive")) ||
                            (Objects.equals(author.getNewColor(), "magenta")) || (Objects.equals(author.getNewColor(), "lavender")) || (Objects.equals(author.getNewColor(), "jade")) || (Objects.equals(author.getNewColor(), "goldenrod")) || (Objects.equals(author.getNewColor(), "emerald"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new color of published: " + author.getNewColor());
                    }
                }
            }
            case 4 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getAuthor(), "A.S.Pushkin")) || (Objects.equals(book.getAuthor(), "L.N.Tolstoy")) || (Objects.equals(book.getAuthor(), "M.Gorky")) || (Objects.equals(book.getAuthor(), "A.P.Chekhov")) || (Objects.equals(book.getAuthor(), "A.N.Tolstoy")) ||
                            (Objects.equals(book.getAuthor(), "N.V.Gogol")) || (Objects.equals(book.getAuthor(), "I.S.Turgenev")) || (Objects.equals(book.getAuthor(), "M.Yu.Vermonter")) || (Objects.equals(book.getAuthor(), "F.M.Dostoevsky")) || (Objects.equals(book.getAuthor(), "A.I.Uprising"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for author of published: " + book.getAuthor());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewAuthor(), "Stephen Crane")) || (Objects.equals(author.getNewAuthor(), "Howard Pyle")) || (Objects.equals(author.getNewAuthor(), "Emily Bronte")) || (Objects.equals(author.getNewAuthor(), "P.G.Wodehouse")) || (Objects.equals(author.getNewAuthor(), "Johana Spy-ri")) ||
                            (Objects.equals(author.getNewAuthor(), "Anna Sewell")) || (Objects.equals(author.getNewAuthor(), "Robert Louis Stevenson")) || (Objects.equals(author.getNewAuthor(), "Frances Hodgson Burnett")) || (Objects.equals(author.getNewAuthor(), "A.A.Milne")) || (Objects.equals(author.getNewAuthor(), "Hugh Lofting"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new author of published: " + author.getNewAuthor());
                    }
                }
            }
            case 5 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getCountry(), "Sesotho")) || (Objects.equals(book.getCountry(), "Cheva")) || (Objects.equals(book.getCountry(), "Cebuano")) || (Objects.equals(book.getCountry(), "Dansk")) || (Objects.equals(book.getCountry(), "မြန်မာ")) ||
                            (Objects.equals(book.getCountry(), "മലയാളം")) || (Objects.equals(book.getCountry(), "Zulu")) || (Objects.equals(book.getCountry(), "Lietuvių")) || (Objects.equals(book.getCountry(), "తెలుగు")) || (Objects.equals(book.getCountry(), "Oriya"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for country of published: " + book.getCountry());
                    }
                }
                System.out.println();
                for (Country country : bookArrayForThree) {
                    if ((Objects.equals(country.getNewCountry(), "Japan")) || (Objects.equals(country.getNewCountry(), "Italy")) || (Objects.equals(country.getNewCountry(), "Britain")) || (Objects.equals(country.getNewCountry(), "Russia")) || (Objects.equals(country.getNewCountry(), "Ukraine")) ||
                            (Objects.equals(country.getNewCountry(), "Germany")) || (Objects.equals(country.getNewCountry(), "France")) || (Objects.equals(country.getNewCountry(), "Poland")) || (Objects.equals(country.getNewCountry(), "China")) || (Objects.equals(country.getNewCountry(), "Serbia"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new country of published: " + country.getNewCountry());
                    }
                }
            }
            case 6 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getGenre(), "epic")) || (Objects.equals(book.getGenre(), "novel")) || (Objects.equals(book.getGenre(), "poem")) || (Objects.equals(book.getGenre(), "essay")) || (Objects.equals(book.getGenre(), "story")) ||
                            (Objects.equals(book.getGenre(), "ode")) || (Objects.equals(book.getGenre(), "drama")) || (Objects.equals(book.getGenre(), "parable")) || (Objects.equals(book.getGenre(), "vision")) || (Objects.equals(book.getGenre(), "sketch"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for genre of published: " + book.getGenre());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewGenre(), "lyrics")) || (Objects.equals(author.getNewGenre(), "romance")) || (Objects.equals(author.getNewGenre(), "tragicomedy")) || (Objects.equals(author.getNewGenre(), "comedy")) || (Objects.equals(author.getNewGenre(), "melodrama")) ||
                            (Objects.equals(author.getNewGenre(), "sonnet")) || (Objects.equals(author.getNewGenre(), "poetry")) || (Objects.equals(author.getNewGenre(), "extravaganza")) || (Objects.equals(author.getNewGenre(), "verse-dialogue")) || (Objects.equals(author.getNewGenre(), "thought"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new genre of published: " + author.getNewGenre());
                    }
                }
            }
            case 7 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getTitle(), "BookOne")) || (Objects.equals(book.getTitle(), "BookTwo")) || (Objects.equals(book.getTitle(), "BookThree")) || (Objects.equals(book.getTitle(), "BookFour")) || (Objects.equals(book.getTitle(), "BookFive")) ||
                            (Objects.equals(book.getTitle(), "BookSix")) || (Objects.equals(book.getTitle(), "bookSeven")) || (Objects.equals(book.getTitle(), "BookEight")) || (Objects.equals(book.getTitle(), "bookNine")) || (Objects.equals(book.getTitle(), "BookTen"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for title of published: " + book.getTitle());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewTitle(), "newBookOne")) || (Objects.equals(author.getNewTitle(), "newBookTwo")) || (Objects.equals(author.getNewTitle(), "newBookThree")) || (Objects.equals(author.getNewTitle(), "newBookFour")) || (Objects.equals(author.getNewTitle(), "newBookFive")) ||
                            (Objects.equals(author.getNewTitle(), "newBookSix")) || (Objects.equals(author.getNewTitle(), "newBookSeven")) || (Objects.equals(author.getNewTitle(), "newBookEight")) || (Objects.equals(author.getNewTitle(), "newBookNine")) || (Objects.equals(author.getNewTitle(), "newBookTen"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new title of published: " + author.getNewTitle());
                    }
                }
            }
            case 8 -> {
                for (Book book : booksArrayForOne) {
                    if ((Objects.equals(book.getLanguage(), "日本")) || (Objects.equals(book.getLanguage(), "Italiano")) || (Objects.equals(book.getLanguage(), "British")) || (Objects.equals(book.getLanguage(), "Русский")) || (Objects.equals(book.getLanguage(), "Український")) ||
                            (Objects.equals(book.getLanguage(), "Deutsch")) || (Objects.equals(book.getLanguage(), "Francais")) || (Objects.equals(book.getLanguage(), "Polanski")) || (Objects.equals(book.getLanguage(), "中国人")) || (Objects.equals(book.getLanguage(), "Sven-ska"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for language of published: " + book.getLanguage());
                    }
                }
                System.out.println();
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewLanguage(), "Български")) || (Objects.equals(author.getNewLanguage(), "Lëtzebuergesch")) || (Objects.equals(author.getNewLanguage(), "Eesti keel")) || (Objects.equals(author.getNewLanguage(), "ქართული")) || (Objects.equals(author.getNewLanguage(), "Pilipinas")) ||
                            (Objects.equals(author.getNewLanguage(), "Română")) || (Objects.equals(author.getNewLanguage(), "Esperanto")) || (Objects.equals(author.getNewLanguage(), "ਪੰਜਾਬੀ")) || (Objects.equals(author.getNewLanguage(), "יידיש")) || (Objects.equals(author.getNewLanguage(), "Hmoob"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new language of published: " + author.getNewLanguage());
                    }
                }
            }
            default -> {
                System.out.println();
                System.out.println("> " + "Dear Friend! You input incorrect data!");
                System.out.println();
                System.out.println("> " + "Please, try again after a while...");
            }
        }
        System.out.println();
        String[] newDialogOnRussianLanguage = {"> " + "0 - выход из системы, 1 - новый поиск по имени, 2 - новый поиск по году, 3 - новый поиск по цвету, 4 - новый поиск по автору, 5 - новый поиск по стране, 6 - новый поиск за жанром, 7 - новый поиск за обложкой, 8 - новый поиск по языку\n"};
        String[] newDialogOnUkrainianLanguage = {"> " + "0 - вихід із системи, 1 - новий пошук по імені, 2 - новий пошук за роком, 3 - новий пошук за кольором, 4 - новий пошук за автором, 5 - новий пошук по країні, 6 - новий пошук за жанром, 7 - новий пошук за обкладинкою, 8 - новий пошук з мови\n"};
        String[] newDialogOnEnglishLanguage = {"> " + "0 - exit from the system, 1 - new search for name, 2 - new search for rock, 3 - new search for color, 4 - new search for author, 5 - new search for country, 6 - new search for genre, 7 - new search for behind the lining, 8 - new search for a movie\n"};
        String[] newDialogOnSpanishLanguage = {"> " + "0 - cerrar sesión, 1 - nuevo buscar por nombre, 2 - nuevo buscar por año, 3 - nuevo buscar por color, 4 - nuevo buscar por autor, 5 - nuevo buscar por país, 6 - nuevo buscar por género, 7 - nuevo buscar detrás portada, 8 - nuevo buscar por idioma\n"};
        String[] newDialogOnItalianLanguage = {"> " + "0 - cerrar sesión, 1 - nuovo buscar por nombre, 2 - nuovo buscar por año, 3 - nuovo buscar por color, 4 - nuovo buscar por autor, 5 - nuovo buscar por país, 6 - nuovo buscar por género, 7 - nuovo buscar detrás portada, 8 - nuovo buscar por idioma\n"};
        System.out.println("> " + "Enter the language number and choose a new action: ");
        int userOption = getUserData(scanner);
        switch (userOption) {
            case 1 -> definitely = newDialogOnRussianLanguage;
            case 2 -> definitely = newDialogOnUkrainianLanguage;
            case 4 -> definitely = newDialogOnSpanishLanguage;
            case 5 -> definitely = newDialogOnItalianLanguage;
            default -> definitely = newDialogOnEnglishLanguage;
        }
        System.out.println();
        System.out.println(definitely[0]);
        int userSelection = getUserData(scanner);
        switch (userSelection) {
            case 0:
                System.out.println();
                System.out.println("> " + "Sorry, your choice was output from system...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
                break;
            case 1:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewName(), "Washington Irving")) || (Objects.equals(author.getNewName(), "Edgar Allan Poe")) || (Objects.equals(author.getNewName(), "Ambrose Bierce")) || (Objects.equals(author.getNewName(), "William Shakespeare")) || (Objects.equals(author.getNewName(), "Jack London")) ||
                            (Objects.equals(author.getNewName(), "Ray Bradbury")) || (Objects.equals(author.getNewName(), "O.Henry")) || (Objects.equals(author.getNewName(), "Oscar Wilde")) || (Objects.equals(author.getNewName(), "Charles Dickens")) || (Objects.equals(author.getNewName(), "Jerome K.Jerome"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new name of published: " + author.getNewName());
                    }
                }
                break;
            case 2:
                for (Author author : bookArrayForTwo) {
                    if ((author.getNewYear() == 1965) || (author.getNewYear() == 1843) || (author.getNewYear() == 1833) || (author.getNewYear() == 1845) || (author.getNewYear() == 1945) ||
                            (author.getNewYear() == 1956) || (author.getNewYear() == 1963) || (author.getNewYear() == 1978) || (author.getNewYear() == 1946) || (author.getNewYear() == 1909)) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new year of published: " + author.getNewYear());
                    }
                }
                break;
            case 3:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewColor(), "light")) || (Objects.equals(author.getNewColor(), "space")) || (Objects.equals(author.getNewColor(), "camel")) || (Objects.equals(author.getNewColor(), "pale chestnut")) || (Objects.equals(author.getNewColor(), "olive")) ||
                            (Objects.equals(author.getNewColor(), "magenta")) || (Objects.equals(author.getNewColor(), "lavender")) || (Objects.equals(author.getNewColor(), "jade")) || (Objects.equals(author.getNewColor(), "goldenrod")) || (Objects.equals(author.getNewColor(), "emerald"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new color of published: " + author.getNewColor());
                    }
                }
                break;
            case 4:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewAuthor(), "Stephen Crane")) || (Objects.equals(author.getNewAuthor(), "Howard Pyle")) || (Objects.equals(author.getNewAuthor(), "Emily Bronte")) || (Objects.equals(author.getNewAuthor(), "P.G.Wodehouse")) || (Objects.equals(author.getNewAuthor(), "Johana Spy-ri")) ||
                            (Objects.equals(author.getNewAuthor(), "Anna Sewell")) || (Objects.equals(author.getNewAuthor(), "Robert Louis Stevenson")) || (Objects.equals(author.getNewAuthor(), "Frances Hodgson Burnett")) || (Objects.equals(author.getNewAuthor(), "A.A.Milne")) || (Objects.equals(author.getNewAuthor(), "Hugh Lofting"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new author of published: " + author.getNewAuthor());
                    }
                }
                break;
            case 5:
                for (Country country : bookArrayForThree) {
                    if ((Objects.equals(country.getNewCountry(), "Japan")) || (Objects.equals(country.getNewCountry(), "Italy")) || (Objects.equals(country.getNewCountry(), "Britain")) || (Objects.equals(country.getNewCountry(), "Russia")) || (Objects.equals(country.getNewCountry(), "Ukraine")) ||
                            (Objects.equals(country.getNewCountry(), "Germany")) || (Objects.equals(country.getNewCountry(), "France")) || (Objects.equals(country.getNewCountry(), "Poland")) || (Objects.equals(country.getNewCountry(), "China")) || (Objects.equals(country.getNewCountry(), "Serbia"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new country of published: " + country.getNewCountry());
                    }
                }
                break;
            case 6:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewGenre(), "lyrics")) || (Objects.equals(author.getNewGenre(), "romance")) || (Objects.equals(author.getNewGenre(), "tragicomedy")) || (Objects.equals(author.getNewGenre(), "comedy")) || (Objects.equals(author.getNewGenre(), "melodrama")) ||
                            (Objects.equals(author.getNewGenre(), "sonnet")) || (Objects.equals(author.getNewGenre(), "poetry")) || (Objects.equals(author.getNewGenre(), "extravaganza")) || (Objects.equals(author.getNewGenre(), "verse-dialogue")) || (Objects.equals(author.getNewGenre(), "thought"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new genre of published: " + author.getNewGenre());
                    }
                }
                break;
            case 7:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewTitle(), "newBookOne")) || (Objects.equals(author.getNewTitle(), "newBookTwo")) || (Objects.equals(author.getNewTitle(), "newBookThree")) || (Objects.equals(author.getNewTitle(), "newBookFour")) || (Objects.equals(author.getNewTitle(), "newBookFive")) ||
                            (Objects.equals(author.getNewTitle(), "newBookSix")) || (Objects.equals(author.getNewTitle(), "newBookSeven")) || (Objects.equals(author.getNewTitle(), "newBookEight")) || (Objects.equals(author.getNewTitle(), "newBookNine")) || (Objects.equals(author.getNewTitle(), "newBookTen"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new title of published: " + author.getNewTitle());
                    }
                }
                break;
            case 8:
                for (Author author : bookArrayForTwo) {
                    if ((Objects.equals(author.getNewLanguage(), "Български")) || (Objects.equals(author.getNewLanguage(), "Lëtzebuergesch")) || (Objects.equals(author.getNewLanguage(), "Eesti keel")) || (Objects.equals(author.getNewLanguage(), "ქართული")) || (Objects.equals(author.getNewLanguage(), "Pilipinas")) ||
                            (Objects.equals(author.getNewLanguage(), "Română")) || (Objects.equals(author.getNewLanguage(), "Esperanto")) || (Objects.equals(author.getNewLanguage(), "ਪੰਜਾਬੀ")) || (Objects.equals(author.getNewLanguage(), "יידיש")) || (Objects.equals(author.getNewLanguage(), "Hmoob"))) {
                        System.out.println();
                        System.out.println("> " + "Your choice search the book for new language of published: " + author.getNewLanguage());
                    }
                }
                break;
            default:
                System.out.println();
                System.out.println("> " + "Dear Friend! You input incorrect data!");
                System.out.println();
                System.out.println("> " + "Please, try again after a while...");
                break;
        }
        scanner.close();
    }
}