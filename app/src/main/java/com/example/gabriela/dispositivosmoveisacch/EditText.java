package com.example.gabriela.dispositivosmoveisacch;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.view.LayoutInflater;


public class EditText extends BaseAdapter {

    private Context context;
    private final String[] text;

    public EditText(Context context, String[] text){
        this.context = context;
        this.text = text;
    }

    @Override
    public int getCount() {
        return text != null ? text.length : 0;
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
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View view = LayoutInflater.from(context).inflate(R.layout.textedit, viewGroup, false);

        TextView textView = view.findViewById(R.id.text);
        textView.setText(text[i]);

        return view;
    }
}
