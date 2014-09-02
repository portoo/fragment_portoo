package com.example.fragmenttestoscarhoyos;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class f2 extends android.app.Fragment {

	private String TAG = f2.class.getSimpleName();
	private Button button2;
	private TextView mTextView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.f2_layout, container, false);

		mTextView = (TextView) rootView.findViewById(R.id.textViewParameter);

		Integer val = getArguments().getInt("val", 0);

		mTextView.setText(val.toString());

		button2 = (Button) rootView.findViewById(R.id.button1);

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				getActivity().getFragmentManager().popBackStack();
			}
		});

		return rootView;
	}

}
