package logic_handle;

import entity.Post;
import run.MainRun;

import java.util.Scanner;

public class PostLogic {

    public static Post findPostById(int id) {
        Post post = null;
        for (int k = 0; k < MainRun.posts.length; k++) {
            if (MainRun.posts[k] != null && MainRun.posts[k].getId() == id) {
                post = MainRun.posts[k];
                break;
            }
        }
        return post;
    }

    public static void showPost() {
        for (int i = 0; i < MainRun.posts.length; i++) {
            if (MainRun.posts[i] != null) {
                System.out.println(MainRun.posts[i]);
            }
        }
    }

    public static void addNewPost() {
        System.out.print("Nhập số lượng bài viết muốn thêm: ");
        int postNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < postNum; i++) {
            Post post = new Post();
            post.inputInfo();
            savePost(post);
        }
        MainRun.countPost += postNum;
    }

    public static void savePost(Post post) {
        if (post == null) {
            return;
        }
        for (int i = 0; i < MainRun.posts.length; i++) {
            if (MainRun.posts[i] == null) {
                MainRun.posts[i] = post;
                break;
            }
        }
    }

}
