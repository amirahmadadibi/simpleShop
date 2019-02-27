package projects.com.amirahmadadibi.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

import projects.com.amirahmadadibi.myapplication.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<Product> products;
    Context context;
    public ProductAdapter(List<Product> products,Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtProductTitle.setText(products.get(i).name);
        viewHolder.txtProductPrice.setText(products.get(i).price+"");
        Glide.with(context).load(products.get(i).imageUrl).into(viewHolder.iv_card_thumbnail);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
