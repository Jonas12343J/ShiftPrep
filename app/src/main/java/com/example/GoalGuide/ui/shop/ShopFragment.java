package com.example.GoalGuide.ui.shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.GoalGuide.LoginActivity;
import com.example.GoalGuide.MainActivity;
import com.example.GoalGuide.RegisterActivity;
import com.example.test.R;
import com.example.test.databinding.FragmentShopBinding;


public class ShopFragment extends Fragment {

    private FragmentShopBinding binding;
    private Button lvlUp;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShopViewModel dashboardViewModel =
                new ViewModelProvider(this).get(ShopViewModel.class);

        binding = FragmentShopBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lvlUp = root.findViewById(R.id.lvlUp);

        lvlUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        //final TextView textView = binding.textShop;
        //dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}