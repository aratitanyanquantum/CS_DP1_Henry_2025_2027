package lesson_2026_04_17;

import java.util.Random;

class Comment {
    private String comment;
    private User author;

    public Comment(String comment, User author) {
        this.comment = comment;
        this.author = author;
    }

    public String getComment() { return comment; }
    public User getAuthor() { return author; }
}

class Post {
    private Comment[] comments;
    private int likeCount;
    private int commentCount;

    public Post() {
        this.comments = new Comment[10];
        this.likeCount = 0;
        this.commentCount = 0;
    }

    public Comment[] getComments() { return comments; }
    public int getLikeCount() { return likeCount; }

    public void newComment(String text, User author) {
        if (commentCount < 10) {
            comments[commentCount] = new Comment(text, author);
            commentCount++;
        }
    }

    public void newLike() {
        likeCount++;
    }
}

class TextMessage extends Post {
    private String message;

    public TextMessage(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}

class PictureMessage extends Post {
    private String pictureURL;

    public PictureMessage(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getPictureURL() { return pictureURL; }
    public void setPictureURL(String pictureURL) { this.pictureURL = pictureURL; }
}

class VideoMessage extends Post {
    private String youtubeLink;

    public VideoMessage(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public String getYoutubeLink() { return youtubeLink; }
    public void setYoutubeLink(String youtubeLink) { this.youtubeLink = youtubeLink; }
}

class User {
    private String username;
    private String displayName;
    private String profilePic;
    private Post[] posts;
    private int postCount;

    public User(String username, String displayName, String profilePic) {
        this.username = username;
        this.displayName = displayName;
        this.profilePic = profilePic;
        this.posts = new Post[10];
        this.postCount = 0;
    }

    public void newTextMessage(String message) {
        if (postCount < 10) {
            posts[postCount] = new TextMessage(message);
            postCount++;
        }
    }

    public void newPictureMessage(String pictureURL) {
        if (postCount < 10) {
            posts[postCount] = new PictureMessage(pictureURL);
            postCount++;
        }
    }

    public void newVideoMessage(String youtubeLink) {
        if (postCount < 10) {
            posts[postCount] = new VideoMessage(youtubeLink);
            postCount++;
        }
    }

    public int getPostCount() { return postCount; }
    public Post getPost(int i) { return posts[i]; }

    public void newComment(int i, String text, User author) {
        posts[i].newComment(text, author);
    }

    public void newLike(int i) {
        posts[i].newLike();
    }
}

public class homework2 {
    public static void main(String[] args) {
        User frodo = new User("frodo", "Frodo Baggins", "frodo.png");
        User gandalf = new User("gandalf", "Gandalf the Grey", "gandalf.png");
        User samwise = new User("samwise", "Samwise Gamgee", "samwise.png");
        User aragorn = new User("aragorn", "Aragorn", "aragorn.png");

        frodo.newTextMessage("Just finished my quest to destroy the One Ring. What an adventure! #MissionAccomplished #RingBearer");
        frodo.newPictureMessage("Pic of me after the quest! #MountDoom #Mordor");
        aragorn.newTextMessage("Reunited with my love, Arwen. Forever grateful for her love and support. #Elessar #LoveAndDestiny");
        gandalf.newVideoMessage("Just having some fun with my staff and showing off a little wizardry on the dance floor! #GandalfTheDancer #WizardGrooves");

        frodo.newComment(0, "Mr. Frodo! I'm so proud of you! You're the bravest hobbit I know. #TrueFriendship #HobbitHeroes", samwise);
        frodo.newComment(0, "Frodo, you have my gratitude and respect. Your sacrifice has saved Middle-earth. #KingOfGondor #HeroicDeeds", aragorn);
        frodo.newComment(0, "Well done, Frodo! You've shown incredible strength and determination. The world is safer because of you. #RingDestroyer #WizardPride", gandalf);
        frodo.newComment(1, "Who's that great looking bloke next to you?", samwise);
        frodo.newComment(1, "Amazing!", aragorn);
        aragorn.newComment(0, "Aragorn, may your love with Arwen be as enduring as the light of the Silmarils. #LoveAndHope #FellowshipForever", frodo);
        aragorn.newComment(0, "Aragorn, you have found true love. Cherish it always. #Shieldmaiden #HappilyEverAfter", gandalf);
        gandalf.newComment(0, "Love it! #WizardsCanDance", frodo);
        gandalf.newComment(0, "rofl", samwise);

        frodo.newLike(1);
        frodo.newLike(1);
        aragorn.newLike(0);

        Random random = new Random();
        int randomNumber = random.nextInt(1001) + 1000;
        for (int i = 0; i < randomNumber; i++) {
            gandalf.newLike(0);
        }
    }
}