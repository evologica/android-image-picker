package com.esafirm.imagepicker.features.imageloader;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.esafirm.imagepicker.R;

public class DefaultImageLoader implements ImageLoader {

    @Override
    public void loadImage(String path, ImageView imageView, ImageType imageType) {
        Glide.with(imageView.getContext())
                .asDrawable()
                .load(path)
                .apply(RequestOptions.placeholderOf(imageType == ImageType.FOLDER ? R.drawable.folder_placeholder : R.drawable.image_placeholder))
                .apply(RequestOptions.errorOf(imageType == ImageType.FOLDER ? R.drawable.folder_placeholder : R.drawable.image_placeholder))
                .into(imageView);
    }
}
