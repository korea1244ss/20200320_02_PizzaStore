package kr.uk.dh.a20200320_02_pizzastore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

import kr.uk.dh.a20200320_02_pizzastore.databinding.ActivityPizzaStoreDetailBinding;
import kr.uk.dh.a20200320_02_pizzastore.datas.PizzaStore;

public class PizzaStoreDetailActivity extends BaseActivity {
    PizzaStore store = null;
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

        binding.storeLogoImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PermissionListener pl = new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {
                        String phoneNumUri = String.format("tel:%s",store.getPhoneNum());

                        Uri uri = Uri.parse(phoneNumUri);
                        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                        startActivity(intent);
                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {

                        Toast.makeText(mContext, "전화 권한을 허가 해야 사용가능합니다.", Toast.LENGTH_SHORT).show();


                    }
                };

                TedPermission.with(mContext).setPermissionListener(pl).setDeniedMessage("설정에서 허용해줘야 가능.")
                        .setPermissions(Manifest.permission.CALL_PHONE).check();


            }
        });

    }

    @Override
    public void setValues() {
        store = (PizzaStore)getIntent().getSerializableExtra("store");

        binding.storeNameTxt.setText(store.getStoreName());
        binding.storePhoneTxt.setText(store.getPhoneNum());
        Glide.with(mContext).load(store.getLogoUrl()).into(binding.storeLogoImg);


    }
}
