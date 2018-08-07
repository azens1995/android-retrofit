package com.azens.javadevnepal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.azens.javadevnepal.model.JavaDeveloper;

import java.util.List;

/**
 * Created by Azens Eklak on 8/7/18.
 */
public class JavaDeveloperAdapter extends RecyclerView.Adapter<JavaDeveloperAdapter.ViewHolder> {

    private List<JavaDeveloper> javaDevelopers;
    private Context context;

    public JavaDeveloperAdapter(List<JavaDeveloper> javaDevelopers, Context context) {
        this.javaDevelopers = javaDevelopers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(javaDevelopers.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return javaDevelopers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title;


        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
