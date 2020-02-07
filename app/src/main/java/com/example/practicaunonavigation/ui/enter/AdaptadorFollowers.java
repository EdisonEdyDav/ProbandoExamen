package com.example.practicaunonavigation.ui.enter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practicaunonavigation.R;
import com.example.practicaunonavigation.rest.model.Owner;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class AdaptadorFollowers extends RecyclerView.Adapter<AdaptadorFollowers.ViewHolderFollowers> {

    ArrayList<Owner> listaFollowers;

    public AdaptadorFollowers(ArrayList<Owner> listaFollowers) {
        this.listaFollowers = listaFollowers;
    }

    @NonNull
    @Override
    public ViewHolderFollowers onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderFollowers(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderFollowers holder, int position) {
        holder.etiNombre.setText(listaFollowers.get(position).getNombre());
        holder.etiEstado.setText(listaFollowers.get(position).getEstado());



    }

    @Override
    public int getItemCount() {
        return listaFollowers.size();
    }

    public class ViewHolderFollowers extends RecyclerView.ViewHolder {

        TextView etiNombre;
        TextView etiEstado;



        public ViewHolderFollowers(View itemView) {
            super(itemView);

            etiNombre = (TextView) itemView.findViewById(R.id.textViewNombre);
            etiEstado = (TextView) itemView.findViewById(R.id.textViewEstado);


        }
    }
}
