package com.example.educationalapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class LimitsSolvingVideosTab extends Fragment {

	public LimitsSolvingVideosTab() {
		// Required empty public constructor
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_solving_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.limits_solving_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.limits_solving_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.limits_solving_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.limits_solving_fourth_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "GGQngIp0YGI");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 1)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "YRw8udexH4o");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 2)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "gWSDDopD9sk");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 3)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fourthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "igJdDN-DPgA");
				i.putExtra("videoTitle", "Limits | Squeeze Theorem");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}
	
}
