package instatag.com.b3ds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CaseDetailActivity extends AppCompatActivity {
ListView listView;
    Adapter adapter;
    ArrayList<DoctorDatum> ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_detail);
        listView=(ListView)findViewById(R.id.showingDoctorResult);
        ls=(ArrayList<DoctorDatum>) getIntent().getSerializableExtra("doctordata");
        adapter=new Adapter(getApplicationContext(),ls);
        listView.setAdapter(adapter);
    }
}
