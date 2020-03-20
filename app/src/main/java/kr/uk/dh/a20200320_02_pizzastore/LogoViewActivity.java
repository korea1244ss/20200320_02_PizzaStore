package kr.uk.dh.a20200320_02_pizzastore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.uk.dh.a20200320_02_pizzastore.databinding.ActivityLogoViewBinding;

public class LogoViewActivity extends BaseActivity {

    ActivityLogoViewBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_logo_view);


        setupEvets();
        setValues();
    }

    @Override
    public void setupEvets() {

    }

    @Override
    public void setValues() {

    }
}
