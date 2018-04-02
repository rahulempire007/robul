package instatag.com.b3ds;

/**
 * Created by RahulReign on 27-03-2018.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;



public class Adapter extends BaseAdapter {


    private Context context;
    private List<DoctorDatum> data;
    private static LayoutInflater inflater=null;
    OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{
        public void onItemClick(View view,int position);
    }

    public Adapter(Context context, List<DoctorDatum> data,OnItemClickListener onItemClickListener) {
        this.context = context;
        this.data=data;
        this.onItemClickListener=onItemClickListener;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        if(view==null)
            view = inflater.inflate(R.layout.post, null);
        TextView name = view.findViewById(R.id.docNameid); // title
        TextView address = view.findViewById(R.id.addressid); // artist name
        TextView phone = view.findViewById(R.id.mobNumid);
        TextView docID=view.findViewById(R.id.useridgone);

        DoctorDatum doctoritem=data.get(position);
        name.setText(doctoritem.getService().getTitle());
        address.setText(doctoritem.getService().getAddress());
        phone.setText(doctoritem.getService().getPhone());
        docID.setText(doctoritem.getService().getUserId());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(view,position);
            }
        });
        return view;
    }
}

/*
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;



public class Adapter extends BaseAdapter {

private Adapter  adapter;
    private Context context;
    private List<DoctorDatum> data;
    private static LayoutInflater inflater=null;
    OnItemClicklistener onItemClicklistener;

    public Adapter(Context context, List<DoctorDatum> data,
                   OnItemClicklistener onItemClicklistener) {
        this.context = context;
        this.data=data;
        this.onItemClicklistener=onItemClicklistener;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public interface OnItemClicklistener {
        public void onItemClick(View view, int position);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
            view = inflater.inflate(R.layout.post, null);
        TextView name = view.findViewById(R.id.addresssid);
        TextView address = view.findViewById(R.id.docNameid);
        TextView phone = view.findViewById(R.id.mobNumid);
        DoctorDatum doctoritem=data.get(i);
        name.setText(doctoritem.getService().getTitle());
        address.setText(doctoritem.getService().getAddress());
        phone.setText(doctoritem.getService().getPhone());





        view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onItemClicklistener.onItemClick(v, getItemId());

            }
        });
        return view;
    }
}
*/