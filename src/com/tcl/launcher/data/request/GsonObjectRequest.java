package com.tcl.launcher.data.request;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.tcl.launcher.config.Config;

/**
 * @see com.android.volley.toolbox.JsonObjectRequest(int, String, org.json.JSONObject , com.android.volley.Response.Listener , com.android.volley.Response.ErrorListener )
 * 鍙傛暟JSONObject锛坖sonRequest锛夊彂閫佺殑post鍙傛暟鏍煎紡涓� {"Token":"abfffe59392653a4106d56f89ac7ccc4","ajax":"1"}
 *
 * 瑕嗙洊getParams() 鍙戦�佺殑post鍙傛暟鏍煎紡涓� Token=abfffe59392653a4106d56f89ac7ccc4&ajax=1&
 *
 * Created by gchen on 14-1-8.
 */
public class GsonObjectRequest<T> extends GsonRequest<T> {

    private final Gson mGson;
    private final Class<T> mClassOfT;

    /**
     * Creates a new request.
     * @param method the HTTP method to use
     * @param url URL to fetch the JSON from
     * @param jsonRequest A {@link org.json.JSONObject} to post with the request. Null is allowed and
     *   indicates no parameters will be posted along with request.
     * @param listener Listener to receive the JSON response
     * @param errorListener Error listener, or null to ignore errors.
     */
    public GsonObjectRequest(int method, String url, JSONObject jsonRequest, Class<T> classOfT,
                             Listener<T> listener, ErrorListener errorListener) {
        super(method, url, (jsonRequest == null) ? null : jsonRequest.toString(), listener, errorListener);
        mClassOfT = classOfT;
        mGson = new Gson();
    }

    public GsonObjectRequest(int method, String url, Map params, Class<T> classOfT,
                             Listener<T> listener, ErrorListener errorListener) {
        this(method, url, params, classOfT, false, listener, errorListener);
    }

    /**
     * @param expose Gson搴忓垪鍖�/鍙嶅簭鍒楀寲鏄惁寮�鍚疉nnotation @Expose
     */
    public GsonObjectRequest(int method, String url, Map params, Class<T> classOfT, boolean expose,
                             Listener<T> listener, ErrorListener errorListener) {
        super(method, url, (params == null) ? null : new JSONObject(params).toString(), listener, errorListener);
        mClassOfT = classOfT;
        if (expose) {
            mGson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        }
        else {
            mGson = new Gson();
        }
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
        	Map<String,String> headMaps = response.headers;
        	String json = new String(response.data, HttpHeaderParser.parseCharset(headMaps));
			JSONObject jsonObj = new JSONObject(json);
//			jsonObj.put("returnCode", headMaps.get("returnCode"));
			if (Config.DEBUG) {
                VolleyLog.d("response jsonObj: %s", jsonObj.toString());
                Log.d("volley_response", jsonObj.toString());
            }
            return Response.success(mGson.fromJson(jsonObj.toString(), mClassOfT), HttpHeaderParser.parseCacheHeaders(response));
        } catch (JSONException e) {
        	return Response.error(new ParseError(e));
		}catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            return Response.error(new ParseError(e));
        }
    }
    
//    @Override
//    protected void deliverResponse(T response) {
//        mListener.onResponse(response);
//    }
}
