package com.example.fragmenttestoscarhoyos;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class f1 extends ListFragment{

	String[] text = new String[] { "1", "2", "3", "4",  
		    "5","6","7","8","9","10" };  
		  
		  
		  @Override  
		  public void onListItemClick(ListView l, View v, int position, long id) {  
			  super.onListItemClick(l, v, position, id);
				String val;
				f2 fragment2 = new f2();
				Bundle args = new Bundle();
				val = text[position];
				args.putInt("val", Integer.parseInt(val));
				fragment2.setArguments(args);

				android.app.FragmentTransaction ft =  getFragmentManager().beginTransaction();
				ft.replace(R.id.container, fragment2);	
				ft.addToBackStack("fragment2");
				ft.commit();
			
		  }  
		  
		  @Override  
		  public View onCreateView(LayoutInflater inflater, ViewGroup container,  
		    Bundle savedInstanceState) {  
		   ArrayAdapter<String> adapter = new ArrayAdapter<String>(  
		     inflater.getContext(), android.R.layout.simple_list_item_1,  
		     text);  
		   setListAdapter(adapter);  
		   return super.onCreateView(inflater, container, savedInstanceState);  
		  }  
}
