package logic;

import entity.Article;

import main.MainRun;

import java.util.Scanner;

public class ArticleHandle {
    public static void inputNewArticle() {
        System.out.print("Xin mời nhập số kiểu bài viết muốn thêm mới: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập thông tin kiểu bài thứ " + (i + 1));
            Article article= new Article();
            article.inputInfo();
            saveArticle(article);
        }
    }

    public static void saveArticle(Article article) {
        for (int i = 0; i < MainRun.articles.length; i++) {
            if (MainRun.articles[i] == null) {
                MainRun.articles[i] = article;
                return;
            }
        }
    }

    public static void showArticle() {
        for (int i = 0; i < MainRun.articles.length; i++) {
            if (MainRun.articles[i] == null) {

                continue;
            }
            System.out.println(MainRun.articles[i]);
        }
    }

//    public static int isEmptyArticle() {
//        int count = 0;
//        for (int i = 0; i < MainRun.articles.length; i++) {
//            if (MainRun.articles[i] == null) {
//                break;
//            }
//            count += 1;
//        }
//        return count;
//    }
}
