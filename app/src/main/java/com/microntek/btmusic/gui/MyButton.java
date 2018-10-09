package com.microntek.btmusic.gui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.microntek.btmusic.R;

public class MyButton extends FrameLayout {
    ImageView mBottomImageView;
    ImageView mTopImageView;

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs){
        super(context,attrs);
        initAttributes(context,attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
        initAttributes(context,attrs);
    }


    private void initAttributes(Context context, AttributeSet attrs) {
        LayoutParams layoutParams;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MyButton);

        Drawable bottomDrawable = obtainStyledAttributes.getDrawable(R.styleable.MyButton_imgSrc);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MyButton_imgWidth, 10);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MyButton_imgHeight, 10);

        Drawable topDrawable = obtainStyledAttributes.getDrawable(R.styleable.MyButton_imgSrc2);
        if (topDrawable != null) {
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MyButton_imgWidth2, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MyButton_imgHeight2, 0);
            if (dimensionPixelSize3 == 0 || dimensionPixelSize4 == 0) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            } else {
                layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize4, 17);
            }
            this.mTopImageView = new ImageView(context);
            this.mTopImageView.setImageDrawable(topDrawable);
            this.mTopImageView.setScaleType(ScaleType.FIT_XY);
            this.mTopImageView.setDuplicateParentStateEnabled(true);
            this.mTopImageView.setLayoutParams(layoutParams);
            addView(this.mTopImageView);
        }
        layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2, 17);
        this.mBottomImageView = new ImageView(context);
        this.mBottomImageView.setImageDrawable(bottomDrawable);
        this.mBottomImageView.setScaleType(ScaleType.FIT_XY);
        this.mBottomImageView.setDuplicateParentStateEnabled(true);
        this.mBottomImageView.setLayoutParams(layoutParams);
        addView(this.mBottomImageView);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.mBottomImageView.setAlpha(255);
        } else {
            this.mBottomImageView.setAlpha(50);
        }
    }
}
