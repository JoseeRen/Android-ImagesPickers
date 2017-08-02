/*
 * Create on 2017-8-2 上午9:11
 * FileName: PicassoLoader.java
 * Author: Ren Yaowei
 * Blog: http://www.renyaowei.top
 * Email :renyaowei@foxmail.com
 */

package renyaowei.top.imageselector;

import android.content.Context;
import android.widget.ImageView;

import com.jaiky.imagespickers.ImageLoader;
import com.squareup.picasso.Picasso;

import java.io.File;

/**
 * Created by Mr_Shadow on 2017/8/2.
 */

public class PicassoLoader implements ImageLoader {
    @Override
    public void displayImage(Context context, final String path, ImageView imageView) {
        //load时  用new File()把图片再处理下，要不然不出预览图    Glide就没有这样的问题
        //并且还得设置resize  要不然的话会报异常  resize(800,800)值 越大预览显示越清晰
        Picasso.with(context)
                .load(new File(path))
                .placeholder(com.jaiky.imagespickers.R.drawable.global_img_default)
                .resize(800,800)
                .centerCrop()
                .into(imageView);
    }
}
