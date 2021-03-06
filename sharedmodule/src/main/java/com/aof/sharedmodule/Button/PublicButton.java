package com.aof.sharedmodule.Button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

import com.aof.sharedmodule.R;

public class PublicButton extends AppCompatButton {

    public PublicButton(Context context, @Nullable AttributeSet attrs){
        super(context,attrs);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.QwertButton);
        setButtonIndex(array.getInt(R.styleable.QwertButton_button_index,-1));
        setButtonName(array.getString(R.styleable.QwertButton_button_name));
        array.recycle();
    }
    private int button_index;
    private String button_name;

    public int getButtonIndex() { return button_index; }
    public void setButtonIndex(int buttonIndex) { button_index = buttonIndex; }
    public String getButtonName() { return button_name; }
    public void setButtonName(String buttonName) { button_name = buttonName; }
}
