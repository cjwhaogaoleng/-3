package com.example.myupapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.myViewHolder> {


    private List<Bean> upData;
    private Context context;

    public MyRecycleAdapter(List<Bean> upData, Context context) {
        this.upData = upData;
        this.context = context;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.updata_item_headandname, null);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tv.setText(upData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return upData == null ? 0 : upData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onRecycleItemClickListener(getAdapterPosition());
                    }
                }
            });

//            itemView.setOnLongClickListener(new View.OnLongClickListener() {
//                @Override
//                public boolean onLongClick(View v) {
//                    return true;
//                }
//            });
        }
    }
//dian ji
    private OnRecycleItemClickListener mOnItemClickListener;

    public void setRecycleItemClickListener(OnRecycleItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public interface OnRecycleItemClickListener {
        void onRecycleItemClickListener(int position);
    }


//chang an
//    private OnRecycleItemLongClickListener mOnItemLongClickListener;
//
//    public void setRecycleItemClickListener(OnRecycleItemLongClickListener mOnItemLongClickListener) {
//        this.mOnItemLongClickListener = mOnItemLongClickListener;
//    }
//
//    public interface OnRecycleItemLongClickListener {
//        void onRecycleItemLongClickListener(int position);
//    }


}
