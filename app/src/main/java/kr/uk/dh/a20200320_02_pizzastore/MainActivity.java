package kr.uk.dh.a20200320_02_pizzastore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.uk.dh.a20200320_02_pizzastore.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

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

    }
}
