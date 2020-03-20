package kr.uk.dh.a20200320_02_pizzastore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bumptech.glide.Glide;

import kr.uk.dh.a20200320_02_pizzastore.databinding.ActivityPizzaStoreDetailBinding;
import kr.uk.dh.a20200320_02_pizzastore.datas.PizzaStore;

public class PizzaStoreDetailActivity extends BaseActivity {

    ActivityPizzaStoreDetailBinding binding = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_pizza_store_detail);
        setupEvets();
        setValues();
    }

    @Override
    public void setupEvets() {

    }

    @Override
    public void setValues() {
        PizzaStore store = (PizzaStore)getIntent().getSerializableExtra("store");

        binding.storeNameTxt.setText(store.getStoreName());
        binding.storePhoneTxt.setText(store.getPhoneNum());
        Glide.with(mContext).load(store.getLogoUrl()).into(binding.storeLogoImg);


    }
}
