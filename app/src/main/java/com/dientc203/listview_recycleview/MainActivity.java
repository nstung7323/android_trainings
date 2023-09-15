package com.dientc203.listview_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCar;
    private Button btnAdd;
    private List<CarModel> list = new ArrayList<>();
    private CarAdapter carAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvCar = (RecyclerView) findViewById(R.id.rcv_car);
        btnAdd = (Button) findViewById(R.id.btn_add);
        list.add(new CarModel("HondaCRV 2023", "White", "2023", "https://danchoioto.vn/wp-content/uploads/2021/08/hyundai-elantra-la-cai-ten-tiep-theo-phai-ke-den-neu-noi-ve-cac-loai-xe-o-to-5-cho-gia-re-hang-c.jpeg"));
        list.add(new CarModel("HondaCRV 2022", "White", "2022", "https://static-images.vnncdn.net/files/publish/2022/11/21/honda-civic-1717.jpg"));
        list.add(new CarModel("HondaCRV 2021", "White", "2021", "https://media.vneconomy.vn/images/upload/2021/04/20/elantra-sport-2019-1615220509482378120754-0-0-1079-1920-crop-16152205134791452801253.jpg"));
        list.add(new CarModel("HondaCRV 2020", "White", "2020", "https://cdnimg.vietnamplus.vn/uploaded/qrndqxjwp/2022_01_15/5c13378d057c480a8e98c64a413e20613682161636517973.jpg"));
        list.add(new CarModel("HondaCRV 2019", "White", "2019", "https://images.autofun.vn/file1/new2dceb00db10e42f3bdc84028e7f07008_324x216.jpg"));
        list.add(new CarModel("HondaCRV 2018", "White", "2018", "https://cdn.shopify.com/s/files/1/0580/0031/0432/files/bang_gia_xe_o_to_moi_nhat.png?v=1678249206"));
        list.add(new CarModel("HondaCRV 2017", "White", "2017", "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/1/30/1142340/Honda-Wr-V.jpeg"));
        carAdapter = new CarAdapter(list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcvCar.setLayoutManager(linearLayoutManager);
        rcvCar.setAdapter(carAdapter);
        addCar();
    }

    private void addCar() {
        btnAdd.setOnClickListener(view -> {
            ExDialogFragment dialogFragment = new ExDialogFragment(new InterfaceOnclickItem() {
                @Override
                public void addCar(CarModel carModel) {
                    Log.d("zzzz", "addCar: " + carModel.toString());
                    list.add(carModel);
                    carAdapter = new CarAdapter(list);
                    rcvCar.setAdapter(carAdapter);
                }
            });
            dialogFragment.show(getSupportFragmentManager(),ExDialogFragment.TAG);
        });
    }
}