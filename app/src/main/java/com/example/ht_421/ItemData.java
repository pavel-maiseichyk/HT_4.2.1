package com.example.ht_421;

import android.graphics.drawable.Drawable;

public class ItemData {
    private Drawable image;
    private String text;
    private String subText;
    private Boolean isChecked;

    public ItemData(Drawable image, String text, String subText, Boolean isChecked) {
        this.image = image;
        this.text = text;
        this.subText = subText;
        this.isChecked = isChecked;
    }

    public Drawable getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public String getSubText() {
        return subText;
    }

    public boolean isChecked() {
        return isChecked;
    }

}
