package com.nathit.dictionaryapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nathit.dictionaryapp.R;

public class MeaningsViewHolder extends RecyclerView.ViewHolder {

    public TextView textView_partsOfSpeech;
    public RecyclerView recycler_definition;

    public MeaningsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_partsOfSpeech = itemView.findViewById(R.id.textView_partsOfSpeech);
        recycler_definition = itemView.findViewById(R.id.recycler_definition);
    }
}
