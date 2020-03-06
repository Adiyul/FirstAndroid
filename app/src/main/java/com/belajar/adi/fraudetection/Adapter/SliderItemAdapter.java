package com.belajar.adi.fraudetection.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.belajar.adi.fraudetection.Model.SliderItem;
import com.belajar.adi.fraudetection.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 2/22/2020.
 */

public class SliderItemAdapter extends RecyclerView.Adapter<SliderItemAdapter.SliderItemViewHolder> {

    private ArrayList<SliderItem> dataList;

    public SliderItemAdapter(ArrayList<SliderItem> dataList) {
        this.dataList = dataList;
    }

    @Override
    public SliderItemAdapter.SliderItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_berita, parent, false);
        return new SliderItemAdapter.SliderItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderItemAdapter.SliderItemViewHolder holder, int position) {
        holder.item_one.setImageDrawable(dataList.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class SliderItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView item_one;

        public SliderItemViewHolder(View itemView) {
            super(itemView);

            item_one = itemView.findViewById(R.id.img_item_one);
        }
    }
}
