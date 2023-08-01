package com.example.challenges.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.challenges.R;

public class DangKyHocLaiAdapter extends RecyclerView.Adapter<DangKyHocLaiAdapter.DangKyHocLaiViewHolder> {
    @NonNull
    @Override
    public DangKyHocLaiAdapter.DangKyHocLaiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dang_ky_hoc_lai,parent,false);
        return new DangKyHocLaiAdapter.DangKyHocLaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DangKyHocLaiAdapter.DangKyHocLaiViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DangKyHocLaiViewHolder extends RecyclerView.ViewHolder {
        public DangKyHocLaiViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
