package com.example.imyhs.moel.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.imyhs.moel.Building;
import com.example.imyhs.moel.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by imyhs on 2017-11-16.
 */

public class BuildingListAdapter extends BaseAdapter {

    private Context context;
    private List<Building> buildingList;

    public BuildingListAdapter(Context context, List<Building> buildingList) {
        this.context = context;
        this.buildingList = buildingList;
    }

    @Override
    public int getCount() {
        return buildingList.size();
    }

    @Override
    public Object getItem(int i) {
        return buildingList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.building, null);
        TextView nameText = (TextView) v.findViewById(R.id.BuildingName);
        TextView idText = (TextView) v.findViewById(R.id.BuildingID);
        TextView floorText = (TextView) v.findViewById(R.id.floor);
        TextView numElevatorText = (TextView) v.findViewById(R.id.NumElevator);

        nameText.setText("건물 이름" + buildingList.get(i).getName());
        idText.setText("건물 ID" + buildingList.get(i).getid());
        floorText.setText(buildingList.get(i).getFloor() +"층");
        numElevatorText.setText(buildingList.get(i).getNum() +"대");

        v.setTag(buildingList.get(i).getName());
        return v;
    }
}
