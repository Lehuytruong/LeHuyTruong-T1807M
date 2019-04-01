package Assignment06;

import java.util.ArrayList;
import java.util.Scanner;


public class NewMain {
    static ArrayList<News> NewsList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static void menu(){
        System.out.println("1.Insert news");
        System.out.println("2.View list news");
        System.out.println("Average rate");
        System.out.println("Exit");
    }
    static void insertNew(){
        News news = new News();
        System.out.println("Input title: ");
        news.Title = sc.nextLine();
        System.out.println("Input publish date: ");
        news.PublishDate = sc.nextLine();
        System.out.println("Input publish author: ");
        news.Author = sc.nextLine();
        System.out.println("Input publish content: ");
        news.Content = sc.nextLine();
        System.out.println("Input 3 rates: ");
        for(int i = 0;i < news.RateList.length; i++){
            System.out.println("Input rate "+ (i + 1) + ":");
            news.RateList[i] = sc.nextInt();
        }
        NewsList.add(news);
    }
    static void viewListNews(){
        System.out.println("------List news: ");
        NewsList.forEach((news )-> {
            news.Display();
        });
        System.out.println("------");
    }
    static void averaRate(){
        System.out.println("------List news: ");
        NewsList.forEach((news )-> {
            news.Calculate();
            news.Display();
        });
        System.out.println("------");
    }

    public static void main(String args[]){
        int choice;
        menu();
        while (true){
            System.out.println("please choose an option:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    insertNew();
                    break;
                case  2:
                    viewListNews();
                    break;
                case 3:
                    averaRate();
                    break;
                case 4:
                    return;
            }
        }
    }
}

