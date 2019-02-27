package projects.com.amirahmadadibi.myapplication;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView iv_card_thumbnail;
    TextView txtProductPrice;
    TextView txtProductTitle;
    Button btnBuy;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        iv_card_thumbnail = itemView.findViewById(R.id.iv_card_item);
        txtProductPrice = itemView.findViewById(R.id.txt_product_price);
        txtProductTitle = itemView.findViewById(R.id.txt_product_title);
        btnBuy = itemView.findViewById(R.id.btn_shop);
    }
}
