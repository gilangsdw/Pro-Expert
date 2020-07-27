package com.example.proexpert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter (Context context) {

        this.context = context;
    }

    //Arrays
    public int[] slide_image = {

            R.drawable.star,
            R.drawable.route,
            R.drawable.timer1
    };

    public String[] slide_heading = {

            "KUALITAS TERJAMIN",
            "TERJANGKAU",
            "HEMAT WAKTU"
    };

    public String[] slide_desc = {

            "Kami bekerjasama dengan berbagai perusahaan yang menyediakan barang yang kualitasnya terjamin.",
            "Kami bisa menjangkau tempat anda dan menyediakan kebutuhan pembangunan anda sesuai dengan kapabilitas perusahaan kami.",
            "Dengan fasilitas yang kami sediakan konsumen hanya tinggal memesan berbagai macam layanan agar dapat menghemat waktu."
    };

    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);


        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_image[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
