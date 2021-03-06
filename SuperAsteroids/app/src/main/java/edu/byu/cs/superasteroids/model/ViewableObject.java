package edu.byu.cs.superasteroids.model;

/**
 * Created by Jk on 2/12/2016.
 * This class is used to store the image information for any of the various viewable objects in the
 * game.
 */
public class ViewableObject {
    String mImage;
    int mImageWidth, mImageHeight, mImageID;

    public ViewableObject() {
    }

    public ViewableObject(String image, int imageWidth, int imageHeight, int imageID) {
        mImage = image;
        mImageWidth = imageWidth;
        mImageHeight = imageHeight;
        mImageID = imageID;
    }

    public ViewableObject(String image, int imageWidth, int imageHeight) {
        mImage = image;
        mImageWidth = imageWidth;
        mImageHeight = imageHeight;
    }

    public ViewableObject(ViewableObject viewableInfo) {
        mImageID = viewableInfo.getImageID();
        mImage = viewableInfo.getImage();
        mImageHeight = viewableInfo.getImageHeight();
        mImageWidth = viewableInfo.getImageWidth();
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public int getImageWidth() {
        return mImageWidth;
    }

    public void setImageWidth(int imageWidth) {
        mImageWidth = imageWidth;
    }

    public int getImageHeight() {
        return mImageHeight;
    }

    public void setImageHeight(int imageHeight) {
        mImageHeight = imageHeight;
    }

    public int getImageID() {
        return mImageID;
    }

    public void setImageID(int imageID) {
        this.mImageID = imageID;
    }
}
