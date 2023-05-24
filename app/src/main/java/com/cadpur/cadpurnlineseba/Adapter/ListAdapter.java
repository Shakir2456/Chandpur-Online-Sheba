package com.cadpur.cadpurnlineseba.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cadpur.cadpurnlineseba.Model.VideoDescription;
import com.cadpur.cadpurnlineseba.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListAdapterHolder>{
    private Context context;
    private ArrayList<VideoDescription> list;
    private OnItemClickListener onItemClickListener;
    public interface OnItemClickListener{
        public void onClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener=onItemClickListener;
    }

    public ListAdapter(Context context, ArrayList<VideoDescription> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ListAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ListAdapter.ListAdapterHolder(itemView,onItemClickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapterHolder holder, int position) {
        VideoDescription videoDescription=list.get(position);
        holder.videoName.setText(videoDescription.getVideoName());
        holder.videoDescription.setText(videoDescription.getVideoDescription());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListAdapterHolder extends RecyclerView.ViewHolder{
        private TextView videoName,videoDescription;
        public ListAdapterHolder(@NonNull View itemView, OnItemClickListener onItemClickListener) {
            super(itemView);
            videoName=itemView.findViewById(R.id.videoNameId);
            videoDescription=itemView.findViewById(R.id.videoDescriptionId);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClickListener.onClick(getAdapterPosition());
                }
            });
        }
    }
}
