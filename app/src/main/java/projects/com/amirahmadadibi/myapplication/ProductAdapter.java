package projects.com.amirahmadadibi.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import projects.com.amirahmadadibi.myapplication.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<Product> products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
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
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
