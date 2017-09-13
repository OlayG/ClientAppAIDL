package com.example.admin.serverappaidl.adapter;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.serverappaidl.Event;
import com.example.admin.serverappaidl.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Admin on 9/11/2017.
 */

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {

    List<Event> events = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tvEventName.setText(events.get(position).getName().getText());
        holder.tvEventDescription.setText(events.get(position).getDescription().getText());
        Picasso.with(holder.itemView.getContext())
                .load(events.get(position).getUrl())
                .fit()
                .centerCrop()
                .into(holder.ivEventImage);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivEventImage)
        AppCompatImageView ivEventImage;
        @BindView(R.id.tvEventName)
        AppCompatTextView tvEventName;
        @BindView(R.id.tvEventDescription)
        AppCompatTextView tvEventDescription;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
