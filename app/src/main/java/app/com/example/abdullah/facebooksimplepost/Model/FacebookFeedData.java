package app.com.example.abdullah.facebooksimplepost.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Abdullah on 07/27/2016.
 */
public class FacebookFeedData {
    @SerializedName("comments")
    private String comments;
    @SerializedName("likes")
    private String likes;
    @SerializedName("postImage")
    private String postImage;
    @SerializedName("postText")
    private String postText;
    @SerializedName("postTime")
    private String postTime;
    @SerializedName("postType")
    private String postType;
    @SerializedName("shares")
    private String shares;
    @SerializedName("userName")
    private String userName;
    @SerializedName("userPic")
    private String userPic;

    public String getComments() {
        return comments;
    }

    public String getLikes() {
        return likes;
    }

    public String getPostImage() {
        return postImage;
    }

    public String getPostText() {
        return postText;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getPostType() {
        return postType;
    }

    public String getShares() {
        return shares;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

}
/*
{
    "comments": "7 Comments",
    "likes": " Mohamed and 15 Others",
    "postImage": "https://scontent-mxp1-1.xx.fbcdn.net/t31.0-8/s960x960/13002569_1540212309616544_8029862815822088515_o.jpg",
    "postText": "Sometimes it needs something",
    "postTime": "15 minutes",
    "postType": 2,
    "shares": "20 Shares",
    "userName": "Ahmed Ali",
    "userPic": "https://scontent-mxp1-1.xx.fbcdn.net/v/t1.0-1/p320x320/12933086_1535637210074054_5807795911387928488_n.jpg?oh=04c9166ff9f37b9034c70c725e1b32f2&oe=5825ABC8"
}
*/