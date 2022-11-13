package entity;

import java.util.Arrays;

public class PostManagement {

    private Writer writer;
    private PostDetail[] postDetails;
    private int totalPost;

    public PostManagement(Writer writer, PostDetail[] postDetails) {
        this.writer = writer;
        this.postDetails = postDetails;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public PostDetail[] getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(PostDetail[] postDetails) {
        this.postDetails = postDetails;
    }

    public int getTotalPost() {
        return totalPost;
    }

    public void setTotalPost(int totalPost) {
        this.totalPost = totalPost;
    }

    @Override
    public String toString() {
        return "PostManagement{" +
                "writer=" + writer +
                ", postDetails=" + Arrays.toString(postDetails) +
                '}';
    }
}
