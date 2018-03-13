
package com.demo.aaa.retorfit.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue {

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("rating")
    @Expose
    private Double rating;

    @SerializedName("storeId")
    @Expose
    private String storeId;

    @SerializedName("location")
    @Expose
    private Location location;

    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }



    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "url='" + url + '\'' +
                ", rating=" + rating +
                ", storeId='" + storeId + '\'' +
                ", location=" + location +
                ", photos=" + photos +
                '}';
    }
}
