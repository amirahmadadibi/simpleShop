package projects.com.amirahmadadibi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import projects.com.amirahmadadibi.myapplication.model.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv_product_list);
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1,"کفش ورزشی آدیداس مدل BRD 592",2400000,"https://images.unsplash.com/photo-1507822855472-664ab72ab7e0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        Product product2 = new Product(2,"کفش ورزشی آدیداس مدل BRD 592",2400000,"https://images.unsplash.com/photo-1475293831741-1b69e67acb72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=751&q=80");
        Product product3 = new Product(3,"کاشکی من این بودم",2400000,"https://images.unsplash.com/photo-1487339498226-33f35a1d8a13?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=751&q=80");
        Product product4 = new Product(4,"خودشونم نمیونم اینو بخرن تو میخوای بخری؟",2400000,"https://images.unsplash.com/photo-1544376664-80b17f09d399?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=625&q=80");
        Product product5 = new Product(5,"از فوتبال بدم میاد",2400000,"https://images.unsplash.com/photo-1524015368236-bbf6f72545b6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        ProductAdapter productAdapter = new ProductAdapter(products,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(productAdapter);
    }
}
