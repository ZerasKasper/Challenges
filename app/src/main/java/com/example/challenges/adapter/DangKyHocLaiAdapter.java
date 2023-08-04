package com.example.challenges.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challenges.R;
import com.example.challenges.model.DangKyHocLai;
import com.example.challenges.model.Notification;

import java.util.List;

public class DangKyHocLaiAdapter extends RecyclerView.Adapter<DangKyHocLaiAdapter.DangKyHocLaiViewHolder>{

    private List<DangKyHocLai> dangKyHocLais;

    public DangKyHocLaiAdapter(List<DangKyHocLai> dangKyHocLais) {
        this.dangKyHocLais = dangKyHocLais;
    }

    private DangKyHocLaiAdapter.OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(DangKyHocLaiAdapter.OnItemClickListener listener){
        this.onItemClickListener = listener;
    }
    public interface OnItemClickListener{
        void onItemClick(DangKyHocLai dangkyhoclai);
    }
    //-----
    public void updateData(List<DangKyHocLai> newData){
        dangKyHocLais.clear();
        dangKyHocLais.addAll(newData);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public DangKyHocLaiAdapter.DangKyHocLaiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dang_ky_hoc_lai,parent,false);

        //thêm sự kiện click vào itemView
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                if (position != RecyclerView.NO_POSITION && onItemClickListener != null){
                    onItemClickListener.onItemClick(dangKyHocLais.get(position));
                }
            }
        });
        return new DangKyHocLaiAdapter.DangKyHocLaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DangKyHocLaiAdapter.DangKyHocLaiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dangKyHocLais.size();
    }


    public class DangKyHocLaiViewHolder extends RecyclerView.ViewHolder {
        public DangKyHocLaiViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
