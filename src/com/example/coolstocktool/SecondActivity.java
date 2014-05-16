package com.example.coolstocktool;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SecondActivity extends ActionBarActivity {

	// public SecondAdapter adapter;
	public ListView listView;
	private Context context;
	public SecondAdapter adapter;
	public ArrayList<DataFrom> data;

	public class DataFrom {
		public String stockName;
		public String id;
		public String describe;
		public String dateCreate;
		public String ownerName;

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		context = this;

		// hard-code input data
		data = new ArrayList<DataFrom>();

		DataFrom bucket = new DataFrom();
		bucket.id = "0001";
		bucket.ownerName = "Bob";
		bucket.describe = "Detail Info";
		bucket.dateCreate = "2014";
		bucket.stockName = "ASUS";

		data.add(bucket);
		Log.d("***", "Heyyyy");

		adapter = new SecondAdapter(context, R.layout.activity_second_adapter,
				data);
		listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter((ListAdapter) adapter);

	}

}
