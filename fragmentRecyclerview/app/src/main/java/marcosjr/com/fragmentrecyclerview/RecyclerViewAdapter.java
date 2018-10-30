package marcosjr.com.fragmentrecyclerview;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<Filme> mData;
    Dialog mydialog;

    public RecyclerViewAdapter(Context mcontext, List<Filme> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.item_filme,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);

        //dialogo

        mydialog = new Dialog(mcontext);
        mydialog.setContentView(R.layout.dialog_filme);
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        vHolder.item_filme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView dialog_name_tv = (TextView)mydialog.findViewById(R.id.dialog_name_id);
                TextView dialog_nomefilme_tv = (TextView)mydialog.findViewById(R.id.dialog_nome_filme);
                ImageView dialog_image = (ImageView)mydialog.findViewById(R.id.dialog_image_id);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getNome());
                dialog_nomefilme_tv.setText(mData.get(vHolder.getAdapterPosition()).getDescricao());
                dialog_image.setImageResource(mData.get(vHolder.getAdapterPosition()).getImage());
                Toast.makeText(mcontext,"teste click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                mydialog.show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_nome.setText(mData.get(position).getNome());
        holder.tv_descricao.setText(mData.get(position).getDescricao());
        holder.img.setImageResource(mData.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_filme;
        private TextView tv_nome;
        private TextView tv_descricao;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            item_filme = (LinearLayout)itemView.findViewById(R.id.filme_item_id);
            tv_nome = (TextView)itemView.findViewById(R.id.nome_filme);
            tv_descricao = (TextView)itemView.findViewById(R.id.descricao_filme);
            img = (ImageView)itemView.findViewById(R.id.image_film);
        }
    }

}
