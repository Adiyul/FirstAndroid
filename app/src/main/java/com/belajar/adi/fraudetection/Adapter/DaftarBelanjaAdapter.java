package com.belajar.adi.fraudetection.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.belajar.adi.fraudetection.Model.DaftarBelanja;
import com.belajar.adi.fraudetection.R;

import java.util.ArrayList;


public class DaftarBelanjaAdapter extends RecyclerView.Adapter<DaftarBelanjaAdapter.DaftarBelanjaViewHolder> {

    private ArrayList<DaftarBelanja> dataList;

    public DaftarBelanjaAdapter(ArrayList<DaftarBelanja> dataList){
        this.dataList = dataList;
    }

    @Override
    public DaftarBelanjaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item_keranjang, parent, false);
        return  new DaftarBelanjaViewHolder(view);
    }
    @Override
    public void onBindViewHolder(DaftarBelanjaAdapter.DaftarBelanjaViewHolder holder, int position) {
        holder.txtNamaBarang.setText(dataList.get(position).getNama_barang());
        holder.txtHarga.setText(dataList.get(position).getHarga());
        holder.txtJumlah.setText(dataList.get(position).getJumlah());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class DaftarBelanjaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNamaBarang, txtHarga, txtJumlah;

        public DaftarBelanjaViewHolder(View itemView) {
            super(itemView);
            txtNamaBarang = itemView.findViewById(R.id.txt_nama_barang);
            txtHarga = itemView.findViewById(R.id.txt_harga);
            txtJumlah = itemView.findViewById(R.id.txt_jumlah);
        }
    }

}
