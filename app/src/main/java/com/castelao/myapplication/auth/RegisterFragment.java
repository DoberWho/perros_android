package com.castelao.myapplication.auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.castelao.myapplication.R;

public class RegisterFragment extends Fragment {

    public RegisterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_register, container, false);

        Button btn = v.findViewById(R.id.ir_a_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarFragment();
            }
        });

        return v;
    }

    private void cambiarFragment() {
        Fragment frg = new LoginFragment();
        ((AuthActivity)getActivity()).cambiarFragment(frg);
    }
}