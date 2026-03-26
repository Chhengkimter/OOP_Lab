package Lab03;
import java.util.Scanner;

class User {
    private int userId;
    private String userName;
    private String email;
    private int subscribers;
    private int joinDate;

    public User(int userId, String userName, String email, int subscribers, int joinDate) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.subscribers = subscribers;
        this.joinDate = joinDate;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public int getJoinDate() {
        return joinDate;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }
    
    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }
    
}

class Video {
    private int videoId;
    private String title;
    private long views;
    private int likes;
    User uploader;

    public Video(int videoId, String title, long views, int likes, User uploader) {
        this.videoId = videoId;
        this.title = title;
        this.views = views;
        this.likes = likes;
        this.uploader = uploader;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getTitle() {
        return title;
    }

    public long getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }   

    public User getUploader() {
        return uploader;
    }
    
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setViews(long views) {
        this.views = views;
    }
    
    public void setLikes(int likes) {
        this.likes = likes;
    }
    
    public void setUploader(User uploader) {
        this.uploader = uploader;
    }
}

public class ex8_2 {
    public static void main(String[] args) {
        User user1 = new User(1, "Kry Rithisak", "sak@email.com", 1000, 2023);

        Video video1 = new Video(1, "Hello World", 1000000, 5000, user1);
        Video video2 = new Video(2, "Hello World 2", 2000000, 10000, user1);
        Video video3 = new Video(3, "Hello World 3", 3000000, 15000, user1);

        Video[] videos = {video1, video2, video3};
        for (Video video : videos) {
            System.out.println("Video ID: " + video.getVideoId());
            System.out.println("Title: " + video.getTitle());
            System.out.println("Views: " + video.getViews());
            System.out.println("Likes: " + video.getLikes());
            System.out.println("Uploader: " + video.getUploader().getUserName());
            System.out.println("Uploader ID: " + video.getUploader().getUserId());
            System.out.println("Uploader Email: " + video.getUploader().getEmail());
            System.out.println("Uploader Subscribers: " + video.getUploader().getSubscribers());
            System.out.println("Uploader Join Date: " + video.getUploader().getJoinDate());
            System.out.println();
        }
    }
}
