package com.example.imyhs.moel.Request;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by imyhs on 2017-11-16.
 */

public class AdminRequest extends StringRequest{
    final static private String URL = "http://52.79.39.200/UserRegister.php";
    private Map<String, String> parameters;

    public AdminRequest(String buildingName, String floor, String numElevator, Response.Listener<String> listener)
    {
        super(Method.POST, URL, listener, null );
        parameters = new HashMap<>();
        parameters.put("buildingName", buildingName);
        parameters.put("floor", floor);
        parameters.put("numElevator", numElevator);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
