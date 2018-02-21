package com.example.anthony.anthonybriot_listperso;

/**
 * Created by Anthony on 21/02/2018.
 */

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class SportAdapter extends ArrayAdapter<Sport> {

    public SportAdapter(Context context, List<Sport> sports) {
        super(context, 0, sports);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_sport,parent, false);
        }

        SportViewHolder viewHolder = (SportViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new SportViewHolder();
            viewHolder.pseudo = (TextView) convertView.findViewById(R.id.pseudo);
            viewHolder.text = (TextView) convertView.findViewById(R.id.text);
            viewHolder.avatar = (ImageView) convertView.findViewById(R.id.avatar);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Sport> sports
        Sport sport = getItem(position);
        viewHolder.pseudo.setText(sport.getPseudo());
        viewHolder.text.setText(sport.getText());
        viewHolder.avatar.setImageDrawable(new ColorDrawable(sport.getColor()));

        return convertView;
    }

    private class SportViewHolder{
        public TextView pseudo;
        public TextView text;
        public ImageView avatar;

    }
}