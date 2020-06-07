package com.example.jfood_android;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class PesananFetchRequest extends StringRequest
{

    private static String URL = "http://192.168.100.31:8080/invoice/customer/";
    private Map<String, String> params;
    public PesananFetchRequest(int currentUserId, Response.Listener<String> listener)
    {
        super(Method.GET, URL+currentUserId, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
