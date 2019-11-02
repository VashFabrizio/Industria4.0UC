package com.example.vash.industria40uc;

import android.app.Notification;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Notificaciones extends AppCompatActivity {
    private RequestQueue queue;
    private int count = 0 ;
    private TableLayout tableLayout;
    private List<String> MensajesList = new ArrayList<>() ;
    private List<String> RemoveList = new ArrayList<>() ;

    private NotificationManagerCompat  notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        notificationManager = NotificationManagerCompat.from(this);
        queue = Volley.newRequestQueue(this );
        tableLayout=findViewById(R.id.tableLayout);
        obtenerNotificaciones();

        setTimer();

    }
    private void obtenerNotificaciones() {

        String url= "http://192.168.43.110:81/serviciosRest/controladores/read_notification.php";
        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            JSONArray Array = response.getJSONArray("Notificaciones");

                            JSONArray newArray = validateState(Array);
                            setData(newArray);
                        } catch (JSONException e) {
                            Toast.makeText(Notificaciones.this, e.toString(), Toast.LENGTH_SHORT).show();
                            e.printStackTrace();

                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Notificaciones.this, error.toString() , Toast.LENGTH_SHORT).show();
                    }
                });
        queue.add(request);
    }

    public void setData(JSONArray array){
        try {
            for (int i = 0 ; i < array.length() ; i++)
            {
                View tableRow = LayoutInflater.from(this).inflate(R.layout.table_item,null,false);
                TextView evento  =  tableRow.findViewById(R.id.evento);
                TextView mensaje  =  tableRow.findViewById(R.id.mensaje);

                JSONObject a = array.getJSONObject(i);
                String notificacion_id = a.getString("notificacion_id");
                String evento_name = a.getString("evento_id");
                String notificacion_mensaje = a.getString("notificacion_mensaje");
                String state = a.getString("notificacion_estado");
                evento.setText(evento_name);
                mensaje.setText(notificacion_mensaje);

                Boolean valor = validate(notificacion_id);
                if(!valor){
                    tableLayout.addView(tableRow,i);
                    MensajesList.add(notificacion_id);

                }
                if(!valor && count >= 1){
                    Notification notification = new NotificationCompat.Builder(this, App.CHANNEL_1_ID)
                            .setSmallIcon(R.drawable.icon)
                            .setContentTitle(evento_name)
                            .setContentText(notificacion_mensaje)
                            .setPriority(NotificationCompat.PRIORITY_HIGH)
                            .setCategory(NotificationCompat.CATEGORY_EVENT)
                            .setVibrate(new long[] { 1000, 1000, 1000, 1000, 1000 })
                            .setLights(Color.GREEN, 30000,3000)
                            .build();
                    notificationManager.notify(1,notification);
                }

            }
            count ++;
        }
        catch (Exception e)
        {
            Toast.makeText(this, String.valueOf(array.length()), Toast.LENGTH_SHORT).show();
        }

    }


    public void setTimer()
    {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                obtenerNotificaciones();
            }
        };

        Timer timer =  new Timer();
        timer.scheduleAtFixedRate(timerTask,10000,3000);

    }

    public boolean validate(String id)
    {
        for ( String str: MensajesList)
        {
            if (str.trim().contains(id))
            return true;
        }
        return false;
    }
    public boolean validateRemove(String remove)
    {
        for ( String str: RemoveList)
        {
            if (str.trim().contains(remove))
                return true;
        }
        return false;
    }
    public JSONArray validateState(JSONArray array)
    {
        JSONArray nuevoArray = new JSONArray();

        for (int i = 0 ; i < array.length() ; i++)
        {
            try {
                JSONObject a = array.getJSONObject(i);
                String state = a.getString("notificacion_estado");
                String id = a.getString("notificacion_id");
                    if (state.equals("0"))
                    {
                        if(!validateRemove(id))
                        {
                            RemoveList.add(id);
                            if (tableLayout.getChildCount() > 2) tableLayout.removeViewAt(i);
                        }
                    }
                    else
                    {
                        nuevoArray.put(a);
                    }
                }

            catch (Exception e){
                Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }
        return nuevoArray ;
    }


    @Override
    protected void onPause() {
        super.onPause();
        setTimer();
    }
}
