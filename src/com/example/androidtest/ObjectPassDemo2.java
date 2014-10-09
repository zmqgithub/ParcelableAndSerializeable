package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ObjectPassDemo2 extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView mTextView = new TextView(this);
		Book mBook = (Book) getIntent().getParcelableExtra(
				ObjectTranDemo.PAR_KEY);
		mTextView.setText("Book name is: " + mBook.getBookName() + "\n"
				+ "Author is: " + mBook.getAuthor() + "\n" + "PublishTime is: "
				+ mBook.getPublishTime());
		setContentView(mTextView);
	}
}
