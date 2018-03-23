package helloworld.demo.com.recyclerview;

import android.graphics.Bitmap;

/**
 * Created by shyamramesh on 03/02/18.
 */

public class Model  {

    private Bitmap image;
    private String text;
    private Boolean checkImage = null;
    private Boolean checkString = null;
    public Model(Bitmap image,String text)
    {
      this.image = image;
      this.text = text;
    }

    public Model(Bitmap image) {
        this.image = image;

    }

    public Model() {

    }


    public Model(String text) {
        this.text = text;

    }




    //SETTER METHODS
    public void setImage(Bitmap image) {
        this.image = image;

    }

    public void setText(String text) {
        this.text = text;
    }



    //GETTER METHODS
    public Bitmap getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public Bitmap getBitMapValue() {
        return image;
    }

    public String getTextValue() {
        return text;
    }

//
//    public Boolean getSender()
//    {
//        return isSender;
//    }
//
//    public void setSender(Boolean sender)
//    {
//        isSender  = sender;
//    }

    public Boolean IfImage()
    {
        return checkImage;
    }

    public void settingImage(Boolean img)
    {
        checkImage = img;

    }

    public Boolean IfText()
    {
        return checkString;
    }

    public void settingString(Boolean txt)
    {
        checkString = txt;

    }

}
