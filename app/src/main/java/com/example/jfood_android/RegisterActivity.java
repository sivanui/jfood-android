package com.example.jfood_android;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etName = (EditText) findViewById(R.id.register_name);
        final EditText etEmail = (EditText) findViewById(R.id.register_email);
        final EditText etPassword = (EditText) findViewById(R.id.register_password);
        final Button btnRegister = (Button) findViewById(R.id.register_button);
        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = etName.getText().toString();
                String email= etEmail.getText().toString();
                String password = etPassword.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>()
                {
                    @Override
                     public void onResponse(String response)
                    {
                        try
                        {
                            JSONObject jsonObject = new JSONObject(response);
                            if (jsonObject != null)
                            {
                                Toast.makeText(RegisterActivity.this, "Register Sucessful", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e)
                        {
                            Toast.makeText(RegisterActivity.this, "Register Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(name, email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
             }
        });
    }
}

