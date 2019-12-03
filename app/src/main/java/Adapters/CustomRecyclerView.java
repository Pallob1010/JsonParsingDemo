package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.jsonparsingdemo.R;

import java.util.ArrayList;

import ModelClass.RecievedData;

public class CustomRecyclerView extends RecyclerView.Adapter<CustomRecyclerView.MyViewHolder> {

    View view;
    ArrayList<RecievedData>data;
    LayoutInflater inflater;
    public CustomRecyclerView(ArrayList<RecievedData>data,Context  context) {
        this.data=data;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public CustomRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        view=inflater.inflate(R.layout.singlegrid,viewGroup,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerView.MyViewHolder myViewHolder, int i) {

        myViewHolder.id.setText(String.valueOf("Id:"+data.get(i).getId()));
        myViewHolder.name.setText("Name:"+data.get(i).getName());
        myViewHolder.username.setText("Username:"+data.get(i).getUsername());
        myViewHolder.email.setText("Email:"+data.get(i).getEmail());
        myViewHolder.phone.setText("Phone:"+data.get(i).getPhone());
        myViewHolder.website.setText("Website:"+data.get(i).getWebsite());
        myViewHolder.city.setText("City:"+data.get(i).getAddress().getCity());
        myViewHolder.street.setText("Street:"+data.get(i).getAddress().getStreet());
        myViewHolder.suite.setText("Suite:"+data.get(i).getAddress().getSuite());
        myViewHolder.zipcode.setText("Zipcode"+data.get(i).getAddress().getZipcode());
        myViewHolder.lat.setText("Lat:"+data.get(i).getAddress().getGeo().getLat());
        myViewHolder.lng.setText("Lng:"+data.get(i).getAddress().getGeo().getLng());
        myViewHolder.companyname.setText("Comp.Name:"+data.get(i).getCompany().getName());
        myViewHolder.catchphrase.setText("Ca. phrase:"+data.get(i).getCompany().getCatchPhrase());
        myViewHolder.bs.setText("Bs:"+data.get(i).getCompany().getBs());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id,name,companyname,username,email,city,street,suite,zipcode,lat,lng,phone,website,catchphrase,bs;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id=itemView.findViewById(R.id.id);
            name=itemView.findViewById(R.id.name);
            companyname=itemView.findViewById(R.id.companyname);
            username=itemView.findViewById(R.id.username);
            email=itemView.findViewById(R.id.email);
            city=itemView.findViewById(R.id.city);
            street=itemView.findViewById(R.id.street);
            suite=itemView.findViewById(R.id.suite);
            zipcode=itemView.findViewById(R.id.zipcode);
            lat=itemView.findViewById(R.id.lat);
            lng=itemView.findViewById(R.id.lng);
            phone=itemView.findViewById(R.id.phone);
            website=itemView.findViewById(R.id.website);
            catchphrase=itemView.findViewById(R.id.catchPhrase);
            bs=itemView.findViewById(R.id.bs);

        }

    }
}
