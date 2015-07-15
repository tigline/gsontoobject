package com.tcl.launcher.gsontoobject;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonObject;
import com.tcl.launcher.data.request.GsonObjectRequest;
import com.tcl.launcher.data.request.GsonRequest;
import com.tcl.launcher.data.request.RequestManager;
import com.tcl.launcher.data.response.TestResponse;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	private Button request;
	private String words = "";
	private EditText input;
	private String requestUrl = "http://120.24.65.74:8080/rs/api/roseEngineControl.json?engineid=03EDD589014D1000E0000003" + 
      "0A780239&question=" + words + "&imei=test";
	
	private JsonObject json;

	
	RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        RequestManager.init(this);
        
        input = (EditText) findViewById(R.id.input_message);
        request = (Button) findViewById(R.id.send);
        mQueue = Volley.newRequestQueue(this); 
        
        request.setOnClickListener(this);
 
    }

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.send:
			words = input.getText().toString();
			
			break;

		default:
			break;
		}
	}
	
	
	
	private void getNetDataTest() {
		String url = "http://120.24.65.74:8080/rs/api/roseItemDetail.json";
		Map<String, String> params = new HashMap<String, String>();
		params.put("engineid", "03EDD589014D1000E00000030A780239");
		params.put("question", "5891");
		params.put("imei", "test");
		params.put("domain", "TVPLAY");

//		executeRequest(new GsonObjectRequest<TestResponse>(Request.Method.POST, url, params,
//				TestResponse.class, new Response.Listener<TestResponse>() {
//
//					@Override
//					public void onResponse(TestResponse testResponse) {
//						
//					}
//
//				}, new Response.ErrorListener() {
//					@Override
//					public void onErrorResponse(VolleyError volleyError) {
//						VolleyLog.e("error: %s", volleyError.getMessage());
//					}
//				})
//				);
//		}

		RequestManager.getRequestQueue().add(
				new GsonObjectRequest<TestResponse>(Request.Method.POST, url,
						params, TestResponse.class,
						new Response.Listener<TestResponse>() {

							@Override
							public void onResponse(TestResponse testResponse) {
								Log.d("+++++", "++++++++++++++++");
							}

						}, new Response.ErrorListener() {
							@Override
							public void onErrorResponse(VolleyError volleyError) {
								VolleyLog.e("error: %s",
										volleyError.getMessage());
							}
						}));

	}
}
