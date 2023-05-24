package com.cadpur.cadpurnlineseba.Model;

public class VideoDescription {
    private String videoName;
    private String videoId;
    private String videoDescription;

    public VideoDescription(String videoId, String videoName, String videoDescription) {
        this.videoName = videoName;
        this.videoId = videoId;
        this.videoDescription = videoDescription;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getVideoDescription() {
        return videoDescription;
    }
}
