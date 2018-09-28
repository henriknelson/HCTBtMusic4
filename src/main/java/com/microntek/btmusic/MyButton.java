package com.microntek.btmusic;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class MyButton extends FrameLayout {

    ImageView f29w;
    ImageView f30x;

    public static final int[] MyButtonAttributes = new int[]{R.attr.imgWidth, R.attr.imgHeight, R.attr.imgSrc, R.attr.imgSrc1, R.attr.imgSrc2, R.attr.imgWidth2, R.attr.imgHeight2};

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutParams layoutParams;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MyButtonAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 10);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, 10);
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId2 != 0) {
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            if (dimensionPixelSize3 == 0 || dimensionPixelSize4 == 0) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            } else {
                layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize4, 17);
            }
            this.f30x = new ImageView(context);
            this.f30x.setImageResource(resourceId2);
            this.f30x.setScaleType(ScaleType.FIT_XY);
            this.f30x.setDuplicateParentStateEnabled(true);
            this.f30x.setLayoutParams(layoutParams);
            addView(this.f30x);
        }
        layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2, 17);
        this.f29w = new ImageView(context);
        this.f29w.setImageResource(resourceId);
        this.f29w.setScaleType(ScaleType.FIT_XY);
        this.f29w.setDuplicateParentStateEnabled(true);
        this.f29w.setLayoutParams(layoutParams);
        addView(this.f29w);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.f29w.setAlpha(255);
            getBackground().setAlpha(255);
            return;
        }
        this.f29w.setAlpha(80);
        getBackground().setAlpha(80);
    }
}
