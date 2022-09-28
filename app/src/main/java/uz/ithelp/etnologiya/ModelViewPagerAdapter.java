package uz.ithelp.etnologiya.ui.gallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import uz.ithelp.etnologiya.MainActivity2;
import uz.ithelp.etnologiya.MainActivity3;
import uz.ithelp.etnologiya.R;

public class ModelViewPagerAdapter extends PagerAdapter {

    private List<ModelViewPager> modelViewPagerList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ModelViewPagerAdapter(List<ModelViewPager> modelViewPagerList, Context context) {
        this.modelViewPagerList = modelViewPagerList;

        this.context = context;
    }


    @Override
    public int getCount() {
        return modelViewPagerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.itemviewp,container,false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView title = view.findViewById(R.id.title);
        TextView desc = view.findViewById(R.id.desc);

        imageView.setImageResource(modelViewPagerList.get(position).getImage());
        title.setText(modelViewPagerList.get(position).getBouncher());
        desc.setText(modelViewPagerList.get(position).getDescription());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (modelViewPagerList.get(position).getBouncher().toLowerCase().startsWith("etnologiyaga") ||
                    modelViewPagerList.get(position).getBouncher().toLowerCase().startsWith("dunyo")

                ){

                        Intent intent = new Intent(context, MainActivity3.class);
                        intent.putExtra("data", modelViewPagerList.get(position).getUrl());
                        context.startActivity(intent);

                }
                else {
//
                    Intent intent = new Intent(context, MainActivity2.class);
                    intent.putExtra("swimmers", position+5);

                    context.startActivity(intent);
                }



            }
        });

        container.addView(view, 0);

        return view;


    }
}