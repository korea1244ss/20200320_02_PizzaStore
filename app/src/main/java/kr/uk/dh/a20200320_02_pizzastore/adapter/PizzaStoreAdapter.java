package kr.uk.dh.a20200320_02_pizzastore.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

import kr.uk.dh.a20200320_02_pizzastore.R;
import kr.uk.dh.a20200320_02_pizzastore.datas.PizzaStore;

public class PizzaStoreAdapter extends ArrayAdapter<PizzaStore> {

    Context  mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;


    public PizzaStoreAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.pizza_store_list_item,null);
        }

        PizzaStore data = mList.get(position);

        ImageView logoImg = row.findViewById(R.id.logoImg);
        TextView nameTxt = row.findViewById(R.id.nameText);

        nameTxt.setText(data.getStoreName());
//        다양성 상속  . 그래서 ImageView
        Glide.with(mContext).load(data.getLogoUrl()).into(logoImg);





        return row;
    }
}
