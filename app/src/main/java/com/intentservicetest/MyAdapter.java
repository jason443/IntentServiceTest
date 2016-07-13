package com.intentservicetest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2016/7/13.
 */
public class MyAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Person> persons;

    public MyAdapter(Context context, List<Person> persons) {
        this.inflater = LayoutInflater.from(context);
        this.persons = persons;
    }

    public int getCount() {
        return (persons == null)?0:persons.size(); //ListView要显示的行数，应用中一般为从数据库查询出来的数据的总条数。
    }

    public Object getItem(int position) { //
        return persons.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Person person = (Person)getItem(position);
        ViewHolder viewHolder = null;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.item_lv_main,null);
            viewHolder = new ViewHolder();
            viewHolder.personId = (TextView) convertView.findViewById(R.id.main_lv_id);
            viewHolder.personName = (TextView)convertView.findViewById(R.id.main_lv_name);
            viewHolder.personPhoto = (ImageView)convertView.findViewById(R.id.main_lv_photo);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.personId.setText(person.getPersonId() + "");
        viewHolder.personName.setText(person.getPersonName());
        viewHolder.personPhoto.setImageResource(person.getPersonPhoto());
        return convertView;
    }

    class ViewHolder {
        public TextView personId;
        public TextView personName;
        public ImageView personPhoto;
    }

}
