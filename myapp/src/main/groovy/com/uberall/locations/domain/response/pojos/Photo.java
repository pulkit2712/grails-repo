package com.uberall.locations.domain.response.pojos;
import java.util.Date;

public class Photo{


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getRepoKey() {
        return repoKey;
    }

    public void setRepoKey(String repoKey) {
        this.repoKey = repoKey;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Object identifier) {
        this.identifier = identifier;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    public Object getCropHeight() {
        return cropHeight;
    }

    public void setCropHeight(Object cropHeight) {
        this.cropHeight = cropHeight;
    }

    public Object getCropWidth() {
        return cropWidth;
    }

    public void setCropWidth(Object cropWidth) {
        this.cropWidth = cropWidth;
    }

    public Object getCropOffsetX() {
        return cropOffsetX;
    }

    public void setCropOffsetX(Object cropOffsetX) {
        this.cropOffsetX = cropOffsetX;
    }

    public Object getCropOffsetY() {
        return cropOffsetY;
    }

    public void setCropOffsetY(Object cropOffsetY) {
        this.cropOffsetY = cropOffsetY;
    }

    private int id;
    private Date dateCreated;
    private String repoKey;
    private int locationId;
    private Object description;
    private Object identifier;
    private boolean main;
    private boolean logo;
    private String type;
    private String url;
    private String publicUrl;
    private Object cropHeight;
    private Object cropWidth;
    private Object cropOffsetX;
    private Object cropOffsetY;
}
