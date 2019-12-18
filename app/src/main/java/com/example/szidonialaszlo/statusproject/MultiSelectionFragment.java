package com.example.szidonialaszlo.statusproject;



import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by szidonia.laszlo on 2017. 10. 31..
 */

public class MultiSelectionFragment extends DialogFragment {
    ArrayList<String> list= new ArrayList<String>();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = getResources().getStringArray(R.array.my_color_selection);
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());

        builder.setTitle("Choose color").setMultiChoiceItems(R.array.my_color_selection, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if (isChecked)
                {
                    list.add(items[which]);

                }else
                if (list.contains(items[which])){
                    list.remove(items[which]);
                }
            }
        }).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selections="";
                for (String ms : list){
                    selections = selections + "\t"+ms;

                }
                Toast.makeText(getActivity(),"Color selection:"+selections,Toast.LENGTH_SHORT).show();

            }
        });
        return builder.create();
    }
}
