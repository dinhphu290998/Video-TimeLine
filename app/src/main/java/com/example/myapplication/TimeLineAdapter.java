package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TimeLineAdapter extends RecyclerView.Adapter <TimeLineAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> times;

    public TimeLineAdapter(Context context, ArrayList<String> times) {
        this.context = context;
        this.times = times;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.timeline_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return 59;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView timeTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
        }

        public void bindData(int posision) {
            timeTextView.setText(posision + ":00");
        }
    }
}
