package com.example.jfood_android;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class MenuRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.100.22:8080/food";

    public MenuRequest(Response.Listener<String> listener) {
        super(Request.Method.GET, Regis_URL, listener, null);
    }
}