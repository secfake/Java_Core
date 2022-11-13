package logic_handle;

import entity.Post;
import entity.PostDetail;
import entity.PostManagement;
import entity.Writer;
import run.MainRun;

import java.util.Scanner;

public class PostManagementLogic {

    public static void addNewPostManagement() {
        if (!checkPostAndWriters()) {
            System.out.println("Chưa có dữ liệu về post và writer");
            return;
        }
        System.out.print("Lập bảng tính công cho bao nhiêu phóng viên: ");
        int writerNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < writerNumber; i++) {
            System.out.println("Nhập thông tin tính công cho phóng viên thứ " + (i + 1));
            System.out.print("Nhập mã phóng viên muốn tính công: ");
            Writer writer;
            int writerId;
            do {
                writerId = new Scanner(System.in).nextInt();
                writer = WriterLogic.findWriterById(writerId);
                if (writer != null) {
                    break;
                }
                System.out.print("Không có phóng viên nào mang mã " + writerId + " trog hệ thống, vui lòng nhập lại: ");
            } while (true);
            System.out.print("Nhập số lượng loại bài viết mà phóng viên này đã viết: ");
            int postNumber = 0;
            do {
                postNumber = new Scanner(System.in).nextInt();
                if (postNumber > 0 && postNumber <= 5 && postNumber <= MainRun.countPost) {
                    break;
                }
                System.out.print("Số loại bài viết trong 1 tháng không được vượt quá 5 và không được vượt quá loại trong hệ thống, nhập lại: ");
            } while (true);
            PostDetail[] postDetails = new PostDetail[postNumber];
            int count = 0;
            int total = 0;
            for (int j = 0; j < postNumber; j++) {
                System.out.println("Nhập thông tin thể loại bài thứ " + (j + 1) + " mà phóng viên " + writer.getName() + " đã viết: ");
                System.out.print("Nhập id của loại bài viết thứ " + (j + 1) + ": ");
                Post post;
                int postId;
                do {
                    postId = new Scanner(System.in).nextInt();
                    post = PostLogic.findPostById(postId);
                    if (post == null) {
                        System.out.print("Không có bài viết nào mang mã " + postId + " trog hệ thống, vui lòng nhập lại: ");
                        continue;
                    }
                    boolean daNhapLoaiBaiNayHayChua = false;
                    for (int k = 0; k < postDetails.length; k++) {
                        if (postDetails[k] != null && postDetails[k].getPost().getId() == postId) {
                            daNhapLoaiBaiNayHayChua = true;
                            break;
                        }
                    }
                    if (!daNhapLoaiBaiNayHayChua) {
                        break;
                    }
                    System.out.print("Loại bài này bạn vừa mới nhập xong, nhập loại khác đi: ");
                } while (true);
                System.out.print("Nhập số lượng bài ở thể này đã viết: ");
                int quantity = new Scanner(System.in).nextInt();
                postDetails[count] = new PostDetail(post, quantity);
                total += quantity;
//                postDetails[count].setPost(post);
//                postDetails[count].setQuantity(quantity);
                count++;
            }
            PostManagement postManagement = new PostManagement(writer, postDetails);
            postManagement.setTotalPost(total);
            savePostManagement(postManagement);
        }
    }

    private static boolean checkPostAndWriters() {
        boolean isValidPost = false;
        for (int i = 0; i < MainRun.posts.length; i++) {
            if (MainRun.posts[i] != null) {
                isValidPost = true;
                break;
            }
        }

        boolean isValidWriter = false;
        for (int i = 0; i < MainRun.writers.length; i++) {
            if (MainRun.writers[i] != null) {
                isValidWriter = true;
                break;
            }
        }
        return isValidPost && isValidWriter;

    }

    private static void savePostManagement(PostManagement postManagement) {
        for (int i = 0; i < MainRun.postManagements.length; i++) {
            if (MainRun.postManagements[i] == null) {
                MainRun.postManagements[i] = postManagement;
                break;
            }
        }
    }

    public static void showPostManagement() {
        for (int i = 0; i < MainRun.postManagements.length; i++) {
            if (MainRun.postManagements[i] != null) {
                System.out.println(MainRun.postManagements[i]);
            }
        }
    }

    public static void sortByWriterName() {
        for (int i = 0; i < MainRun.postManagements.length - 1; i++) {
            PostManagement post1 = MainRun.postManagements[i];
            if (post1 == null) {
                continue;
            }
            for (int j = i + 1; j < MainRun.postManagements.length; j++) {
                PostManagement post2 = MainRun.postManagements[j];
                if (post2 == null) {
                    continue;
                }
                if (post1.getWriter().getName().compareTo(post2.getWriter().getName()) > 1) {
                    PostManagement temp = post1;
                    post1 = post2;
                    post2 = temp;
                }
            }
        }
    }

    public static void sortByPostNumber() {
        // tính tổng số lượng loại bài viết mà 1 phóng viên đã viết
//        for (int i = 0; i < MainRun.postManagements.length; i++) {
//            PostManagement postManagement = MainRun.postManagements[i];
//            PostDetail[] postDetails = postManagement.getPostDetails();
//            int total = 0;
//            for (int j = 0; j < postDetails.length; j++) {
//                total += postDetails[j].getQuantity();
//            }
//            postManagement.setTotalPost(total);
//        }

        for (int i = 0; i < MainRun.postManagements.length - 1; i++) {
            PostManagement post1 = MainRun.postManagements[i];
            if (post1 == null) {
                continue;
            }
            for (int j = i + 1; j < MainRun.postManagements.length; j++) {
                PostManagement post2 = MainRun.postManagements[j];
                if (post2 == null) {
                    continue;
                }
                if (post1.getTotalPost() < post2.getTotalPost()) {
                    PostManagement temp = post1;
                    post1 = post2;
                    post2 = temp;
                }
            }
        }
//        Arrays.asList(MainRun.postManagements).sort(Comparator.comparingInt(PostManagement::getTotalPost));

    }

    public static void calculateSalary() {
        for (int i = 0; i < MainRun.postManagements.length; i++) {
            if (MainRun.postManagements[i] == null) {
                continue;
            }
            double salary = 0;
            Writer writer = MainRun.postManagements[i].getWriter();
            PostDetail[] postDetails = MainRun.postManagements[i].getPostDetails();
            for (int j = 0; j < postDetails.length; j++) {
                salary += postDetails[j].getPost().getPrice() * postDetails[j].getQuantity();
            }
            System.out.println("Lương của phóng viên " + writer.getName() + " là " + salary);
        }
    }
}
