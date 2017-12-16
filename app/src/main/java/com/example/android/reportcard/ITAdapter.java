package com.example.android.reportcard;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlo on 14/07/2016.
 */

public class ITAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<InformationTechnology> assignments;
    private Activity activity;

    public ITAdapter(List<InformationTechnology> assignments, Activity activity) {
        this.assignments = assignments;
        this.activity = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 1) {
            return new ITViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
        } else {
            return new ITViewHolderWhite(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_white, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        InformationTechnology assignment = assignments.get(position);

        if (holder instanceof ITViewHolder) {
            ITViewHolder viewHolder = (ITViewHolder) holder;
            viewHolder.textAssignment.setText(assignment.getAssignment());
            viewHolder.textGrade.setText(String.valueOf(assignment.getGrade()));
        } else {
            ITViewHolderWhite viewHolderWhite = (ITViewHolderWhite) holder;
            viewHolderWhite.textAssignmentWhite.setText(assignment.getAssignment());
            viewHolderWhite.textGradeWhite.setText(String.valueOf(assignment.getGrade()));
        }
    }

    public class ITViewHolder extends RecyclerView.ViewHolder {

        private TextView textAssignment, textGrade;

        private ITViewHolder(View view) {
            super(view);

            textAssignment = (TextView) view.findViewById(R.id.tv_assignment);
            textGrade = (TextView) view.findViewById(R.id.tv_grade);
        }
    }

    public class ITViewHolderWhite extends RecyclerView.ViewHolder {

        private TextView textAssignmentWhite, textGradeWhite;

        private ITViewHolderWhite(View view) {
            super(view);

            textAssignmentWhite = (TextView) view.findViewById(R.id.tv_assignment_white);
            textGradeWhite = (TextView) view.findViewById(R.id.tv_grade_white);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return (assignments.get(position).getType() == 1) ? 1 : 2;
    }

    @Override
    public int getItemCount() {
        return assignments.size();
    }
}