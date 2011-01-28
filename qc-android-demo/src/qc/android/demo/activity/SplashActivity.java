package qc.android.demo.activity;

import qc.android.core.activity.CoreActivity;
import qc.android.core.activity.CoreInfoActivity;
import qc.android.demo.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends CoreActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		TextView info = (TextView) findViewById(R.id.splashInfo);
		info.setText(info.getText() + "\n"
			+ getString(qc.android.core.R.string.qccore_info));

		((Button) findViewById(R.id.btnTest1))
			.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					Intent intent = new Intent(SplashActivity.this,CoreInfoActivity.class);
					startActivity(intent);
				}
			});
	}
}