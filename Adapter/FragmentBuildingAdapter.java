package com.example.imyhs.moel.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.imyhs.moel.Building;
import com.example.imyhs.moel.R;

import java.util.List;

/**
 * Created by imyhs on 2017-11-19.
 */

public class FragmentBuildingAdapter extends BaseAdapter {

    private Context context;
    private List<Building> FragmentBuildingList;

    public FragmentBuildingAdapter(Context context, List<Building> fragmentBuildingList) {
        this.context = context;
        this.FragmentBuildingList = fragmentBuildingList;
    }

    @Override
    public int getCount() {
        return FragmentBuildingList.size();
    }

    @Override
    public Object getItem(int i) {
        return FragmentBuildingList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = View.inflate(context, R.layout.fragment_building, null);
        TextView nameText = (TextView) v.findViewById(R.id.Fragment_BuildingName);
        TextView idText = (TextView) v.findViewById(R.id.Fragment_BuildingID);
        TextView floorText = (TextView) v.findViewById(R.id.Fragment_floor);
        TextView numElevatorText = (TextView) v.findViewById(R.id.Fragment_NumElevator);

        nameText.setText("건물 이름" + FragmentBuildingList.get(i).getName());
        idText.setText("건물 ID" + FragmentBuildingList.get(i).getid());
        floorText.setText(FragmentBuildingList.get(i).getFloor()+"층");
        numElevatorText.setText(FragmentBuildingList.get(i).getNum()+"대");

        v.setTag(FragmentBuildingList.get(i).getName());
        return v;
    }
}
