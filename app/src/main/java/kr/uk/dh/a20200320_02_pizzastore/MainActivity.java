package kr.uk.dh.a20200320_02_pizzastore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.uk.dh.a20200320_02_pizzastore.adapter.PizzaStoreAdapter;
import kr.uk.dh.a20200320_02_pizzastore.databinding.ActivityMainBinding;
import kr.uk.dh.a20200320_02_pizzastore.datas.PizzaStore;

public class MainActivity extends BaseActivity {

    List<PizzaStore> pizzaStores = new ArrayList<>();
    PizzaStoreAdapter psa = null;

    ActivityMainBinding binding = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        setupEvets();
        setValues();
    }

    @Override
    public void setupEvets() {

    }

    @Override
    public void setValues() {

        psa = new PizzaStoreAdapter(mContext, R.layout.pizza_store_list_item, pizzaStores);
        binding.pizzaListView.setAdapter(psa);

    }
}
