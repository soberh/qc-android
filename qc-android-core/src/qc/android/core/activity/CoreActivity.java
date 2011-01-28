package qc.android.core.activity;

import android.app.Activity;
import android.os.Bundle;

public abstract class CoreActivity extends Activity {
	protected String tag = getClass().getSimpleName();

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.initBean();
	}

	protected void initBean() {
	}
}