package com.example.bloodbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrecyclerAdaptar extends RecyclerView.Adapter<DrecyclerAdaptar.ViewHolder> {

    Context context;
    ArrayList<DcontactModel> arrDcontents = new ArrayList<>();

    public DrecyclerAdaptar(DonorsList context, ArrayList<DcontactModel> arrDcontents) {
        this.context = context;
        this.arrDcontents = arrDcontents;
    }


    @NonNull
    @Override
    public DrecyclerAdaptar.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.d_contacts,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull DrecyclerAdaptar.ViewHolder holder, int position) {
        holder.name.setText(arrDcontents.get(position).name);
        holder.city.setText(arrDcontents.get(position).city);
        holder.dob.setText(arrDcontents.get(position).dob);
        holder.bGroup.setText(arrDcontents.get(position).bGroup);

    }

    @Override
    public int getItemCount() {
        return arrDcontents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, city, dob, bGroup;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textView3);
            city = itemView.findViewById(R.id.textView2);
            dob = itemView.findViewById(R.id.textView12);
            bGroup = itemView.findViewById(R.id.textView13);

        }
    }
}
