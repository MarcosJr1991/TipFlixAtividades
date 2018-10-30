package marcosjr.com.recyclerviewinfinite.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import marcosjr.com.recyclerviewinfinite.R;

public class Adapter extends RecyclerView.Adapter<Adapter.Vholder> {

    ArrayList<String> data;
    Context context;

    public Adapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.item,parent,false);
        return new Vholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
        holder.textView.setText(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Vholder extends RecyclerView.ViewHolder{

        TextView textView;

        public Vholder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.txtItem);

        }
    }
}
