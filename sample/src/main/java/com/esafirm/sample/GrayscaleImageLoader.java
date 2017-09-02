package com.esafirm.sample;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.esafirm.imagepicker.features.imageloader.ImageLoader;
import com.esafirm.imagepicker.features.imageloader.ImageType;

public class GrayscaleImageLoader implements ImageLoader {
    @Override
    public void loadImage(String path, ImageView imageView, ImageType imageType) {
        Glide.with(imageView.getContext())
                .asDrawable()
                .load(path)
                .apply(RequestOptions.bitmapTransform(new GrayscaleTransformation(imageView.getContext())))
                .into(imageView);
    }
}
