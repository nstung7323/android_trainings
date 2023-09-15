package com.dientc203.listview_recycleview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ExDialogFragment extends DialogFragment {
    private EditText edName;
    private EditText edColor;
    private EditText edYear;
    private EditText edImg;
    private Button btnAdd;
    private Button btnCancel;
    private InterfaceOnclickItem onclickItem;
    public static final String TAG = "ExDialogFragment";
    public ExDialogFragment(InterfaceOnclickItem onclickItem) {
        this.onclickItem = onclickItem;
    }

    public ExDialogFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_add_car,container,false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        edName = (EditText) view.findViewById(R.id.ed_name);
        edColor = (EditText) view.findViewById(R.id.ed_color);
        edYear = (EditText) view.findViewById(R.id.ed_year);
        edImg = (EditText) view.findViewById(R.id.ed_img);
        btnAdd = (Button) view.findViewById(R.id.btn_add);
        btnCancel = (Button) view.findViewById(R.id.btn_cancel);
        btnAdd.setOnClickListener(view1 -> {
            onclickItem.addCar(new CarModel(edName.getText().toString()
                    ,edColor.getText().toString()
                    ,edYear.getText().toString()
                    ,edImg.getText().toString()));
            MainActivity mainActivity = (MainActivity) getActivity();
        });
    }

    public EditText getEdName() {
        return edName;
    }

    public EditText getEdColor() {
        return edColor;
    }

    public EditText getEdYear() {
        return edYear;
    }

    public EditText getEdImg() {
        return edImg;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public Button getBtnCancel() {
        return btnCancel;
    }
    public void closeDialog(){
        dismiss();
    }
}