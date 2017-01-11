package com.androidjavapoint.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeListAdapter.CustomViewHolder> {

    private List<Employee> mEmployeeList;

    EmployeeListAdapter(List<Employee> mEmployeeList) {
        this.mEmployeeList = mEmployeeList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView employeeName;
        TextView employeeId;

        CustomViewHolder(View view) {
            super(view);
            employeeName = (TextView) view.findViewById(R.id.employeeName);
            employeeId = (TextView) view.findViewById(R.id.employeeId);
        }
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Employee employee = mEmployeeList.get(position);
        holder.employeeName.setText(employee.getEmployeeName());
        holder.employeeId.setText(String.valueOf(employee.getEmployeeId()));
    }

    @Override
    public int getItemCount() {
        return mEmployeeList.size();
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new CustomViewHolder(view);
    }
}
