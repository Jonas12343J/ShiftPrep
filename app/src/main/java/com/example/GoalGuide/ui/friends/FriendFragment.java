package com.example.GoalGuide.ui.friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.test.R;

public class FriendFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FriendViewModel friendViewModel = new ViewModelProvider(this).get(FriendViewModel.class);
        View view = inflater.inflate(R.layout.fragment_friends, container, false);

        Button requestsBtn = view.findViewById(R.id.requests_button);
        Button friendsBtn = view.findViewById(R.id.friend_button);

        LinearLayout friendsLayout = view.findViewById(R.id.linear_friends);
        LinearLayout requestsLayout = view.findViewById(R.id.linear_requests);

        ScrollView friend_list = view.findViewById(R.id.friend_list);
        ScrollView request_list = view.findViewById(R.id.requests_list);

        requestsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friend_list.setVisibility(View.GONE);
                friendsLayout.setVisibility(View.GONE);
                request_list.setVisibility(View.VISIBLE);
                requestsLayout.setVisibility(View.VISIBLE);
            }
        });

        friendsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friend_list.setVisibility(View.VISIBLE);
                friendsLayout.setVisibility(View.VISIBLE);
                request_list.setVisibility(View.GONE);
                requestsLayout.setVisibility(View.GONE);

            }
        });

        return view;
    }
}