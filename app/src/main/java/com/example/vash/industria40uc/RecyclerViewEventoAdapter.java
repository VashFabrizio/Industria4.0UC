package com.example.vash.industria40uc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewEventoAdapter extends RecyclerView.Adapter<RecyclerViewEventoAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvFecha,tvHora,tvEvento;
        public ViewHolder(View itemView) {
            super(itemView);
            tvFecha=itemView.findViewById(R.id.tvFechaI);
            tvHora=itemView.findViewById(R.id.tvHoraI);
            tvEvento=itemView.findViewById(R.id.tvEventoI);
        }
    }

    public List<Evento> listaeventos;
    public RecyclerViewEventoAdapter(List<Evento> eventos)
    {
        this.listaeventos=eventos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_agenda,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvFecha.setText(String.valueOf(listaeventos.get(position).getFecha()));
        holder.tvHora.setText(String.valueOf(listaeventos.get(position).getHora()));
        holder.tvEvento.setText(listaeventos.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return listaeventos.size();
    }

}
