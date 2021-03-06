package com.example.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class LimitsContinuityVideosTab extends Fragment {

	public LimitsContinuityVideosTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_continuity_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.limits_continuity_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.limits_continuity_second_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "kdEQGfeC0SE");
				i.putExtra("videoTitle", "Limits | Limits to Define Continuity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "nOnd3SiYZqM");
				i.putExtra("videoTitle", "Limits | One-sided Limits from Graphs");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
